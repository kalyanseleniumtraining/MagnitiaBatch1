package firstPackage;

public class SecondClass {
	
	public int mul(int a,int b)
	{
		
		int c=a*b;
		return c;
	}
	
	
	public static void main(String[] args) {
		SecondClass x=new SecondClass();
		int result=x.mul(10, 20);
		System.out.println(result);
	}
	

}
