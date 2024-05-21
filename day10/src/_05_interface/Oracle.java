package _05_interface;

public class Oracle implements DataAccess {

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("오라클 데이터를 선택합니다.");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("오라클 데이터를 입력합니다");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("오라클 데이터를 업데이트 합니다.");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("오라클 데이터를 삭제합니다.");
	}

}
