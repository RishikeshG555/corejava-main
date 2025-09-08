package exception;

//import java.io.FileInputStream;
import java.io.FileNotFoundException;

class A{
	public void readfile() throws FileNotFoundException {
		//new FileInputStream("abc.text");
	}
}
public class Example8 {

	public static void main(String[] args) {
		A a=new A();
		try {
			a.readfile();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}

}
