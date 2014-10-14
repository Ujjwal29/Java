/*
1)Use of a random function.
2) Shows that a brute force take long enough time.

*/
package threeSumProblem;

import java.util.*;


public class bruteForce {
    public int count(int[] a)
    {
        int count_triple =0;
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    if(a[i] + a[j] + a[k]==0)
                    {
                        count_triple++;
                    }
                }
            }
        }
        return count_triple;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bruteForce bf = new bruteForce();
        
        int[] a = new int[4000];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)((Math.random()*99)-50);//sc.nextInt();
            //System.out.println(a[i]);
        }
        long startTime = System.currentTimeMillis();
        System.out.println(bf.count(a));
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        
                System.out.println(duration/1000.0+" seconds");
    }

}
