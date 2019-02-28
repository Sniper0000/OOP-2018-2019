package ie.dit;

public class Main
{	

	public void helloProcessing()
	{
		String[] a = {"MAIN"};
		
		//tell program to run java file named HelloProcessing
        processing.core.PApplet.runSketch( a, new HelloProcessing());
	}
	
	public void bugZap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new BugZap());
	}

	public void loops()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Loops());
		
	}
	
	public void arrays()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Arrays());
		
	}
<<<<<<< HEAD

	public void lab4()
	{
		String[] a = {"MAIN"};
		processing.core.PApplet.runSketch( a, new lab4());
	}

	public void starMap()
	{
		String[] a = { "MAIN" };
		processing.core.PApplet.runSketch(a, new StarMap());
=======
	
	public void starMap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new StarMap());
		
>>>>>>> 2463b2be8917749d4f351bb20f410a3ba554f29c
	}

	public static void main(String[] args)
	{
		Main main = new Main();
<<<<<<< HEAD
		main.starMap();						
=======
		main.starMap();			
>>>>>>> 2463b2be8917749d4f351bb20f410a3ba554f29c
	}
}