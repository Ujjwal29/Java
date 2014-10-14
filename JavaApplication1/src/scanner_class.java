/*nextLine() and close() are part of the API for the Scanner class,
An API is a software-to-software interface, not a user interface. With APIs, applications talk to each other without any user 
knowledge or intervention. When you buy movie tickets online and enter your credit card information, the movie ticket Web site 
uses an API to send your credit card information to a remote application that verifies whether your information is correct. 
Once payment is confirmed, the remote application sends a response back to the movie ticket Web site saying it's OK to issue 
the tickets.*/
import java.util.Scanner;
public class scanner_class {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your name is "+ name+".");
        sc.close();
             
    }
}
