package _06_Network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class T01_Network {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println(localhost+localhost.getHostName());
			
			InetAddress googleHost = InetAddress.getByName("google.com");
			System.out.println(googleHost+googleHost.getHostName());
			
			InetAddress[] naverHost = InetAddress.getAllByName("naver.com");
			for(InetAddress i : naverHost) {
				System.out.println(i.getHostAddress());	
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
