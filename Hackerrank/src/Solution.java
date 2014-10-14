/*
In this, it is been mentioned how to deal with the nextLine() method.
*/
import java.util.Scanner;
public class Solution {
    
    public int minn(String[] a)
    {
        int min = Integer.parseInt(a[0]);
        for (int i = 1; i < a.length; i++) {
            if(Integer.parseInt(a[i]) < min)
                min = Integer.parseInt(a[i]);
        }
        return min;
    }
    
    public void subtract(String[] a, int n)
    {
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(a[i])- n+"";
        }
    }
    public void no_ofSticks_cut(String []a)
    {
        int min = minn(a);
        System.out.println(a.length);
        subtract(a, min);
        String[] nextStick = new String[a.length];
        int k=0;
        for (int i = 0; i < a.length; i++) {
            if(Integer.parseInt(a[i])!=0)
            {
                nextStick[k]=a[i];
                k++;
            }
        }
        System.out.println(nextStick.length);
        while(nextStick!=null)
        {no_ofSticks_cut(nextStick);}
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();
        int no_of_sticks = sc.nextInt();
        
        int option=0;
        try {
            option = Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
        }

        String[] sticks = new String[no_of_sticks];
        String length_of_sticks = sc.nextLine();
        sticks = length_of_sticks.split(" ");

//        for (String stick : sticks) {
//            System.out.println(stick);
//        }
        sol.no_ofSticks_cut(sticks);
    
    }
}
