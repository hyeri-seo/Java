package com.kosta.shop;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.kosta.order.Order;
import com.kosta.product.Goods;

// 주문하고 나서 order 테이블만 늘려주는 게 아니라
// goods의 재고량을 줄여주어야 함
public class Shop {

	public Connection getConnection() {
		Connection conn = null;
		try {
			Properties db = new Properties();
			db.load(new FileInputStream("db.properties"));
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(db.getProperty("url"), db.getProperty("user"),
					db.getProperty("password"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public void close(Connection conn) {
		try {
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int order(Order order) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		stockUpdate(order.getProductCode(), order.getAmount());
		String sql = "insert into orders (no, customer, productCode, amount, isCanceled) " + "values(?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, order.getNo());
			pstmt.setString(2, order.getCustomer());
			pstmt.setString(3, order.getProductCode());
			pstmt.setInt(4, order.getAmount());
			pstmt.setBoolean(5, order.isCanceled());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		close(conn);
		return order.getNo();
	}

	public int addProduct(Goods goods) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "insert into goods (code, name, price, stock, category) " + "values(?,?,?,?,?)";
		int cnt = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, goods.getCode());
			pstmt.setString(2, goods.getName());
			pstmt.setInt(3, goods.getPrice());
			pstmt.setInt(4, goods.getStock());
			pstmt.setString(5, goods.getCategory());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		close(conn);
		return cnt;
	}

	public Goods findProductByCode(String code) {
		Connection conn = getConnection();
		Goods goods = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select code, name, price, stock, category from goods where code=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, code);
			rs = pstmt.executeQuery();
			if (rs != null && rs.next()) {
				goods = new Goods(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		close(conn);
		return goods;
	}

	public Order findOrderByNo(int orderNo) {
		Connection conn = getConnection();
		Order order = null;
		PreparedStatement pstmt = null;
		String sql = "select * from orders where no=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, orderNo);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		close(conn);
		return order;
	}

	public void stockUpdate(String code, int amount) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "update goods set stock=stock-? " + "where code=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, amount);
			pstmt.setString(2, code);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public int cancelOrder(int orderNo) {
		Order order = new Order(null, null, orderNo);
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "delete from orders where no=?";
		int cnt = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, order.getNo());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		close(conn);
		return cnt;
	}

	public void printAllOrderInfo() {
		Connection conn = getConnection();
		List<Order> orderList = printAllOrderList(conn);
		for(Order order : orderList) {
			System.out.println(order);
		}
		close(conn);
	}
	
	public List<Order> printAllOrderList(Connection conn) {
		List<Order> orderList = new ArrayList<>();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from orders";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs != null) {
				while (rs.next()) {
					Integer no = rs.getInt(1);
					String customer = rs.getString(2);
					String productcode = rs.getString(3);
					Integer amount = rs.getInt(4);
					boolean isCanceled = rs.getBoolean(5);
					orderList.add(new Order(no, customer, productcode, amount, isCanceled));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		close(conn);
		return orderList;
	}

	public void printAllProductInfo() {
		List<Goods> goodsList = new ArrayList<>();
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from goods";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs != null) {
				while (rs.next()) {
					String code = rs.getString(1);
					String name = rs.getString(2);
					int price = rs.getInt(3);
					int stock = rs.getInt(4);
					String category = rs.getString(5);
					goodsList.add(new Goods(code, name, price, stock, category));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		for (Goods goods : goodsList) {
			System.out.println(goods);
		}
		close(conn);
	}

	// 이 외에도 주문 건수, 주문합계금액 계산 필요함
	public void printOrderDetailsByCustomerAndIsCanceled(String customer, String isCanceled) {
		Connection conn = getConnection();
		String sql = "select o.customer, count(*), sum(g.price*o.amount) " + "from orders o join goods g "
				+ "where customer=? and isCanceled=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, customer);
			if (isCanceled == "정상") {
				pstmt.setBoolean(2, true);
				rs = pstmt.executeQuery();
				if (rs != null && rs.next()) {
					String customerName = rs.getString(1);
					Integer cnt = rs.getInt(2);
					Integer tot = rs.getInt(3);
					System.out.println(
							String.format("%s님의 정상주문 건수는: %d건이고, 정상주문합계금액은: %d원 입니다.", customerName, cnt, tot));
				} else {
					pstmt.setBoolean(2, false);
					rs = pstmt.executeQuery();
					if (rs != null && rs.next()) {
						String customerName = rs.getString(1);
						Integer cnt = rs.getInt(2);
						Integer tot = rs.getInt(3);
						System.out.println(
								String.format("%s님의 취소주문 건수는: %d건이고, 취소주문합계금액은: %d원 입니다.", customerName, cnt, tot));
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		close(conn);
	}

}
