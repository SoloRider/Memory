import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class MakeTheBoard
	{
		static int misMatch = 0;
		static ArrayList<String> words = new ArrayList<String>();
		static String[][] layout = new String [4][4];
		static String[][] fakeLayout = new String [4][4];
		static int places = 0;
		public static void main(String[] args)
			{
				display();
				askUser();
			}
		public static void askUser()
			{
				Scanner user1nput = new Scanner(System.in);
				System.out.println("What column and row would you like?");
				String first = user1nput.nextLine();
				switch(first.substring(0, 1))
				{
					case "A":
					case "a":
						places = 0;
						break;
					case "B":
					case "b":
						places = 1;
						break;
					case "C":
					case "c":
						places = 2;
						break;
					case "D":
					case "d":
						places = 3;
						break;
				}
				int choice = Integer.parseInt(first.substring(1)) - 1;
				System.out.println(layout[places][choice % 10]);
				(layout[places][choice % 10]) = fakeLayout[places][choice];
				words.add(" Chick ");
				words.add(" Chick ");
				words.add(" Doggy ");
				words.add(" Doggy ");
				words.add(" Toads ");
				words.add(" Toads ");
				words.add(" Kitty ");
				words.add(" Kitty ");
				words.add(" Frogs ");
				words.add(" Frogs ");
				words.add(" Birds ");
				words.add(" Birds ");
				words.add(" Piggy ");
				words.add(" Piggy ");
				words.add(" Moths ");
				words.add(" Moths ");
				Collections.shuffle(words);
				for(int row = 0; row < layout.length; row++)
					{
						for(int col = 0; col < layout.length; col++)
							{
								fakeLayout[row][col] = words.get(misMatch);
								layout[row][col] = words.get(misMatch);
								misMatch++;
							}
					}
				display();
			}
		public static void display()
			{
				System.out.println("      1       2       3       4");
				System.out.println("   _______ _______ _______ _______");
				System.out.println("  |       |       |       |       |");
				System.out.println("  |       |       |       |       |");
				System.out.println("A |" + layout[0][0] + "|" + layout[0][1] + "|" + layout[0][2] + "|" + layout[0][3] + "|");
				System.out.println("  |       |       |       |       |");
				System.out.println("  |_______|_______|_______|_______|");
				System.out.println("  |       |       |       |       |");
				System.out.println("  |       |       |       |       |");
				System.out.println("B |" + layout[1][0] + "|" + layout[1][1] + "|" + layout[1][2] + "|" + layout[1][3] + "|");
				System.out.println("  |       |       |       |       |");
				System.out.println("  |_______|_______|_______|_______|");
				System.out.println("  |       |       |       |       |");
				System.out.println("  |       |       |       |       |");
				System.out.println("C |" + layout[2][0] + "|" + layout[2][1] + "|" + layout[2][2] + "|" + layout[2][3] + "|");
				System.out.println("  |       |       |       |       |");
				System.out.println("  |_______|_______|_______|_______|");
				System.out.println("  |       |       |       |       |");
				System.out.println("  |       |       |       |       |");
				System.out.println("D |" + layout[3][0] + "|" + layout[3][1] + "|" + layout[3][2] + "|" + layout[3][3] + "|");
				System.out.println("  |       |       |       |       |");
				System.out.println("  |_______|_______|_______|_______|");
			}

	}
