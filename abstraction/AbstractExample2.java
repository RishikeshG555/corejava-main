package abstraction;

abstract class quad{
	abstract void area();
	abstract void volume();
}
class square extends quad{

	int s;
	public square(int s) {
		this.s=s;
	}
	@Override
	void area() {
		System.out.println("area of square is "+(s*s));
		
	}

	@Override
	void volume() {
		System.out.println("area of square is "+(s*s*s));
		
	}
	
}
class rect extends quad{

	int l,b,h;
	public rect(int l,int b,int h) {
		this.l=l;
		this.b=b;
		this.h=h;
	}
	@Override
	void area() {
		System.out.println("area of rectangle is "+(l*b));
		
	}

	@Override
	void volume() {
		System.out.println("area of rectangle is "+(l*b*h));
		
	}
	
}
public class AbstractExample2 {
	public static void main(String[] args) {
		square sq=new square(5);
		rect re=new rect(2,3,4);
		sq.area();
		sq.volume();
		re.area();
		re.volume();
		quad tri=new quad() {
			int l=2,b=5,h=8;
			void area() {
				System.out.println("area of triangle is "+(0.5*l*b));
				
			}
			void volume() {
				System.out.println("area of triangle is "+(0.5*l*b*h));
				
			}
		};
		tri.area();
		tri.volume();
	}

}
