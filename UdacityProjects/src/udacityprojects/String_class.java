//even though we change the river to UpperCase, JAVA retains a original copy of a variable which we can use later.
package udacityprojects;

public class String_class {
    public static void main(String[] args) {
        String river = "Mississipi";
        
        System.out.println(river.toLowerCase());
        System.out.println(river.toUpperCase());
        System.out.println(river.replace('i', 'x'));
        System.out.println(river);
    }
}
