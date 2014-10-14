/*
1)Weighted graph/tree
2)Use of log*N function(funny iterative log function)
3)running time is linear in the real world(in practice).(Time proportional to N)This is close enough to this(called as path compression)
4)There is no such algorithm that is linear with time.
5)if we have billion operations working on billion objects then QuickFind would take 30 years and the Path compression would take 6 seconds.
 */

package coursera;

public class QuickWeightedUF {
    private int[] id;
    public QuickWeightedUF(int N)
    {
        //Constructor initialise the value of the array
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i]= i;
            //System.out.print(id[i]+" ");
        }
        System.out.println("");
    }
    
    private int root(int i)
    {
        while(i !=id[i])
        {   
            id[i]=id[id[i]];    //One one line of extra code as compared to QuickUnionUF.
            i=id[i];
        }
        //System.out.println(i);
        return i;
    }
    
    public boolean connected(int p, int q)
    {
        if(root(p)== root(q))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        return root(p)== root(q);
    }
    
    public void union(int p, int q)
    {
        int i = root(p);
        int j = root(q);
        id[i] = j;
        System.out.println(id[i]);
    }
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        
        QuickWeightedUF qu = new QuickWeightedUF(100000000);
        qu.connected(0,5);
        qu.union(5, 0);
        qu.connected(0,5);
        qu.union(6, 5);
        qu.union(2, 1);
        qu.union(7, 2);
        qu.union(3, 8);
        qu.union(4, 3);
        qu.union(9, 4);
        qu.connected(2, 8);
        qu.connected(3, 9);
        qu.connected(2, 5);
        qu.root(7);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println(duration/1000.0+" seconds");
        //System.out.println(System.currentTimeMillis());
    }
}
