package stringex;

public class Example8 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		sb.insert(0, 'a');
		sb.reverse();
		System.out.println(sb);
		StringBuilder sbi = new StringBuilder("bye");
		sbi.append("asdfgh");
		System.out.println(sbi);
	}
}

