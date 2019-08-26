package humain;

import java.util.Scanner;


public class Main
{
    
    public static void main (String[] args)
    {
       int[][] res = new int[8][8];
       
       Scanner in = new Scanner (System.in);
       //takes input 8 X 8 matrix of a character
       for(int i=0; i<8; i++)
       {
           for(int j=0; j<8; j++)
           {
               res[i][j] = in.nextInt ();
           }
       }
       
       Main ob = new Main();
       boolean b = ob.comp(res);
       
       if(b==true)
           System.out.println("The character given is: 2");
       else
           System.err.println("Couldn't find the character");
    }
    
    boolean comp(int[][] r)
    {
        int i=0, j=0;
        int temp = 0;
        int[][] a2 = {
                                 { 0, 1, 1, 1, 1, 1, 0, 0},
                                 {0, 1, 0, 0, 0, 0, 1, 1},
                                 {1, 0, 0, 0, 0, 0, 0, 1},
                                 {0, 0, 0, 0, 0, 0, 0, 1},
                                 {0, 0, 0, 0, 0, 0, 1, 1},
                                 {0, 0, 0, 0, 1, 1, 0, 0,},
                                 {0, 1, 1, 1, 0, 0, 0, 0},
                                 {1, 1, 1, 1, 1, 1, 1, 1}
                               };
        
           for( i=0; i<8; i++)
          {
              for( j=0; j<8; j++)
              {
                   if(a2[i][j] != r[i][j])
                   {
                       temp ++;
                   }
                   //changes upto 8 bit error can be withstanded
                   if(temp > 8)
                       break;
              }
          }
        
        if(i==8 && j==8)
            return true;
        else 
            return false;
        
      }
}
