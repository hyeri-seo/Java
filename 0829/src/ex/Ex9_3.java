package ex;

public class Ex9_3 {
	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.5\\work\\PathSeparateTest.java";
		//escape가 아니라는 걸 보여주기 위해서 역슬래시를 두 개씩 써줌
		String path = "";
		String fileName = "";
		/*
		 * (1) 알맞은 코드를 넣어 완성하시오.
		 */
		int pos = fullPath.lastIndexOf("\\");
		
		if(pos!=1) {
			path = fullPath.substring(0, pos);
			fileName = fullPath.substring(pos+1);
		}
		
		System.out.println("fullPath:" + fullPath);
		System.out.println("path:" + path);
		System.out.println("fileName:" + fileName);
	}
}

//fullPath:c:\jdk1.5\work\PathSeparateTest.java
//path:c:\jdk1.5\work
//fileName:PathSeparateTest.java