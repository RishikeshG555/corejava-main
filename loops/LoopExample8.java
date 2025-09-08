package loops;

public class LoopExample8 {
	public static void main(String[] args) {
		for (int i = 65; i < 68; i++) {
			for (int j = 65; j < 91; j++) {
				for (int k = 65; k < 91; k++) {
					System.out.println((char)i+""+(char)j+""+(char)k);
				}
			}
		}
	}
}