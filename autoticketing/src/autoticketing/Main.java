package autoticketing;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		Scanner in = new Scanner(System.in);
		int amount=0;
		int balance=0;
		while(true)
		{
			System.out.println("请投入纸币为:");
			amount=in.nextInt();
			balance = balance+amount;
			if(balance>=10)
			{
				
//				打印车票
				System.out.print("=================");
				System.out.print("***Java城际高铁专线***");
				System.out.print("***  随机座位票  ***");
				System.out.print("***  票价10元  ***");
				System.out.print("=================");
				// 计算并打印找零
				System.out.println("找零:"+(balance-10));
				balance=0;
			}
//			else
//			{
//				
//			}
		}
	}

}
