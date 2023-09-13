package service;

import java.util.List;
import java.util.Scanner;

import dao.PlayerDAO;
import dao.TeamDAO;
import dto.Player;
import dto.Team;

public class BaseBallService {
	private PlayerDAO playerDAO;
	private TeamDAO teamDAO;

	public BaseBallService() {
		playerDAO = new PlayerDAO();
		teamDAO = new TeamDAO();
	}

	// 팀 등록
	public void regTeam() {
		System.out.println("[팀 등록]");
		System.out.print("팀명:");
		String teamName = sc.nextLine();
		System.out.println("연고지:");
		String local = sc.nextLine();
		teamDAO.insertTeam(new Team(null, teamName, local));
	}

	// 팀 조회(팀명으로)
	public void teamInfo() {
		System.out.println("[팀 조회]");
		System.out.print("팀명: ");
		String teamName = sc.nextLine();
		Team team = teamDAO.selectTeam(teamName);
		System.out.println(team);
	}

	// 팀 목록 조회
	public void teamListInfo() {
		System.out.println("[팀 조회]");
		List<Team> teamList = teamDAO.selectTeamList();
		for (Team team : teamList) {
			System.out.println(team);
		}
	}

	// 선수 등록
	public void regPlayer() {
		System.out.println("[선수 등록]");
		System.out.print("선수명: ");
		String playerName = sc.nextLine();
		System.out.print("등 번호: ");
		Integer backNum = Integer.parseInt(sc.nextLine());

		// 팀 선택
		System.out.println("팀 선택:");
		List<Team> teamList = teamDAO.selectTeamList();
		for (Team team : teamList) {
			System.out.println(team.shortString());
		}
		System.out.print("선택>>");
		Integer teamNum = Integer.parseInt(sc.nextLine());
		playerDAO.insertPlayer(new Player(null, playerName, backNum, teamNum, null));
	}

	// 특정 선수 조회(이름으로)
	public void playerInfoByName() {
		System.out.println("[이름으로 선수 조회]");
		System.out.print("선수명: ");
		String playerName = sc.nextLine();

		// PlayerDAO에서 선수를 이름으로 조회하는 메서드 호출
		List<Player> playerList = playerDAO.selectPlayerByName(playerName);
		for (Player player : playerList) {
			System.out.println(player);
		}
	}

	// 특정 선수 조회(등 번호로)
	public void playerInfoByBacknum() {
		System.out.println("[등 번호으로 선수 조회]");
		System.out.print("등 번호: ");
		Integer backnum = Integer.parseInt(sc.nextLine());
		// PlayerDAO에서 선수를 이름으로 조회하는 메서드 호출
		List<Player> playerList = playerDAO.selectPlayerByBacknum(backnum);
		for (Player player : playerList) {
			System.out.println(player);
		}
	}

	// 특정 선수 조회(번호로)
	public void playerInfoByNum() {
		System.out.println("[선수 번호으로 선수 조회]");
		System.out.print("선수 번호: ");
		Integer num = Integer.parseInt(sc.nextLine());
		Player player = playerDAO.selectPlayerByNum(num);
		// PlayerDAO에서 선수를 이름으로 조회하는 메서드 호출
		System.out.println(player);
	}

	// 특정 팀 소속 선수 목록 조회
	public void playerListInTeam() {
		System.out.println("[팀 소속 선수 목록 조회]");
		System.out.print("팀명을 입력해주세요.: ");
		String teamName = sc.nextLine();

		// PlayerDAO에서 해당 팀 소속 선수 목록을 조회하는 메서드 호출
		List<Player> playerList = playerDAO.selectPlayerByTeam(teamName);
		for(Player player : playerList) {
			System.out.println(player);
		}
	}

	Scanner sc = new Scanner(System.in);

	public int menu() {
		System.out.println("[야구 팀/선수 등록/조회]");
		System.out.println("1.팀 등록");
		System.out.println("2. 특정 팀 조회");
		System.out.println("3. 팀 목록 조회");
		System.out.println("-----------------------");
		System.out.println("4.선수 등록");
		System.out.println("5. 특정 선수 조회(이름으로)");
		System.out.println("6. 특정 선수 조회(등 번호로)");
		System.out.println("7. 특정 선수 조회(번호로)");
		System.out.println("8. 특정 팀 선수 목록 조회");
		System.out.println("선택>>");
		return Integer.parseInt(sc.nextLine());
	}
}
