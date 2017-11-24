import java.util.*;
public class BattleBots
{
	public static void main (String [] args)
	{
	
		int menuChoice = 0; //int for menuOptions
		int userChoice = 0; //for selecting Robots
		String choice = ""; //String to parse Y/N option
		char userCh = 0; // char to parse Y/N Option
		boolean madeChoice = false; // bool to loop userChoice

		// Hack Var
		String keypress = "Starting Game!"; // for keypress.equal(""); which evaluates to true on hitting Enter..

		//CPU vars
		int cpuChoice = 0;

		//Player Vars
		String robot0Name = "Twixxy";
		int robot0ID = 0;
		double robot0HP = 80;
		double robot0ATK = 7;
		double robot0DEF = 2.5; 

		String robot1Name = "TeamKillalot";
		int robot1ID = 1;
		double robot1HP = 45;
		double robot1ATK = 6.6;
		double robot1DEF = 4.5;

		String robot2Name = "MetaMetaBot";
		int robot2ID = 2;
		double robot2HP = 60;
		double robot2ATK = 5;
		double robot2DEF = 3;

		String robot3Name = "ChineseMafiaThug";
		int robot3ID = 3;
		double robot3HP = 45;
		double robot3ATK = 6.2;
		double robot3DEF = 4.5;	

		String robot4Name = "WallTRON";
		int robot4ID = 4;
		double robot4HP = 75;
		double robot4ATK = 4;
		double robot4DEF = 4;

		String robot5Name = "ADDSALTR0STOR0";
		int robot5ID = 5;
		double robot5HP = 25;
		double robot5ATK = 30;
		double robot5DEF = 0.5;

		String cpuBot = "";
		int cpuID = 0;
		double cpuHP = 0;
		double cpuATK = 0;
		double cpuDEF = 0;
	
		
		String pBot = "";
		int pID = 0;
		double pHP = 0;
		double pATK = 0;
		double pDEF = 0;
		
		
		
 		double chance = 0;
		double damage = 0;
		int turn = 1;

		String instructions = "##########INSTRUCTIONS##################"
							+"\n#\t  To play BattleBots \t\t\t##"
							+"\n#\t  Select a Robot \t\t\t##"
							+"\n#\t  Then fight it out\t\t\t##"
							+"\n#\t  with the CPU to see Who wins\t\t##";

		String welcomeMessage = "##########Welcome to BattleBots#################"
							+"\n#\t\t 1. Play BattleBots \t\t##"
							+"\n#\t\t 2. View BB Rules \t\t##"
							+"\n#\t\t 3. Play Leaderboards(N/A)\t##"
							+"\n#\t\t 4. Quit Game \t\t\t##";
	Scanner sc = new Scanner(System.in);
		while (!madeChoice){
		System.out.println(welcomeMessage);
		menuChoice = sc.nextInt();
		
		switch (menuChoice){
			
				case 1: System.out.println("Select a Robot to Fight"
						  +"\n0: "+robot0Name
						  +"\n1: "+robot1Name
						  +"\n2: "+robot2Name
						  +"\n3: "+robot3Name
						  +"\n4: "+robot4Name);
					userChoice = sc.nextInt();
					madeChoice = true;
				switch (userChoice){
					case 0: System.out.println("You're selecting?\n" 
							+"\n Name: "+ robot0Name 
							+"\n HP: "+ robot0HP
							+"\n ATK: "+ robot0ATK
							+"\n DEF: "+ robot0DEF
							+"\n"+"Is This Right? (Y/N)");
							choice = sc.next();
							choice = choice.toLowerCase();
							userCh = choice.charAt(0);
							if (userCh == 'y')
							{
								userChoice = 0;
								madeChoice = true;
								pBot = robot0Name;
								pID = robot0ID;
								pHP = robot0HP;
								pATK = robot0ATK;
								pDEF = robot0DEF;
							}
							if (userCh == 'n')
								madeChoice = false;

				break;
					case 1: System.out.println("You're selecting?\n" 
							+"\n Name: "+ robot1Name 
							+"\n HP: "+ robot1HP
							+"\n ATK: "+ robot1ATK
							+"\n DEF: "+ robot1DEF
							+"\n"+" Is This Right? (Y/N)");
							choice = sc.next();
							choice = choice.toLowerCase();
							userCh = choice.charAt(0);
						if (userCh == 'y')
							{
								userChoice = 1;
								madeChoice = true;
								pBot = robot1Name;
								pID = robot1ID;
								pHP = robot1HP;
								pATK = robot1ATK;
								pDEF = robot1DEF;
							}
						if (userCh == 'n')
							madeChoice = false;
				break;
					case 2: System.out.println("You're selecting?\n" 
							+"\n Name: "+ robot2Name 
							+"\n HP: "+ robot2HP
							+"\n ATK: "+ robot2ATK
							+"\n DEF: "+ robot2DEF
							+"\n"+" Is This Right? (Y/N)");
							choice = sc.next();
							choice = choice.toLowerCase();
							userCh = choice.charAt(0);
						if (userCh == 'y')
							{
							userChoice = 2;
							madeChoice = true;
							pBot = robot2Name;
							pID = robot2ID;
							pHP = robot2HP;
							pATK = robot2ATK;
							pDEF = robot2DEF;
							}						
						if (userCh == 'n')
							madeChoice = false;
				break;
					case 3: System.out.println("You're selecting?\n" 
							+"\n Name: "+ robot3Name 
							+"\n HP: "+ robot3HP
							+"\n ATK: "+ robot3ATK
							+"\n DEF: "+ robot3DEF
							+"\n"+" Is This Right? (Y/N) ");
							choice = sc.next();
							choice = choice.toLowerCase();
							userCh = choice.charAt(0);
						if (userCh == 'y')
							{
								userChoice = 3;
								madeChoice = true;
								pBot = robot3Name;
								pID = robot3ID;
								pHP = robot3HP;
								pATK = robot3ATK;
								pDEF = robot3DEF;
							}
						if (userCh == 'n')
								madeChoice = false;
			break;
				case 4: System.out.println("You're selecting?\n" 
						+"\n Name: "+ robot4Name 
						+"\n HP: "+ robot4HP
						+"\n ATK: "+ robot4ATK
						+"\n DEF: "+ robot4DEF
						+"\n"+" Is This Right? (Y/N)");
						choice = sc.next();
						choice = choice.toLowerCase();
						userCh = choice.charAt(0);
					if (userCh == 'y')
						{
							userChoice = 4;
							madeChoice = true;
							pBot = robot4Name;
							pID = robot4ID;
							pHP = robot4HP;
							pATK = robot4ATK;
							pDEF = robot4DEF;
						}
					if (userCh == 'n')
						madeChoice = false;
			break;
				case 5: System.out.println("You're selecting?\n" 
						+"\n Name: "+ robot5Name 
						+"\n HP: "+ robot5HP
						+"\n ATK: "+ robot5ATK
						+"\n DEF: "+ robot5DEF
						+"\n"+" Is This Right? (Y/N)");
						choice = sc.next();
						choice = choice.toLowerCase();
						userCh = choice.charAt(0);

						if (userCh == 'y')
							{
							userChoice = 5;
							madeChoice = true;
							pBot = robot5Name;
							pID = robot5ID;
							pHP = robot5HP;
							pATK = robot5ATK;
							pDEF = robot5DEF;
							}
						if (userCh == 'n')
							madeChoice = false;
			break;
				default: System.out.println("You didn't pick a valid robot!");
			break;
				} // end robot choice switch
			break;
				case 2: System.out.println(instructions);
			break;
				case 3: System.out.println("Leaderboards coming soon!");
			break;
				default: System.out.println("You didn't pick a valid Option!");
				} // end user choice switch
		} // end while check
	
			//CPU Calcs
			cpuChoice = (int)(Math.random()*5);
			System.out.println(cpuChoice);
			if (cpuChoice == 0)
				{
					System.out.println("CPU is Selecting"
					+"\n Name: "+ robot0Name 
					+"\n HP: "+ robot0HP
					+"\n ATK: "+ robot0ATK
					+"\n DEF: "+ robot0DEF);
					cpuBot = robot0Name;
					cpuHP = robot0HP;
					cpuATK = robot0ATK;
					cpuDEF = robot0DEF;

				}
				if (cpuChoice == 1)
				{
					System.out.println("CPU is Selecting"
					+"\n Name: "+ robot1Name 
					+"\n HP: "+ robot1HP
					+"\n ATK: "+ robot1ATK
					+"\n DEF: "+ robot1DEF);
					cpuBot = robot1Name;
					cpuHP = robot1HP;
					cpuATK = robot1ATK;
					cpuDEF = robot1DEF;}
				if (cpuChoice == 2)
				{
					System.out.println("CPU is Selecting"
					+"\n Name: "+ robot2Name 
					+"\n HP: "+ robot2HP
					+"\n ATK: "+ robot2ATK
					+"\n DEF: "+ robot2DEF);
					cpuBot = robot2Name;
					cpuHP = robot2HP;
					cpuATK = robot2ATK;
					cpuDEF = robot2DEF;

				}
				if (cpuChoice == 3)
				{
					System.out.println("CPU is Selecting"
					+"\n Name: "+ robot3Name 
					+"\n HP: "+ robot3HP
					+"\n ATK: "+ robot3ATK
					+"\n DEF: "+ robot3DEF);
					cpuBot = robot3Name;
					cpuHP = robot3HP;
					cpuATK = robot3ATK;
					cpuDEF = robot3DEF;}
				if (cpuChoice == 4)
				{
					System.out.println("CPU is Selecting"
					+"\n Name: "+ robot4Name 
					+"\n HP: "+ robot4HP
					+"\n ATK: "+ robot4ATK
					+"\n DEF: "+ robot4DEF);
					cpuBot = robot4Name;
					cpuHP = robot4HP;
					cpuATK = robot4ATK;
					cpuDEF = robot4DEF;

				}
				if (cpuChoice == 5)
				{
					cpuChoice = 5;
					System.out.println("CPU is Selecting"
					+"\n Name: "+ robot5Name 
					+"\n HP: "+ robot5HP
					+"\n ATK: "+ robot5ATK
					+"\n DEF: "+ robot5DEF);
					cpuBot = robot5Name;
					cpuHP = robot5HP;
					cpuATK = robot5ATK;
					cpuDEF = robot5DEF;
				}
			if (cpuChoice == userChoice)
			cpuChoice = (int)(Math.random()*5);

		//Turn  and Battle Calcs
		//TODO
		// Score Calculation and Leaderboards
	if (userChoice == 0 && cpuChoice == 1)
	{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
		if (userChoice == 0 && cpuChoice == 2)
		{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
		if (userChoice == 0 && cpuChoice == 3)
		{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
		if (userChoice == 0 && cpuChoice == 4)
		{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
		if (userChoice == 1 && cpuChoice == 0)
		{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
	if (userChoice == 1 && cpuChoice == 1) // This should never occur.. alot of game test is required and rebalancing.
	{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
		if (userChoice == 1 && cpuChoice == 2)
		{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
		if (userChoice == 1 && cpuChoice == 3)
		{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
		if (userChoice == 1 && cpuChoice == 4)
		{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
		if (userChoice == 1 && cpuChoice == 5)
		{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
	if (userChoice == 2 && cpuChoice == 0)
		{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
	if (userChoice == 2 && cpuChoice == 1) // This should never occur.. alot of game test is required and rebalancing.
	{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
		if (userChoice == 2 && cpuChoice == 2)
		{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
		if (userChoice == 2 && cpuChoice == 3)
		{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
		if (userChoice == 2 && cpuChoice == 4)
		{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
		if (userChoice == 2 && cpuChoice == 5)
		{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
	if (userChoice == 3 && cpuChoice == 0)
		{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
	if (userChoice == 3 && cpuChoice == 1) // This should never occur.. alot of game test is required and rebalancing.
	{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
		if (userChoice == 3 && cpuChoice == 2)
		{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
		if (userChoice == 3 && cpuChoice == 3)
		{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
		if (userChoice == 3 && cpuChoice == 4)
		{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
		if (userChoice == 3 && cpuChoice == 5)
		{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
	if (userChoice == 4 && cpuChoice == 0)
		{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
	if (userChoice == 4 && cpuChoice == 1) // This should never occur.. alot of game test is required and rebalancing.
	{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
		if (userChoice == 4 && cpuChoice == 2)
		{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
		if (userChoice == 4 && cpuChoice == 3)
		{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
		if (userChoice == 4 && cpuChoice == 4)
		{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
		if (userChoice == 4 && cpuChoice == 5)
		{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
	if (userChoice == 5 && cpuChoice == 0)
		{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
	if (userChoice == 5 && cpuChoice == 1) // This should never occur.. alot of game test is required and rebalancing.
	{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
		if (userChoice == 5 && cpuChoice == 2)
		{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
		if (userChoice == 5 && cpuChoice == 3)
		{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
		if (userChoice == 5 && cpuChoice == 4)
		{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
			turn++;} //end while
		} // end if
		if (userChoice == 5 && cpuChoice == 5)
		{		
		System.out.println("Ready The Fight? (Press Enter to Continue)");

		System.out.print(keypress);
		keypress = sc.nextLine();

		 System.out.print(keypress);


				while (pHP > 0 &&  cpuHP > 0)
				{
					System.out.println("Turn " +turn);
					chance = Math.random()*25 +10;
					System.out.println("Your robot " +pBot + " initiates an attack");
					damage =  pATK+chance*.25 - cpuDEF+chance*.25;
					cpuHP = cpuHP - damage;
					System.out.print(keypress);
					keypress = sc.nextLine();
					if (robot1HP < 0)
						{	System.out.println("Your Robot Wins");
							System.exit(0);
						}

					if(keypress.equals(""))
					{	
						System.out.println(pBot+" Did " + damage + " damage\n CPU Robot HP: " +cpuHP);
						System.out.print(keypress);
						keypress = sc.nextLine();	
					}

					if(keypress.equals(""))
					{	
						System.out.println("CPU Robot " +cpuBot + " initiates an attack\n  Player Robot HP: " +pHP);
						damage =  cpuATK+chance*.50 - pDEF+chance*.50;
						pHP = pHP - damage;
						System.out.println(cpuBot+" Did " + damage + " damage");
						System.out.print(keypress);
						keypress = sc.nextLine();
						if (pHP < 0)
						{
							System.out.println("CPU Robot Wins");
							System.exit(0);
						}
					}
		turn++;} //end while
			} // end if
		}	
	}

