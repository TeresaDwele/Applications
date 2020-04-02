package lab;

import javax.swing.JOptionPane;

public class CoinGame implements Game {
	public int numPlayers;
	public String coinValue;
	Player player1 = new Player();
	Player player2 = new Player();
	Coin coin = new Coin();
	
	public CoinGame() {
		numPlayers = 2;
		player1.getName();
		player1.getGuess();
		player2.getName();
	}
	
	public String[] getPlayers(){
		String[] players = new String[numPlayers];
		return players;
	}

	
	@Override
	public int getNumPlayers() {
		return 0;
	}

	@Override
	public void setNumPlayers(int numPlayers) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void instructions() {
		JOptionPane.showMessageDialog(null, "The following are the instructions for the game \n 1.Player one enters their name first.\n 2. Player enters their name 3.\n Players 1 enters their guess.");
		
	}

	public Player gameWinner(Player player1, Player player2){
		
		Coin coin = new Coin();
		coinValue = coin.flip();
		
		if(player1.getGuess() == coinValue){
			return player1;
		}
		else{
			return player2;
		}
	}
	
	public String coinValue(){
		return coinValue;
	}

}
