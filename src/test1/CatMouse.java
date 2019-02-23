package test1;
import java.util.Scanner;
public class CatMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of choices");
		int n=sc.nextInt();
		while(n!=0){
		System.out.println("enter cat A position");
		int c1 =sc.nextInt();
		System.out.println("enter cat B position");
		int c2=sc.nextInt();
		System.out.println("enter mouse position");
		int m=sc.nextInt();
	       
		if(Math.abs(m-c1)==Math.abs(m-c2)){
			System.out.println("mouse c");
		}
		else if(Math.abs(m-c2)<Math.abs(m-c1)){
			System.out.println("cat B");
		}
			else{
				System.out.println("Cat A");
			}
		n--;
		}
	}
}

