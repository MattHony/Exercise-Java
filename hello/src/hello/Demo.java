package hello;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int foot;
		int inch;
//		double mi;
		Scanner in = new Scanner(System.in);
		System.out.print("请输入foot:");
		foot = in.nextInt();
		System.out.print("请输入inch:");
		inch = in.nextInt();
//		System.out.print("请输入对应米数:");
//		mi = in.nextFloat();
//		mi = (foot+inch/12.0)*0.3048;
		System.out.println("请输入对应身高:"+(foot+inch/12.0)*0.3048);
	}
//	finally{
//		in.close();
//	}
}
