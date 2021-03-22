package studentInformation;

public class Tester 
{
	public static void main(String[] args) 
	{
		Student student = new DayScholor(101, "Ram", 500, 10000);
		System.out.println(student.displayDetails());
		System.out.println(student.payFee(100000.0));
		Student student2 = new Hosteller(102, "Raju", 500, 25000);
		System.out.println(student2.displayDetails());
		System.out.println(student2.payFee(10000.0));
		
	}

}
