/*
Need to report the number of alphabets traversed(in total).
*/
package hackerrank;
import java.util.Scanner;

public class palindrome {
    //int count =0;
    
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
            //else{count++;}
            else
            {
                count = count + Math.abs((int)a[i] - (int)a[temp]);
            }
            temp--;
        }
        
//        if(count == 0)   {System.out.println("PALINDROME");}
//        else            {System.out.println("NOT a Palindrome "+count);}
        System.out.println(count);
        
        return 0;
    }
    
//    public void palinDrome(String s)
//    {
//        if(count==0){System.exit(0);}
//        s = s.toLowerCase();
//        int [] a= new int[s.length()];
//        for (int i = 0; i < s.length(); i++) {
//            a[i] = s.charAt(i);
//        }
//
//        int temp = a.length-1;
//        for (int i = 0; i < temp; i++) {
//            if(a[i] == (a[temp])){}
//            else
//            {
//                if((int)a[i]>(int)a[temp])  {a[i] = a[temp];}
//                else                        {a[temp] = a[i];}
//            }
//            temp--;
//        }

//        String x="";
//        for (int i = 0; i < a.length; i++) {
//            x = x+(char)a[i];
//        }
        
        //System.out.println(x);
        //System.out.println("Now a palindrome");
//    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter string : ");
        System.out.println("enter no of test cases: ");
        int testcases = sc.nextInt();
        String[] strings = new String[testcases];
        
        for (int i = 0; i < testcases; i++) {
            strings[i] = sc.nextLine();
        }
//        String s = sc.nextLine();
        palindrome pali = new palindrome();
        for (int i = 0; i < strings.length; i++) {
            pali.palinDromeCounts(strings[i]);;
            
        }
        
        //pali.palinDrome(s);
    }
}