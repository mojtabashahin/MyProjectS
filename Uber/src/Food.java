
public class Food {
	private String foodName;
	public Food (String name)
	{
		foodName=name;
	}
	public boolean addFood()
	{
		if (foodName.length()>=6 && foodName.length()<=30)
			return true;
		else 
			return false;
	}
}
