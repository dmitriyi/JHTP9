package ch04_test;
import java.util.Scanner;
public class SalesCommissionCalculator {
	public static void main (String [] args){
		double newItem,
			total = 0,
		item1 = 239.99,
			item2 = 129.75,
				item3 = 99.95,
					item4 = 350.89,
		item1Counter = 0,
				item2Counter = 0,
						item3Counter = 0,
								item4Counter = 0;
		int quit = 0;
		String sNew;
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Welcome to the Sales Commission Calculator!\nIt will calulate the sales person's weekly\nearnings based on the commision.\n");
		System.out.printf("Items sold this week:\nItem 1: %.2f\nItem 2: %.2f\nItem 3: %.2f\nItem 4: %.2f\n",
				item1, item2, item3, item4);
		while (quit != 1 ){
			System.out.printf("Plese enter Item # or type \"quit\" to exit:");
				sNew = input.nextLine();
				if (sNew.equals("quit")){
						quit = 1;
				} else {
			newItem = Double.parseDouble(sNew);
				if (newItem == 1){
					newItem = item1;
							++item1Counter;
							total = total + newItem;
				} else if (newItem == 2){
					newItem = item2;
							++item2Counter;
							total = total + newItem;
				}else if (newItem == 3){
					newItem = item3;
							++item3Counter;
							total = total + newItem;
				}else if (newItem == 4){
					newItem = item4;
							++item4Counter;
							total = total + newItem;
				} else {
					System.out.print("Incorrect entry, try again! \n");
				}
				}
			}
 System.out.print("\nTotal Items sold by type:\n");
 System.out.printf("Item 1 for %s : %s\n",item1, item1Counter);
 System.out.printf("Item 2 for %s : %s\n",item2, item2Counter);
 System.out.printf("Item 3 for %s : %s\n",item3, item3Counter);
 System.out.printf("Item 4 for %s : %s\n",item4, item4Counter);
 	
 	total = total + 200;
 	System.out.printf("Total earnings for this sales Representative are: %s", total);

		input.close();
	}
}
//System.out.printf();