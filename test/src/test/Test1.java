package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 extends IPInfo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<IPInfo> ipInfoList = new ArrayList<IPInfo>();
		
	
		
		ipInfoList.add(new IPInfo("123.123.123.123", "홍길동"));
		ipInfoList.add(new IPInfo("123.123.123.120", "조훈희"));
		ipInfoList.add(new IPInfo("123.123.123.121", "고길순"));
		
		System.out.println("ip 입력 : ");
		String ip = sc.next();

		
		
//		for(IPInfo asd : ipInfoList) {
//			if(asd.getIp().equals(ip)) {
//				System.out.println(asd);
//				return;
//			}
//		}
//		
		for(int i=0; i < ipInfoList.size(); i++) {
			if(ipInfoList.get(i).getIp().equals(ip)) {
				System.out.println(ipInfoList.get(i));
				break;
			}
		}
		System.out.println("일치하는 ip 사용자가 없습니다.");
	}
}

