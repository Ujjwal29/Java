
package hackerrank;
import java.util.Scanner;

public class UtopianTree {
    
    public int monsoon(int n)   {return 2*n;}
    
    public int summer(int n)    {return n+1;}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UtopianTree ut = new UtopianTree();
        
        int test_cases = sc.nextInt();
        int cycles[] = new int[test_cases];
        
        for (int i = 0; i < test_cases; i++) {
            cycles[i] = sc.nextInt();
        }
        
        for (int j = 0; j < cycles.length; j++) 
        {
            int final_height = 1;
            int initial_height = 1;
            
            for (int i = 0; i < cycles[j]; i++) {
                if(i%2==0)
                {
                    final_height = ut.monsoon(initial_height);
                }

                if (i%2!=0)
                {
                    final_height = ut.summer(initial_height);
                }
                initial_height = final_height;

            }
            System.out.println(final_height);
        }
    }
}