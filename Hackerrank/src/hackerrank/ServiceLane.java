package hackerrank;

import java.util.Scanner;
public class ServiceLane {
    
    public int returnMin(String[] a, int b, int c)
    {
        int min = Integer.parseInt(a[b]);
        for (int i = b; i <=c; i++) {
            if(Integer.parseInt(a[i]) < min)
            { 
                min = Integer.parseInt(a[i]);
            }
        }
        return min;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ServiceLane sol = new ServiceLane();
        /*taking N and T*/
        //System.out.println("Enter N and T: ");
        String s = sc.nextLine();
        String[] word = new String[2];
        word = s.split(" ");
        //System.out.println(word[0]);
        //System.out.println(word[1]);
        int a = Integer.parseInt(word[0]);
        int b = Integer.parseInt(word[1]);

        /*taking N different values*/
        //System.out.println("Enter different N:");
        String values = sc.nextLine();
        String[] value = new String[a];
        value = values.split(" ");
//        for (int i = 0; i < value.length; i++) {
//            System.out.print(value[i]+" ");
//        }
        //System.out.println("");
        
        /*taking test case from diffferent i to j*/
        int[] I = new int[b];
        int[] J = new int[b];
        String[] line = new String[2];
        String testcases;
        for (int i = 0; i < b; i++) {
            testcases = sc.nextLine();
            line = testcases.split(" ");
            I[i] = Integer.parseInt(line[0]);
            J[i] = Integer.parseInt(line[1]);
        }
    
        /*taking out the minimum from the array from position I to J*/
        int vehicle;
        try {
            for (int i = 0; i <= b; i++) {
            vehicle = sol.returnMin(value, I[i], J[i]);
            System.out.println(vehicle);
        }
        } catch (Exception e) {
        }
    }
}