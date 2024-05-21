package _05_interface;

public class DataAccessRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oracle o1 = new Oracle();
		o1.update();
		o1.delete();
		o1.select();
		o1.insert();
		
		MySql m1 = new MySql();
		m1.update();
		m1.delete();
		m1.select();
		m1.insert();
	}

}
