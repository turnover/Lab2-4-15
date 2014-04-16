
public class RandomNum 
{
	public int computerNum1;
	public int GetANumber_Between_1_and_10(int high)
	{
		computerNum1 = 1 + (int) (Math.random()*high);
		return computerNum1;
	}
	public int GetANumber_Between_1_and_10()
	{
		computerNum1 = 1 + (int) (Math.random()*10);
		return computerNum1;
	}
}
