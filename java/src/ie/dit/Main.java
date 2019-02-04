package ie.dit;

public class Main
{	
	public void helloProcessing()
	{
		String[] a = {"MAIN"};
		
		//tell program to run java file named HelloProcessing
        processing.core.PApplet.runSketch( a, new HelloProcessing());
	}

	public static void main(String[] args)
	{
		Main main = new Main();
		main.helloProcessing();	
	}
}