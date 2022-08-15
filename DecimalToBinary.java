
package decimaltobinary;
import  java.util.Scanner;

public class DecimalToBinary {

    
    public static void main(String[] args) {
        
        int digit, i = 0 ;
        int binary [] = new int [10000];
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter a decimal number : ");
        digit = user_input.nextInt();
        
        while (digit != 0)
        {
            binary[i] = digit%2;
            digit = digit/2;
            i++;
        }
        
          System.out.println("The Binary value is : ");
          for(int j = i-1;j>=0;j--)
          {
              System.out.print(""+binary[j]);
          }
       
    }
    
}
