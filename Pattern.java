// making repititive patterns of a shape in x y directions.
// Raja Hammad Mehmood.
import java.awt.*;
import javax.swing.*;

public class Pattern {

  public static void main ( String[] args ) {

    
Paint.buildWindow("boxes",100,100,800,500,Color.WHITE);
int xrect1 = 10;
int yrect1 = 410;
int xoval1 = 50;
int yoval1 = 450;
int xoval2 = 10;
int yoval2 = 410;
int xrect2 = 30;
int yrect2 = 430;
for(int y=0;y<5;y++){ 
for(int x=0;x<8;x++){
    // one sample copy
    Paint.setColor(Color.BLUE);
    Paint.fillRect(xrect1+(x*100),410-(y*100),80,80);
    Paint.setColor(Color.YELLOW);
    Paint.fillOval(xoval1+(x*100),450-(y*100),40,40);
    Paint.fillOval(xoval2+(x*100),410-(y*100),40,40);
    Paint.setColor(Color.RED);
    Paint.fillRect(xrect2+(x*100),430-(y*100),40,40);
   
 
}
  }
}
}

