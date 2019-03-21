package hello;

import java.util.Scanner;

public class Smart {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x=0, y=0, z=0, max=0;
		System.out.println("请输入x,y,z:"+x+y+z);
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();		
		if (x>y)
		{
			max = x;
			if(x>z)
				max=x;
//			该写法较为简单
			max=z;
//			else
//			{
//				max=z;
//			}
		}
		else 
		{	
			max = y;
			if(y>z);
				max=y;
			max=z;
		}
		System.out.println("the max is:"+ max);			
	}
}
