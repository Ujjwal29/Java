//.getTime()- return the number of seconds passed till date from January 1, 1970, 00:00:00 GMT
package udacityprojects;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class DaysAlivePrinter {
    public static long daysBetween(Date d1, Date d2)
    {
        long s1 = (long)d2.getTime();
        long s2 = (long)d1.getTime();
        long total_time= s1-s2;
        return total_time/(1000*60*60*24);
        
    }
    
    public static void main(String[] args) {
        int birthday, lastday,birthMonth, lastMonth, birthYear, lastYear;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter Birthday(date): ");
        birthday = sc.nextInt();
        
        System.out.print("enter birthMonth: ");
        birthMonth = sc.nextInt();
        
        System.out.print("enter birth year: ");
        birthYear= sc.nextInt();
        
        System.out.print("enter last date: ");
        lastday = sc.nextInt();
        
        System.out.print("enter last month: ");
        lastMonth= sc.nextInt();
        
        System.out.print("enter last year: ");
        lastYear= sc.nextInt();
        
        
        
        Calendar cal1 = new GregorianCalendar(birthYear, birthMonth, birthday); 
        Calendar cal2 = new GregorianCalendar(lastYear, lastMonth, lastday);
        System.out.println("Number of days this person lived is "+daysBetween(cal1.getTime(), cal2.getTime()));
        
    }
}

