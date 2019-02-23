package test1;

import java.util.Scanner;

public class TestClass {
	 int mars(String s) {
        String sos = "SOS";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != sos.charAt(i % 3)){
            	count++;
            }
        }
        return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the message in capitals");
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		TestClass t=new TestClass();
		int res=t.mars(s1);
		
		System.out.println(String.valueOf(res));
	}

}
