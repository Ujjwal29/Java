/*
1)Lazy approach.
2)Find root.
3)Do union.
 */

package coursera;

public class QuickUnionUF {
    private int[] id;
    public QuickUnionUF(int N)
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
        //System.out.println(id[i]);
    }
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        QuickUnionUF qu = new QuickUnionUF(100000000);
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
    }
}
