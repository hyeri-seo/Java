
public class StringBufferTest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(100);
		sb.append("abcdefg");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.insert(1, 'p');
		System.out.println(sb);
		System.out.println(sb.length());
		sb.delete(2, 5);
		System.out.println(sb);
		sb.replace(0, 2, "ta");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.setCharAt(2, 'E');
		System.out.println(sb);
		System.out.println(sb.length());
		sb.setLength(3);
		System.out.println(sb);
	}

}
