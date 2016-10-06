class Chick implements Animal
{
	private String MYSOUND;
	private String MYTYPE;

	public Chick ()
	{
		MYSOUND = "unknown";
		MYTYPE = "unknown";
	}

	public Chick (String type, String sound)
	{
		MYSOUND = sound;
		MYTYPE = type;
	}

	public String getSound()
	{
		return MYSOUND;
	}

	public String getType()
	{
		return MYTYPE;
	}
}