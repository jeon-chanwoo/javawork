package _01_constructor;

public class T01_main_tv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 T01_api_tv tv1 = new  T01_api_tv("삼숭","sm1");
		 T01_api_tv tv2 = new  T01_api_tv("엘지","lg1");
		 T01_api_tv tv3 = new  T01_api_tv("hp","hp1",3);
		 
		 System.out.println(tv1.company+"  "+tv1.model);
		 System.out.println(tv2.company+"  "+tv2.model);
		 System.out.println(tv3.company+"  "+tv3.model+
				 "    "+tv3.channel);
	}

}
