package has_a;

public class Engine {
	int hp;
	int strokes;
	String type;
	public Engine()
	{
		
	}
Engine(int hp,int strokes, String type )
{
	this.hp=hp;
	this.strokes=strokes;
	this.type=type;
}
public void start()
{
	System.out.println("Start the engine");
}

}
