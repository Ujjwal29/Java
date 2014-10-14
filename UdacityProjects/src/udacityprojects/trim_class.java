//The function "trim()" cuts down the unused parts(spaces, tabs) of the string.
package udacityprojects;

public class trim_class {
    public static void main(String[] args) {
        String messystring = " Hello,  Space!       ";
        System.out.println(messystring.trim());
        System.out.println(messystring);
        
        //first thing
        double oneMillion = 1000000;       //int won't work here
        double mystery = oneMillion* oneMillion;
        System.out.println(mystery);
    
        //second thing
        double original = 2;
        double root = Math.sqrt(original);
        double rootSquared = root*root;
        if(rootSquared==original)
        {
            System.out.println("They are same.");
        }
        
        else
        {
            System.out.println("rootSquared is "+rootSquared);
        }
        
        //third thing
        String one= "Uda";
        String two = "city";
        String oneAndtwo = one + two;
        String three = "Udacity";
        if(oneAndtwo==three)        //The thing to note is, if we use 'oneAndtwo==three' it goes to else and if we use 
                                    //oneAndtwo.equals(three) it goes to if part.
        {
            System.out.println("they are same");
        }
        
        else
        {
            System.out.println("oneAndtwo is "+oneAndtwo);
        }
    }
}
