package coursera;
import java.io.*;

public class binarySearch {
    
    public int bin_Search(int[] a, int key)
    {
        int high = a.length-1;
        int low = 0;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(key < a[mid])
            {
                high = mid-1;
            }
            
            else if(key>a[mid])
            {
                low = mid +1;
            }
            
            else 
            {
                return key;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        binarySearch bs = new binarySearch();
        int[] a = new int[10];

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Coursera\\hello.txt"));
//            FileReader fr = new FileReader("C:\\Coursera\\hello.txt");
            int i = 0;
            String line;
            while((line = reader.readLine())!= null)    
            {
                a[i] = Integer.parseInt(line);
                System.out.println(line+" "+ a[i]);
                i++;
            }
        } catch (Exception e) {
        }

        int result = bs.bin_Search(a, 79);
        System.out.println("\n"+result+" found");
    }
}
