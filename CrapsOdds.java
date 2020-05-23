// calulating the win percentage in a craps game without taking any input from the user.

// Raja Hammad Mehmood.

public class CrapsOdds {

    public static void main ( String[] args ) {
        int initialsum;// first sum of two dices
        double winpercent;// win percentage of the user
        int latersum;// sums of dices after the first sum
        int count;// counter for loop
        count=0;
        double win;// counting wins
        win=0;
        while (count<10000){ // performing 10000 rounds.
             int die1 = (int)(Math.random()*6)+1;
            int die2 = (int)(Math.random()*6)+1;
                //   sum the values rolled
                initialsum = die1+die2;
                if (initialsum ==7 || initialsum==11){//checking the winning condition
                    win=win+1;
                }
                else if (initialsum==2 || initialsum==3 || initialsum==12){//checking the losing condition
                    
                }
                else {
                 while (true){
                 int die3 = (int)(Math.random()*6)+1;
                 int die4 = (int)(Math.random()*6)+1;
                 latersum = die3+die4;
                 if (latersum ==initialsum) { // checking the winning condition if the first winning condition not true
                win=win+1;
                break;
                }
               else if (latersum==7) { // again checking the losing condition.
                break;
            }
            }
                }
        
        count=count+1;
        }
        winpercent=(win/10000)*100;// calculating win percentage.
        System.out.println("That's the win percentage " + winpercent);
        

       
        

    }

}
