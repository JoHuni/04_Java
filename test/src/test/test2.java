package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class test2 {
    public static void main(String[] args) {
//    	String str = "banana";
//    	for(int i = 0; i < str.length(); i++) {
//    		char ch = str.charAt(i);
//    		switch(ch) {
//    		case 'a','e','i','o','u' :
//    			System.out.println(ch + ": 모음입니다");
//    			break;
//    		default:
//    			System.out.println(ch + ": 자음입니다");
//    			break;
//    	}
//    }
//    	while(i < str.length()) {
//    		char ch = str.charAt(i);
//    		
//    		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//    			System.out.println(ch + ": 모음입니다.");
//    			
//    		}
//    		else {
//    			System.out.println(ch + ": 자음입니다.");
//    		}
//    		i++;
//    	}
//    	while(i < str.length()) {	
//    		char ch = str.charAt(i);
//    		switch(ch) {
//    		case 'a':
//    			System.out.println(ch + ": 모음입니다");
//    			i++;
//    			break;
//    		case 'e':
//    			System.out.println(ch + ": 모음입니다");
//    			i++;
//    			break;
//    		case 'i':
//    			System.out.println(ch + ": 모음입니다");
//    			i++;
//
//    			break;
//    		case 'o':
//    			System.out.println(ch + ": 모음입니다");
//    			i++;
//
//    			break;
//    		case 'u':
//    			System.out.println("모음입니다");
//    			i++;
//
//    			break;
//    		default:
//    			System.out.println(ch + ": 자음입니다");
//    			break;
//    		}
//    	}
    	List<String> strArr = new ArrayList<String>(6);
    	Random random = new Random();
    	for(int i = 0; i < 5; i++) {
    		Integer rNum = random.nextInt(10);
    		strArr.add(rNum.toString());
    	}
    	System.out.println(strArr);
    }
}
