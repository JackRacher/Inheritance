package inheritancePrograms;

interface Politician extends Teacher
{
	void speach();
	void message();
}

interface Teacher
{
	void lesson();
	
}

interface SocialWorker
{
	void service();
}

class Speaker implements Politician, SocialWorker
{
	public void speach()
	{
		System.out.println("Hello Public");
	}
	
	public void service()
	{
		System.out.println("How are you");
	}
	
	public void lesson()
	{
		System.out.println("I am taking a lesson.");
	}
	
	public void message()
	{
		System.out.println("Hello");
	}
}
public class InterfaceExample 
{
	public static void main(String[] args) 
	{
		Speaker speaker = new Speaker();
		Politician politician = new Speaker();
		speaker.speach();
		politician.speach();
	}
}
