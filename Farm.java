class Farm 
{     
	private Animal[] animals;

	public Farm ()
	{
		animals = new Animal[3];
		animals[0] = new NamedCow ("Elsie","cow","moo");
		animals[1] = new Chick ("chick","cluck");
		animals[2] = new Pig ("pig","oink");
	}

	public void getSounds ()
	{
		for (int i = 0; i < animals.length; i++)
			System.out.println(animals[i].getType() + " goes " + animals[i].getSound());
		System.out.println("The cow is known as " + ((NamedCow)animals[0]).getName());
	}
}