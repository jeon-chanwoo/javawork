package _01_constructor;

public class T01_api_tv {
	//속성
	String company;
	String model;
	int channel;
	
	 T01_api_tv(String company, String model){
		 this.company = company;
		 this.model = model;
	 }
	 T01_api_tv(String company, String model,int channel){
		 this.company = company;
		 this.model = model;
		 this.channel = channel;
	 }
}
