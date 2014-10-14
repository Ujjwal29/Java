
package codechef;
import java.util.Scanner;
public class MarksDiscripency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of test cases: ");
        int testcases = sc.nextInt();
        
        int list_sub[][] = new int[testcases][5];
        //int list_mark[] = new int[testcases];
        int a;
        String s = "";
        //String[] words = new String[2];
        for (int i = 1; i < testcases+1; i++) {
            s = sc.nextLine();
            String[] words = new String[2];
            words = s.split(" ");
            
            a = Integer.parseInt(words[0]);
            list_sub[i][a-65] = words[1].charAt(0); 
            //list_mark[i] = sc.nextInt();
            
        }
        for (int i = 1; i < list_sub.length; i++) {
              System.out.println(list_sub[i][0]);  
//            System.out.println(list_sub.length);
//            System.out.print(list_sub[i]);
//            //System.out.print("\t"+list_mark[i]);
//            System.out.println("");
            
        }
    
    }
}
