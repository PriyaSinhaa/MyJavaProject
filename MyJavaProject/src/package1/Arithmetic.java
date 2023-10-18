package package1;

public class Arithmetic {
	
	public int sum(int a, int b)
	{
		return(a+b);
	}
	public int subtract(int a, int b)
	{
		return(a-b);
	}

	public int multi(int c, int d)
	{
		return(c*d);
	}
	public int divi(int c, int d)
	{
		return(c/d);
		
	}
	public static void main(String[] args) 
	{
		
		Arithmetic obj1=new Arithmetic();
		int a= obj1.sum(obj1.sum(10,2),2);
		int b= obj1.subtract(a,2);
		int c=obj1.multi(b,2);
		int d=obj1.divi(c,2);
		
		System.out.println("Result"+"="+d );
			

	}

}
