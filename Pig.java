class Pig implements Animal
{     
	private String MYSOUND;
	private String MYTYPE;

	public Pig ()
	{
		MYSOUND = "unknown";
		MYTYPE = "unknown";
	}

	public Pig (String type, String sound)
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