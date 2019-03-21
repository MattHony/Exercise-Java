package hello;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello 杭州!");
//		Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
//		System.out.println("echo:" + in.nextLine());
//		System.out.println("2+3 ="  +5+3);
		int price=0;
		int amount = 100;
				
		System.out.print("请输入票面:");
		price = in.nextInt();
//		count = in.nextFloat();
		
		System.out.print("请输入金额:");
		amount = in.nextInt();
//		System.out.println("9+"+price+"=" + (40 - price));
		System.out.println(price+"-"+ amount+ "="+ (price-amount));
		
	}

}
