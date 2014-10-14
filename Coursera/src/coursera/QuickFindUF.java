/*
 Problems associated with Quick Fond algo:
 1)Very slow with huge number of data.
 */

package coursera;

public class QuickFindUF {
    private int[] id;
    
    public QuickFindUF(int N)
    {
        //Constructor initialise the value of the array
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i]= i;
            //System.out.print(id[i]+" ");
        }
        System.out.println("");
    }
    
    public boolean connected(int p, int q)
    {
        //this tells whether the two points(nodes p,q) are connected(directly or indirectly) or not
        if(id[p]==id[q])
        {
            System.out.println("True");
        }
        else 
        {
            System.out.println("False");
        }
        return id[p]==id[q];
        
    }
    
    public void union(int p, int q)
    {
        //this connects two nodes p and q, and make them in the same connected component.
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if(id[i] == pid)
                id[i] = qid;
            //System.out.print(id[i]+" ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        QuickFindUF qf = new QuickFindUF(100000000);
        //new QuickFindUF(10);
        qf.connected(0,5);
        qf.union(5, 0);
        qf.connected(0,5);
        qf.union(6, 5);
        qf.union(7, 2);
        qf.union(3, 8);
        qf.union(4, 3);
        qf.union(9, 4);
        qf.connected(2, 8);
        qf.connected(3, 9);
        qf.connected(2, 5);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println(duration/1000.0+" seconds");
    }
}
