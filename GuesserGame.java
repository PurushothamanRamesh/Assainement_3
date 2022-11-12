import java.util.Scanner;



class Guessers{
	int Guesser()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser Guess the number PLZ! ( 0 to 10)");
		int Gn=scan.nextInt();
		if(Gn<11) 
		{
			return Gn;
		}
		else 
		{
			System.out.println("TRY AGAIN");
			return Gn;
		}
			
	}
}


class Players
{
	 int Player()
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Player  Guess the Number ");
		int p=scan.nextInt();
		return p;
		
	}
}


class umpire
{
	int NRFG;
	int NRFP1;
	int NRFP2;
	int NRFP3;
	
	void collectfromGuesser()
	{
		Guessers NFG=new Guessers();
		 NRFG=NFG.Guesser();
		
	}
	void collectfromPlayer()
	{
		Players p1=new Players();
		Players p2=new Players();
		Players p3=new Players();
		
		
		NRFP1=p1.Player();
		NRFP2=p2.Player();
		NRFP3=p3.Player();
		
	}
	void cpmpare()
	{
		if(NRFG==NRFP1)
		{
			if(NRFG==NRFP2 && NRFG==NRFP3)
			{
				System.out.println("All players won the game");
			}
			else if(NRFG==NRFP2 )
			{
				System.out.println("Player 1 & Player2 won");
			}
			else if(NRFG==NRFP3)
			{
				System.out.println("Player 1 & Player3 won");
			}
			else
			{
			System.out.println("Player 1 won the game");
			}
		}
		else if(NRFG==NRFP2)
		{
			if(NRFG==NRFP3)
			{
				System.out.println("Player 2 & Player3 won");
			}
			else
			{
			System.out.println("Player 2 won the game");
			}
		}
		else if(NRFG==NRFP3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println(" Game Is Lost /Try Again!");
		}
		
	}
}
public class GuesserGame {
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Your code is 3232.....");
		System.out.println("WELCOME THE GAME OF GUESSER ");
		System.out.println("Enter your Code pls");
		int wl=scan.nextInt();
		if (wl==3232) 
		{
			System.out.println("welcome sir ");
		    System.out.println("your game is start");
		    
		   for(int i=0;i<3;i++)
		   {
			   System.out.println(" ");
		   }
		    
		   System.out.println("hello");
		   umpire umpire=new umpire(); 
		   umpire.collectfromGuesser();
		   umpire.collectfromPlayer();
		   umpire.cpmpare();
		    
		   
		}
		else 
		{
			System.out.println("You are entering the Wrong one ");
			System.out.println("Try again");
		}

	}

}
