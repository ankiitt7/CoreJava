package game;

public class Player {
	static String playerName="Mohan";
	public static void main(String[] args) {
		Game g=new Game();
		Weapon w=g.pressButton();
		w.use();
	}
}
