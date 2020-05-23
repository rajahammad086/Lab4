//Raja Hammad Mehmood
// We'll be making a program which takes the thickness of the paper from the user and the desired distance the user wants that paper to cross as we keep on folding that.
import java.util.Scanner;

public class Folding {

  public static void main ( String[] args ) {
    Scanner scanner = new Scanner(System.in);
    double thick;//thickness of paper
    double distance;// desired distance 
    System.out.println("Please enter the thickness of paper in millimeters");
    thick=scanner.nextDouble();
    int fold;// folds of paper
    fold=0;
    double check;// variable for checking until distance equal desired distance.
    System.out.println("Please enter the desired distance you want to reach in kilometers");
    distance=scanner.nextDouble();
    distance=distance*1000*1000;
    check=thick;
    while (check<distance){
        check=check*2;
        fold=fold+1;
    }
  
  System.out.println(fold);
  }
  
}