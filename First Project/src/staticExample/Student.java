package staticExample;

public class Student {
	
	
	String name;
	String phonenumber;
	String course;
	static String inst="Magnitia";
	
 
	public Student(String a,String b,String c)
	{
		name=a;
		phonenumber=b;
		course=c;
		
	}
	
	public static void main(String[] args) {
		
		
		Student s=new Student("XYZ","34987947985","SW");
		System.out.println(s.name);
		System.out.println(s.phonenumber);
		System.out.println(s.course);
		System.out.println(Student.inst);
		
		
		
		
		
	}
	
	

}
