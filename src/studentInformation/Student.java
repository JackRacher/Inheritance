package studentInformation;

public class Student 
{
	int studentId;
	String name;
	double examFee;

	public String displayDetails() 
	{
		return "Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
	}
	
	public double payFee(double amount)
	{
		return amount;
		
	}
	
	Student()
	{
		System.out.println("This is student default constructor.");
	}

	public Student(int studentId, String name, double examFee) 
	{
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
	}

}
