/* 
 * Card Notation Converter 16 February 2013
 * Converting two characters into a rank and suit
 */

import java.util.Scanner;

public class CardNotationConverter
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Valid Ranks: J j Q q K k A a 2 3 4 5 6 7 8 9 10");
		System.out.println("Valid Suits: D d H h S s C c");
		System.out.println("Enter the card notation: ");
		String rankAndSuit = in.nextLine();
		
		if (rankAndSuit.length() == 2)
		{
			String rawRank = rankAndSuit.substring(0,1);
			String rawSuit = rankAndSuit.substring(1,2);
			String rank = rawRank.toUpperCase();
			String suit = rawSuit.toUpperCase();
			
			switch (rank)
			{
				case "A"  : rank = "Ace" 	; break ;
				case "2"  : rank = "Two"	; break ;
				case "3"  : rank = "Three"	; break ;
				case "4"  : rank = "Four"	; break ;
				case "5"  : rank = "Five"	; break ;
				case "6"  : rank = "Six"	; break ;
				case "7"  : rank = "Seven"	; break ;
				case "8"  : rank = "Eight"	; break ;
				case "9"  : rank = "Nine"	; break ;
				case "10" : rank = "Ten" 	; break ;
				case "J"  : rank = "Jack"	; break ;
				case "Q"  : rank = "Queen"	; break ;
				case "K"  : rank = "King"	; break ;
				default	  : rank = "invalid"; break ;
			}
		
			switch (suit)
			{
				case "D"  : suit = "Diamonds"; break ;
				case "H"  : suit = "Hearts"	 ; break ;
				case "S"  : suit = "Spades"	 ; break ;
				case "C"  : suit = "Clubs"	 ; break ;
				default   : suit = "invalid" ; break ;
			}
			
			if (suit == "invalid" && rank == "invalid")
			{
				System.out.println("Invalid rank (" + rawRank + ") and suit (" + rawSuit + ").");
			}
			else if (rank == "invalid")
			{
				System.out.println("Invalid rank (" + rawRank + "). Rank must be  A, J, Q, K, 2, 3, 4, 5, 6, 7, 8, 9, or 10");
			}
			else if (suit == "invalid")
			{
				System.out.println("invalid suit (" + rawSuit + "). Suit must be D, H, S, or C");
			}
			else
			{
				System.out.println(rank + " of " + suit);
			}
			
			in.close(); 
			
		}
		else //if more or less than two characters are input by the user
		{
			if (rankAndSuit.length() > 2)
			{
				System.out.println("Only two characters allowed");
			}
			else
			{
				System.out.println("Two characters required");
			}
		}


	} //main method
		
} //class
