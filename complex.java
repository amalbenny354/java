public class complex
{
	double real;
	double img;
	complex(double r, double i)
	{
		this.real=r;
		this.img=i;
	}
	complex(){}
	complex sum(complex c1, complex c2)
	{
		complex temp=new complex();
		temp.real=c1.real+c2.real;
		temp.img=c1.img+c2.img;
		return temp;
	}

	public static void main(String args[])
	{
		complex c1=new complex(23,53);
		complex c2=new complex(32,35);
		complex temp1=new complex();
		temp1=temp1.sum(c1,c2);
		System.out.println("sum is :"+temp1.real+"+i"+temp1.img);
	}
}
