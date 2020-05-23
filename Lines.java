//Raja Hammad Mehmood
// We'll be making a program which takes a sentence from the user and the number of times it is to be repeated.
import java.util.Scanner;

public class Lines {

  public static void main ( String[] args ) {
    String line;//would save the line
    int times;//would save the number of times the line is printed
    int counter;//counter for the while loop
    Scanner scanner = new Scanner(System.in);
    System.out.println("What would you like us to write");
    line=scanner.nextLine();// asking user for the line to be printed
    System.out.println("How many times");
    times=scanner.nextInt();// asking user for the times sentence is to be printed
    while (times<=0){//validation for the correct input for the number of times line is to be printed.
      System.out.println("It's not valid. Enter a positive number which is at least 1");
    times=scanner.nextInt();// asking user for the times sentence is to be printed
    }
    counter=0;
    while(counter<times){// printing sentence till "times" times.
      System.out.println(line);
      counter=counter+1;
    }
  }
  
}