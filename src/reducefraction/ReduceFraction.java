/*
 * Corbin Nash.
 * Reduces fraction
 */

package reducefraction;

import javax.swing.JOptionPane;

/**
 *
 * @author conas1290
 */
public class ReduceFraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int numerator, denominator, ans;
        
    numerator  = Integer.parseInt(JOptionPane.showInputDialog("Enter a numerator"));
    denominator   = Integer.parseInt(JOptionPane.showInputDialog("Enter a denominator"));
    ans = Reduce(numerator, denominator);

    System.out.println("The fraction of "+numerator+"/"+denominator+" can be reduced to "+numerator/ans + "/" + denominator/ans);
  }

  public static int Reduce(int a, int b){
    if(b == 0) {
      return a;
    }
    else {
      //% is modulus, also known as the remainder function
      return Reduce(b, a%b);
    }
  }
    }
    
