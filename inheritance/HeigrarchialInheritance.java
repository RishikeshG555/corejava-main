package inheritance;

public class HeigrarchialInheritance {

	public static void main(String[] args) {
		
		Television tel = new Television();
		tel.id=1;
		tel.Start();
		tel.VolumeIncrease();
		tel.VolumeDecrease();
		tel.Stop();
		
		SmartTelevision sm = new SmartTelevision();
		sm.id=3;
		sm.Start();
		sm.VolumeDecrease();
		sm.app();
		sm.VolumeIncrease();
		sm.Stop();
		
		AC a = new AC();
		a.id=2;
		a.Start();
		a.TempIncrease();
		a.TempDecrease();
		a.Stop();
	}

}
