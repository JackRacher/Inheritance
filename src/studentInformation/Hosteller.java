package studentInformation;

public class Hosteller extends Student
{
	double hostelFee;
	
	Hosteller()
	{
		System.out.println("This is hostller default constructor.");
	}

	public Hosteller(int studentId, String name, double examFee, double hostelFee) 
	{
		super(studentId, name, examFee);
		this.hostelFee = hostelFee;
	}

	public String displayDetails() 
	{
		return "Hosteller [hostelFee=" + hostelFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";
	}
	
	public double payFee(double amount)
	{
		if((hostelFee + examFee) > amount)
		{
			System.out.print("You have to pay: ");
			return (hostelFee + examFee) - amount;
		}
		else
		{
			System.out.print("You will get amount: ");
			return (hostelFee + examFee) - amount;
		}
		
		
	}
	
	
	

}
