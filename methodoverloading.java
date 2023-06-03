import java.util.*;

class methodoverloading
{
	public static void main(String args[])
	{
		int side,len,brd;
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter length");
		side=input.nextInt();
		
		System.out.println("enter length and bredth");
		len=input.nextInt();
		brd=input.nextInt();

		A object=new A();
		System.out.println("area of square is "+ object.area(side));
		System.out.println("area of rectangle is "+ object.area(len,brd));
	}
}

class A
{
	int a,b;
	
	int area(int side)
	{
		this.a=side;
		return(side*side+);
	}
	
	int area(int len,int brd)
	{
		this.a=len;
		this.b=brd;
		return(len*brd);
	}
}




