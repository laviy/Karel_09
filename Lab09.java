/**
 * A robot moves along a row, collecting piles of beepers and placing them one square to
 * the right.
 * 
 * @author <...>
 * @version <...>
 *
 */

import edu.fcps.karel2.Display; 
import javax.swing.JOptionPane;

public class Lab09 {
	 
	 public static void main(String[] args) {
		 String map = JOptionPane.showInputDialog("Which map?");
		 Display.openWorld("maps/"+map+".map");
		 Display.setSize(10, 10);
		 Athlete athena = new Athlete(1, 1, Display.EAST, 0);
         int d = 0;
         while(athena.nextToABeeper()&&athena.frontIsClear()) {
            athena.move();
            int k = 0;
            int n = k;
            n = d;
               while(athena.nextToABeeper()) {
                  athena.pickBeeper();
                  k = k+1;
               }
               for(int y = -2; y < -1; y=y+2) {
                  athena.move();
               }
               if(!athena.nextToABeeper()) {
                  while(athena.nextToABeeper()) {
                     athena.pickBeeper();
                     n = n+1;
                     
                  }
                  for(int e =0; e < k; e++) {
                     athena.putBeeper();
                  }
               }
               else {
                  while(athena.nextToABeeper()) {
                     athena.pickBeeper();
                     n = n+1;
                     
                  }
                  for(int e =0; e < k; e++) {
                     athena.putBeeper();
                  }
               }
               athena.move();
               d = n;
             }
         athena.move();
   	 }
    }