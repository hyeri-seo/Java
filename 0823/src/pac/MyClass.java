package pac; //자동으로 이클립스가 넣어줌. 클래스 파일의 맨~~위에

import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Date;
import java.util.Scanner;


//자바 io 패키지 밑에 있는 클래스들'만' import. 그 안에 있는 패키지들은 추적해서 import 하는 것은 아님
//java.*는 안 됨

public class MyClass {

		Scanner sc = new Scanner(System.in);
		public Date date1;
		java.util.Date date2;
		
		FileReader fr;
		FileWriter fw;
		
		public MyClass() {}

}
