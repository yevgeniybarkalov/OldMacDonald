class NamedCow extends Cow
{
	private String MYNAME;

	public NamedCow ()
	{
		MYNAME = "unknown";
		MYTYPE = "unknown";
		MYSOUND = "unknown";
	}

	public NamedCow (String name, String type, String sound)
	{
		MYNAME = name;
		MYTYPE = type;
		MYSOUND = sound;
	}

	public String getName()
	{
		return MYNAME;
	}
}