package lab;

import java.util.Random;

public class Coin{
	protected String coinValue;
	
	public String getCoinValue() {
		return coinValue;
	}
	
	 public String flip(){
		 Random coin = new Random();
		 int coinFace = coin.nextInt(2);
		 if (coinFace == 1) {
			
			coinValue = "heads";
		 }
		else{
			
			coinValue = "tails";
			
		 }
		 return coinValue;
		 
	 }

}
