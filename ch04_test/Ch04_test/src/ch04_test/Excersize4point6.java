package ch04_test;

public class Excersize4point6 {
	public static void main (String [] args){
		int x = 1;
		int sum = 0;
		
		while (x <= 10 ){
			sum +=x;
			x++;	
		}
		System.out.printf("The sum is: %d\n", sum);
	}
}