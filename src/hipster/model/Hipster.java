package hipster.model;

public class Hipster
{
	private String name;
	private String [] hipsterPhrases;

	
	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[4];
		setupArray();
	}
	
	private void setupArray()
	{
		hipsterPhrases[0] = "Bro, don't be mainstream";
		hipsterPhrases[1] = "I listened to Daft Punk before it was cool";
		hipsterPhrases[2] = "You eat meat? I'm a vegan.";
		hipsterPhrases[3] = "I like that Scarf dude.";
	}
	

	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String[] getHipsterPhrases()
	{
		return hipsterPhrases;
	}
	
	public void setHipsterPhrases(String[] hipsterPhrases)
	{
		this.hipsterPhrases = hipsterPhrases;
	}

	
}
