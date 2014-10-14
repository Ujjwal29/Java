package hackerrank;


import java.util.Scanner;
public class TheLoveLetterMystery {
    
    public int palinDromeCounts(String s)
    {
        int count =0;
        int [] a= new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            a[i] = s.charAt(i);
        }

        int temp = a.length-1;
        for (int i = 0; i < temp; i++) {
            if(a[i]==(a[temp])){}
            else
            {
                count = count + Math.abs((int)a[i] - (int)a[temp]);
            }
            temp--;
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testcases = sc.nextInt();
        String[] strings = new String[testcases];
        
        for (int i = 0; i < testcases; i++) {
            
            strings[i] = sc.next();;
        }

        TheLoveLetterMystery pali = new TheLoveLetterMystery();
        int answer;
        try {
            for (int i = 0; i < testcases+1; i++) {
            answer = pali.palinDromeCounts(strings[i]);
            System.out.println(answer);
        }
        } catch (Exception e) {
        }
    }
}