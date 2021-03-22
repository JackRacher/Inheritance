package studentInformation;

public class DayScholor extends Student 
{
	double transportFee;
	
	DayScholor()
	{
		System.out.println("This is Daysscholor default constructor.");
	}

	public DayScholor(int studentId, String name, double examFee, double transportFee) 
	{
		super(studentId, name, examFee);
		this.transportFee = transportFee;
	}

	public String displayDetails() 
	{
		return "DayScholor [transportFee=" + transportFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";
	}
	
	public double payFee(double amount)
	{
		if((transportFee + examFee) > amount)
		{
			System.out.print("You have to pay: ");
			return (transportFee + examFee) - amount;
		}
		else
		{
			System.out.print("You will get amount: ");
			return (transportFee + examFee) - amount;
		}
		
		
	}
	
	
	
	
	
	

}
