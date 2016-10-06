class Cow implements Animal 
{     
	protected String MYSOUND;
	protected String MYTYPE;

	public Cow ()
	{
		MYSOUND = "unknown";
		MYTYPE = "unknown";
	}

	public Cow (String type, String sound)
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