package tickets;

import java.util.Scanner;

public class Wonder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number;
		int count=0;
		number=in.nextInt();
		while(number>0)
		{
//			number=number/10;
			number/=10;
			count+=1;
		}
		System.out.println("该数字为:"+count+"位数");

	}

}
