package hackerrank;

import java.util.Scanner;
public class HalloweenParty {
    
    public long MaxPieces(long a)
    {
        if(a%2==0)
            return (a*a)/4;
        else
            return (a/2)*((a/2)+1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HalloweenParty sol = new HalloweenParty();
        
        int testcases = sc.nextInt();
        long[] pieces = new long[testcases];
        long k;

        for (int i = 0; i < testcases; i++) {
            pieces[i] = sc.nextInt();
            //pieces[i] = sol.MaxPieces(k);
        }
        
        for (int i = 0; i < testcases; i++) {
            k = sol.MaxPieces(pieces[i]);
            System.out.println(k);
        }
    }
}
