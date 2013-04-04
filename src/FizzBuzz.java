/**
 * @(#)FizzBuzz.java
 *
 * FizzBuzz application
 *
 * @Preston Cody Cessna
 * @version 1.00 2013/4/3
 *
 * "Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number
 * and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”."
 *
 * Interview question review and GitHub practice
 */

public class FizzBuzz {

    public static void main(String[] args) {

    	int num = 0;

    	if(args[0] != null){
    		num = args[0];
    	}
    	else num = 100;

    	fizzBuzz(num);
    }

    public static void fizzBuzz(int max){

    	for(int i=1; i < max; i++){

    		String num = "";
    		if(i%3==0)num+="Fizz";
    		if(i%5==0)num+="Buzz";
    		if(num.length()==0)num = Integer.toString(i);

    		System.out.println(num);
    	}
    }
}
