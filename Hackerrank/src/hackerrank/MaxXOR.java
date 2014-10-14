package hackerrank;

import java.util.Scanner;
public class MaxXOR {

//    public int XORcal(int a, int b)
//    {
//        int ans;
//        ans = a^b;
//        return ans;
//    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        
        int max = 0;
        int ans;

        for (int i = L; i <= R; i++) {
            for (int j = L; j<=R ; j++) {
                ans = i^j;
                if(ans > max)
                {max = ans;}
            }
        }
        System.out.println(max);
    }
}
