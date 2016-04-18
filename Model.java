package Gazzayeatman.PR282.JavaControlExcercises;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Model {
//------Methods
	public int fibonacci(int number){
		int result = 0;
        if(number == 1 || number == 2){
            result = 1;
        }
        int fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= number; i++){
            fibonacci = fibo1 + fibo2;             
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }
        return fibonacci;
    }
	public int tribonacci(int number){
		int result = 0;
        if(number == 1 || number == 2 || number == 3){
            result = 1;
        }
        int fibo1=1, fibo2=1, fibo3=1,tribonacci=1;
        for(int i= 4; i<= number; i++){
            tribonacci = fibo1 + fibo2 + fibo3;             
            fibo1 = fibo2 = fibo3;
            fibo3 = tribonacci;
        }
        return tribonacci;
    }
//------Exercises
	public String exerciseOne(int mark){
		String result;
		if (mark >= 50){
			result = "Pass";
		} else {
			result = "fail";
		}
		return result;
	}
	public String exerciseTwo(int a){
		String result;
		if (a%2 == 0){
			result = "Even";
		} else {
			result = "Odd";
		}
		return result;
	}
	public String exerciseThree(int a){
		String result = "";
		switch (a) {
		case 1: result = "One";
			break;
		case 2: result = "Two";
			break;
		case 3: result = "Three";
			break;
		case 4: result = "Four";
			break;
		case 5: result = "Five";
			break;
		case 6: result = "Six";
			break;
		case 7: result = "Seven";
			break;
		case 8: result = "Eight";
			break;
		case 9: result = "Nine";
			break;
		default: result = "OTHER";
			break;
		}
		return result;
	}
	public String exerciseFour(){
		int sum = 0;
		int avg = 0;
		int a = 1;
		String result;
		while (a <= 100){
			sum = sum + a;
			a++;
		}
		avg = sum/100;
		return "The Sum is " + sum + " The average is " + avg;
	}
	public String exerciseSix(){
		int sum = 0;
		int avg = 0;
		int a = 1;
		String result;
		do {
			sum = sum + a;
			a++;
		} while (a <= 100);
		avg = sum/100;
		return "The Sum is " + sum + " The average is " + avg;
	}
	public String exerciseSeven(){
		int sum = 0;
		int avg = 0;
		int count = 0;
		int a = 111;
		String result;
		do {
			sum = sum + a;
			count++;
			a++;
		} while (a <= 8989);
		avg = sum/100;
		return "The Sum is " + sum + " The average is " + avg + " With a count of " + count;
	}
	public String exerciseEight(){
		int sum = 0;
		int avg = 0;
		int a = 1;
		int count = 0;
		String result;
		do {
			if (a%2 != 0){
				sum = sum + a;
				count++;
				a++;
			} else {
				a++;
			}
		} while (a <= 100);
		avg = sum/count;
		return "The Sum is " + sum + " The average is " + avg + " With a count of " + count;
	}
	public String exerciseNine(){
		int sum = 0;
		int avg = 0;
		int a = 1;
		int count = 0;
		String result;
		do {
			if (a%7 == 0){
				sum = sum + a;
				count++;
				a++;
			} else {
				a++;
			}
		} while (a <= 100);
		avg = sum/count;
		return "The Sum is " + sum + " The average is " + avg + " With a count of " + count;
	}
	public String exerciseTen(){
		int sum = 0;
		int avg = 0;
		int a = 1;
		int count = 0;
		String result;
		do {
			sum = sum + a * a;
			a++;
		} while (a <= 100);
		avg = sum/100;
		return "The Sum is " + sum + " The average is " + avg;
	}
	public String exercise11(int a){
		int sum = 1;
		int count = 1;
		while (a >= count){
			sum *= count;
			count++;
		}
		return "The product of 1 to " + a + " is " + sum;
	}
	public String exercise12(int a){
		double l2r = 0;
		double r2l = 0;
		for (int i = 1; i<=a; i++){
			l2r += (double)(1)/i;
			r2l += (double)(1)/(a-i+1);
		}
		return "Left to right Harmonic sum for a max value of " + a + " is " + l2r + " Right to left Harmonic sum is + " + r2l;
	}
	public String exercise13(int a){
		double pi = 0;
		double sum = 1;
		int count = 1;
		for (int i = 3; i <= a; i= i+2){
			if (count % 2 == 0){
				sum += ((double)1/(double)i);
				count++;
			} else {
				sum -= ((double)1/(double)i);
				count++;
			}
		}
		pi = sum * (double)4;
		return "When to end the sum: " + a + " The value of Pi: " + pi + " " + Math.PI;
	}
	public String exercise14(int number){
		int avg = 0;
		int total = 0;
		String result = "The first " + number + " Fibonacci numbers are:";
		for (int i=1; i<=number; i++){
			result += " " + fibonacci(i);
			total += fibonacci(i);
		}
		avg = total/number;
		result += " The average is: " + avg;
		return result;
	}
	public String exercise15(int number){
		int avg = 0;
		int total = 0;
		String result = "The first " + number + " Tribonacci numbers are:";
		for (int i=1; i<=number; i++){
			result += " " + tribonacci(i);
			total += tribonacci(i);
		}
		avg = total/number;
		result += " The average is: " + avg;
		return result;
	}
	public String exercise16(){
		Scanner a = new Scanner(System.in);
		System.out.println("Please Enter a string");
		String b = a.nextLine();
		String reverse = new StringBuffer(b).reverse().toString();
		return reverse;
	}
	public String exercise17(){
		int length = 0;
		String result = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a string");
		String b = sc.nextLine();
		b = b.toLowerCase();
		length = b.length();
		for (int i = 0; i < length; i++){
			char c = b.charAt(i);
			if (c == 'a' || c == 'b' || c == 'c'){
				result += "2";
			} else if (c == 'd' || c == 'e' || c == 'f'){
				result += "3";
			} else if (c == 'g' || c == 'h' || c == 'i'){
				result += "4";
			} else if (c == 'j' || c == 'k' || c == 'l'){
				result += "5";
			} else if (c == 'm' || c == 'n' || c == 'o'){
				result += "6";
			} else if (c == 'p' || c == 'q' || c == 'r' || c == 's'){
				result += "7";
			} else if (c == 't' || c == 'u' || c == 'v'){
				result += "8";
			} else if (c == 'w' || c == 'x' || c == 'y' || c == 'z'){
				result += "9";
			}
		}
		return result;
	}
	public String exercise18(){
		Scanner a = new Scanner(System.in);
		String result = "";
		System.out.println("Please Enter a string");
		String b = a.nextLine();
		String reverse = new StringBuffer(b).reverse().toString();
		if (reverse.equalsIgnoreCase(b)){
			result = b + " is a palindrome";
		} else {
			result = b + " is not a palindrome";
		}
		return result;
	}
	public String exercise19(){
		String result = "";
		int count = 1;
		int avg = 0;
		int total = 0;
		Scanner sc = new Scanner(System.in);
		View.say("Enter the number of Students: ");
		int numberOfStudents = sc.nextInt();
		while (count <= numberOfStudents){
			View.say("Enter the grade for student: " + count);
			int a = sc.nextInt();
			if (a > 100){
				View.say("The grade must be between 0 and 100");
			} else {
				total += a;
				count++;
			}
		}
		avg = total/(count-1);
		return "The average is " + avg;
	}
	public double standardDeviation(int[] ray){
		double result = 0.00;
		DecimalFormat df = new DecimalFormat("#.########");
		double a = 0.00000000;
		double b = 0.00;
		double avg = 0.00;
		df.format(a);
		avg = ArrayMethods.arraySum(ray)/ray.length;
		a = 1/(ArrayMethods.arraySum(ray));
		System.out.println(ArrayMethods.arraySum(ray));
		for (int i = 0; i < ray.length; i++){
			b += ray[i] - avg;
		}
		b = Math.pow(b, 2);
		result = Math.sqrt(a * b);
		System.out.println(a + " " + b + " " + avg);
		return result;
	}
	public String exercise20(){
		//Variables
		String result = "";
		int min = 0;
		int max = 0;
		int count = 0;
		int [] rayRay;
		int avg = 0;
		//Getting input
		Scanner sc = new Scanner(System.in);
		View.say("Enter the number of Students: ");
		int numberOfStudents = sc.nextInt();
		rayRay = new int[numberOfStudents];
		while (count < numberOfStudents){
			View.say("Enter the grade for student: " + (count+1));
			int a = sc.nextInt();
			if (a > 100){
				View.say("The grade must be between 0 and 100");
			} else {
				rayRay[count] = a;
				count++;
			}
		}
		avg = ArrayMethods.arraySum(rayRay)/count;
		return " The average is " + avg + " The minimum is " + ArrayMethods.arrayMinValue(rayRay) + " The Maximum is " + ArrayMethods.arrayMaxValue(rayRay) + " The SD is " + standardDeviation(rayRay);
	}
	public String exercise21(){
		String result = "";
		int[] rayRay;
		rayRay = new int[5];
		rayRay[0] = 12;
		rayRay[1] = 56;
		rayRay[2] = 34;
		rayRay[3] = 79;
		rayRay[4] = 26;
		int temp = 0;
		int mid = rayRay.length / 2;
		int count = 1;
		for (int i = rayRay.length / 2 + 1; i < rayRay.length; i++){
			temp = rayRay[i];
			rayRay[i] = rayRay[mid - count];
			rayRay[mid-count] = temp;
			count++;
		}
		result = ArrayMethods.displayIntArray(rayRay);
		return result;
	}
	public void exercise22(){
		int secretNumber = (int)(Math.random()*100);
		Scanner sc = new Scanner(System.in);
		int guess = 0;
		int count = 0;
		View.say("Guess a number between 0 and 100");
		View.say("Enter your guess");
		while (guess != secretNumber){
			guess = sc.nextInt();
			if (guess == secretNumber){
				View.say("You did it in " + count + " tries");
			} else if (guess > secretNumber){
				View.say("Try lower");
				count++;
				guess = 0;
			} else if (guess < secretNumber){
				View.say("Try higher");
				count++;
			}
		}
	}
	public void exercise23(){
		String secretWord = "testing";
		String displayWord = "_______";
		char[] displayArray = new char[7];
		displayArray = displayWord.toCharArray();
		char[] rayRay = new char[7];
		int completed = 0;
		String guess = "";
		Scanner sc = new Scanner(System.in);
		rayRay[0] = 't';
		rayRay[1] = 'e';
		rayRay[2] = 's';
		rayRay[3] = 't';
		rayRay[4] = 'i';
		rayRay[5] = 'n';
		rayRay[6] = 'g';
		while (completed == 0){
			View.say("Your guess so far " + ArrayMethods.displayCharArray(displayArray));
			View.say("Enter your guess");
			guess = sc.nextLine();
			if (guess.length() == 0){
				View.say("Please enter a guess");
			} else if (guess.length() == 1) {
				char a = guess.charAt(0);
				if (secretWord.contains(guess)){
					for (int i = 0; i < rayRay.length; i++){
						if (rayRay[i] == a){
							displayArray[i] = a;
						}
					}
				}
			} else if (guess.length() > 1){
				if (guess.matches(secretWord)){
					displayWord = secretWord;
					View.say("You did it");
					completed = 1;
				}
			}
			if (ArrayMethods.displayCharArray(displayArray).matches(secretWord)){
				completed = 1;
				View.say("You did it");
			}
		}
	}
	public String exercise24(int day, String month, int year){
		String result = "";
		int a = 0;
		
		a = Integer.reverse(year);
		a = a / 100;
		a = Integer.reverse(a);
		a = (a / 4) + a;
		return result;
	}
}