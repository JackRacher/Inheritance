package inheritancePrograms2;

abstract class Teacher
{
	void lesson()
	{
		
	}
}

interface Politician
{
	void speach();
}

class Speaker extends Teacher implements Politician
{
	void lesson()
	{
		System.out.println("Teaches a lesson");
	}
	
	public void speach()
	{
		System.out.println("Tell the speach");
	}
	
}
public class AbstractInterfaceExample 
{
	public static void main(String[] args) 
	{
		Speaker speaker = new Speaker();
		speaker.lesson();
		speaker.speach();
		
	}

}
