
package udacityprojects;

public class NameInBox {
    
    public static void name(String s)
    {
        System.out.print("+");
        for (int i = 0; i < s.length()+3; i++) {
            System.out.print("-");
        }
        
        System.out.println("+");
        System.out.print("|");
        System.out.print("  "+s);
        System.out.println(" |");
        
        System.out.print("+");
        for (int i = 0; i < s.length()+3; i++) {
            System.out.print("-");
        }
        System.out.println("+");

    }
    public static void main(String[] args) {
        name("Ujjwal");
    }
}
