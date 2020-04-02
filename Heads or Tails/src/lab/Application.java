package lab;


import javax.swing.JOptionPane;



public class Application{

	public static void main(String[] args) {
		
		Player player1 = new Player();
		String name = JOptionPane.showInputDialog("please enter player one's name");
		player1.setName(name);
		
		String guess = JOptionPane.showInputDialog("Do you want heads or tails?");
		
		Player player2 = new Player();
		name = JOptionPane.showInputDialog("please enter player two's name"); 
		player2.setName(name);
		
		switch (guess) {
		case ("heads"):
			player1.setGuess("heads");
			player2.setGuess("tails");
		break;
		case ("tails"):
			player1.setGuess("tails");
			player2.setGuess("heads");
		break;
		default:
			guess = JOptionPane.showInputDialog("Error please enter either heads or tails?");
		break;
		}
		
		CoinGame coinGame = new CoinGame();
		coinGame.instructions();
		Player game = coinGame.gameWinner(player1, player2);
		String winner =game.name;
		
		JOptionPane.showMessageDialog(null, "The winning selection is " + coinGame.coinValue() + " and the winner is " + winner);
		System.exit(0);
			
		 
	}
}
