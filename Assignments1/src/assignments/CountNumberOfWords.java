package assignments;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CountNumberOfWords {
	 public static void main(String[] args) {
		  String input;
		  int output;

		  Scanner in = new Scanner(System.in);
		  System.out.println("Enter the String : ");
		  input = in.nextLine();

		  input = input.replace(',', ' ');

		  StringTokenizer st = new StringTokenizer(input);
		  output = st.countTokens();

		  System.out.println(output);

		 }
		}

