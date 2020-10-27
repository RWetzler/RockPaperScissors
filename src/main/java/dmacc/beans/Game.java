package dmacc.beans;
import java.util.Random;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Game {
	private String player1;
	private String computerPlayer;
	private String winner;

	public Game(String player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayerToRandom();
		this.determineWinner();
	}

	private void setComputerPlayerToRandom() {
		Random random = new Random();
		int randomNumber = random.nextInt(4-1)+1;
		if(randomNumber == 1) {
			setComputerPlayer("rock");
		}
		else if(randomNumber == 2) {
			setComputerPlayer("scissors");
		}
		else if(randomNumber == 3)  {
			setComputerPlayer("paper");
		}
	}
	private void determineWinner() {
		if(getPlayer1().equalsIgnoreCase("rock") && getComputerPlayer().equalsIgnoreCase("rock")) {
			setWinner("tie");
	}
		else if(getPlayer1().equalsIgnoreCase("rock") && getComputerPlayer().equalsIgnoreCase("scissors")) {
			setWinner("player1");
		}
		else if(getPlayer1().equalsIgnoreCase("rock") && getComputerPlayer().equalsIgnoreCase("paper")) {
			setWinner("computerPlayer");
		}
		else if(getPlayer1().equalsIgnoreCase("scissors") && getComputerPlayer().equalsIgnoreCase("scissors")) {
			setWinner("tie");
	}
		else if(getPlayer1().equalsIgnoreCase("scissors") && getComputerPlayer().equalsIgnoreCase("paper")) {
			setWinner("player1");
		}
		else if(getPlayer1().equalsIgnoreCase("scissors")&& getComputerPlayer().equalsIgnoreCase("rock")) {
			setWinner("computerPlayer");
		}
		else if(getPlayer1().equalsIgnoreCase("paper") && getComputerPlayer().equalsIgnoreCase("paper")) {
			setWinner("tie");
	}
		else if(getPlayer1().equalsIgnoreCase("paper") && getComputerPlayer().equalsIgnoreCase("rock")) {
			setWinner("player1");
		}
		else if(getPlayer1().equalsIgnoreCase("paper") && getComputerPlayer().equalsIgnoreCase("scissors")) {
			setWinner("computerPlayer");
		}
		else {
			setWinner("error");
		}
		
	}
}

	
