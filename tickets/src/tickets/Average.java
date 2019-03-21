package tickets;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number;
		int count=0;
		int sum=0;
		double ave=0;
//		number = in.nextInt();
//		while(number!=-1)
//		{
//			sum+=number;
//			count+=1;
//			number = in.nextInt();
//		}
		do {
			number = in.nextInt();
			if(number!=-1)
			{
				sum+=number;
				count+=1;
			}
		}
		while(number!=-1);
		ave = sum/count;
//		System.out.print("平均数为:"+(double)sum/count);
		System.out.print("平均数为:"+ave);
	}
	

}
