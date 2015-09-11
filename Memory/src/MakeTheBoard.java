import java.util.Scanner;


public class MakeTheBoard
	{
		static String arrayList animals = 
		static String[][] layout = new String [4][4];
		public static void main(String[] args)
			{
				display();
			}
		public static void display()
			{
				for(int row = 0; row < layout.length; row++)
					{
						for(int col = 0; col < layout.length; col++)
							{
								layout[row][col] = "     ";
							}
					}
//				layout[0][0] = " chick";
//				layout[0][1] = " start";
//				layout[0][2] = " moose";
//				layout[0][3] = " iPads";
//				layout[1][0] = " geese";
//				layout[1][1] = " goose";
//				layout[1][2] = " comps";
//				layout[1][3] = " proof";
//				layout[2][0] = " stree";
//				layout[2][1] = " reply";
//				layout[2][2] = " parks";
//				layout[2][3] = " techy";
//				layout[3][0] = " crews";
//				layout[3][1] = " share";
//				layout[3][2] = " likes";
//				layout[3][3] = " meeps";
				System.out.println("      1       2       3       4");
				System.out.println("   _______ _______ _______ _______");
				System.out.println("  |       |       |       |       |");
				System.out.println("  |       |       |       |       |");
				System.out.println("A |" + layout[0][0] + " |" + layout[0][1] + " |" + layout[0][2] + " |" + layout[0][3] + " |");
				System.out.println("  |       |       |       |       |");
				System.out.println("  |_______|_______|_______|_______|");
				System.out.println("  |       |       |       |       |");
				System.out.println("  |       |       |       |       |");
				System.out.println("B |" + layout[1][0] + " |" + layout[1][1] + " |" + layout[1][2] + " |" + layout[1][3] + " |");
				System.out.println("  |       |       |       |       |");
				System.out.println("  |_______|_______|_______|_______|");
				System.out.println("  |       |       |       |       |");
				System.out.println("  |       |       |       |       |");
				System.out.println("C |" + layout[2][0] + " |" + layout[2][1] + " |" + layout[2][2] + " |" + layout[2][3] + " |");
				System.out.println("  |       |       |       |       |");
				System.out.println("  |_______|_______|_______|_______|");
				System.out.println("  |       |       |       |       |");
				System.out.println("  |       |       |       |       |");
				System.out.println("D |" + layout[3][0] + " |" + layout[3][1] + " |" + layout[3][2] + " |" + layout[3][3] + " |");
				System.out.println("  |       |       |       |       |");
				System.out.println("  |_______|_______|_______|_______|");
			}

	}
