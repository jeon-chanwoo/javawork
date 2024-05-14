package _03_tv;

public class T01_main_tv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T01_api_tv tv1 = new T01_api_tv();
		
		System.out.println("회사명 : "+tv1.company);
		System.out.println("모델명 : "+tv1.model);
		System.out.println("사이즈 : "+tv1.inch+"인치 입니다.");
		
		
		tv1.power();
		System.out.println("전원 : "+tv1.power);
		System.out.println("현재 채널 : "+tv1.channelUp());
		System.out.println("현재 채널 : "+tv1.channelUp());
		System.out.println("현재 채널 : "+tv1.channelUp());
		System.out.println("현재 채널 : "+tv1.channelDown());
		System.out.println("현재 채널 : "+tv1.channelDown());
		System.out.println("음량변경 : "+tv1.vol(12));
		tv1.power();
		System.out.println("전원 : "+tv1.power);
		
	}

}
