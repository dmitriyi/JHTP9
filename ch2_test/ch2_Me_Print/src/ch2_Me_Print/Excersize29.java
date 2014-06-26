package ch2_Me_Print;

//Using statements similar to the one shown earlier in this exercise, 
// write an application that displays the integer equivalents of some
// uppercase letters, lowercase letters, digits and special symbols.
// Display the integer equivalents of the following: ABCabc012$*+/
// and the blank character.


public class Excersize29 {
	public static void main (String [] args){
		System.out.printf("Character %c has int value of %d\n", 'A', ((int)'A'));
		System.out.printf("Character %c has int value of %d\n", 'B', ((int)'B'));
		System.out.printf("Character %c has int value of %d\n", 'C', ((int)'C'));
		System.out.printf("Character %c has int value of %d\n", 'a', ((int)'a'));
		System.out.printf("Character %c has int value of %d\n", 'b', ((int)'b'));
		System.out.printf("Character %c has int value of %d\n", 'c', ((int)'c'));
		System.out.printf("Character %c has int value of %d\n", '0', ((int)'0'));
		System.out.printf("Character %c has int value of %d\n", '1', ((int)'1'));
		System.out.printf("Character %c has int value of %d\n", '2', ((int)'2'));
		System.out.printf("Character %c has int value of %d\n", '3', ((int)'3'));
		System.out.printf("Character %c has int value of %d\n", '$', ((int)'$'));
		System.out.printf("Character %c has int value of %d\n", '*', ((int)'*'));
		System.out.printf("Character %c has int value of %d\n", '+', ((int)'+'));
		System.out.printf("Character %c has int value of %d\n", '/', ((int)'/'));
		System.out.printf("Character %c has int value of %d\n", ' ', ((int)' '));
	}
}
