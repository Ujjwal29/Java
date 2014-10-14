package hackerrank;

import java.util.Scanner;

public class GemStone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcases = sc.nextInt();
        char a;
        int count = 0;
        int check;
        String[] rocks = new String[testcases];
        
        for (int i = 0; i < testcases; i++) {
             rocks[i] = sc.next();
        }

        int[] array = new int[26];
        //for (int i = 0; i < array.length; i++) {
          //  array[i] = 0;
            
        //}
        for (int i = 0; i < rocks[0].length(); i++) {
            int j = (int)rocks[0].charAt(i)-97;
            array[j]=1;
        }
        String s1="";
        for (int i = 0; i < array.length; i++) {
            if(array[i]==1)
                s1= s1 + (char)(i+97);
        }
        
        try {
            for (int i = 0; i < rocks.length; i++) {
            a = s1.charAt(i);
            check=0;
            for (int j = 1; j < rocks.length; j++) {
                for (int k = 0; k < rocks[j].length(); k++) {
                    if(rocks[j].charAt(k)==a)
                    {
                        check++;
                        break;
                    }
                }
                if(check == rocks.length-1)
                    count++;
            }
        }
        } catch (Exception e) {
        }
        System.out.println(count);
    }
}
