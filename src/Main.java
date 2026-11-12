import java.util.*;
/*******************************
 * Name: Your name
 * Class: ICS3U
 * Date: Friday Sept. 25
 * Project Name: Restaurant
 * 
 * You will have your first real project this week. You must meet all of the following criteria:
Create a restaurant of your choosing
Print menu items one at a time, including the price.
Ask how many of each item they would like to purchase
Must have at least 5 different menu items
Calculate the total price
If the total is more than $30, take off 10%.
If the total is more than $50, take off 20%.
Add 13% HST  to the total
Print out the initial price, any discounts, taxes, and the grand total.
Read in a payment amount from the user
Calculate the change
If the change is negative, state that they still owe you money.
This is to be done individually.
DO NOT use AI! 
Feel free to use previous notes, videos, and online resources like w3schools.com
Fork the repository, add me (MrZebarth) as a collaborator, clone the repository to your computer, program your solution, and then commit and push the results.
 ********************************/
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Add your code
		//Print out restaurant title
		System.out.println("Welcome to Popeyes!");
		//Ask about menu items for $10
		System.out.println("How many 3-piece combos would you like to get for $10");
		//Read in answer
		int drinks = in.nextInt();
		//Ask about....

		double total= drinks*10;
		
		//check for the discount
		if (total>50) {
			
		}else if (total>30) {
			
		}
		
		//calculate taxes
		double tax = total*0.13;
		System.out.println("You are buying "+drinks+" for $10. Your total is $"+total);
	}

}
