package lab;

public class Player {
	protected String name;
	protected String guess;
	
	public Player(){
		setName (name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGuess() {
		return guess;
	}
	public void setGuess(String guess) {
		this.guess = guess;
	}

}
