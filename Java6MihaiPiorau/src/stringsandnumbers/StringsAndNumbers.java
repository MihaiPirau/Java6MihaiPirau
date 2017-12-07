/*
 *  testing homeworks string and numbers
 */
package stringsandnumbers;

/**
 *
 * @author Home
 */
public class StringsAndNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
         StringBuilder sb = new StringBuilder("Able was I ere I saw Elba.");
         int l = sb.length();
         System.out.println(l);
         
         
         String hannah = "Did Hannah see bees? Hannah did.";
         int lenHan = hannah.length();
         
         hannah.charAt(12);
         System.out.println("Stringh hannah length is: " + lenHan);
         System.out.println("String hannah .charAT 12 is: " + hannah.charAt(12));
         
          String whatIsTheString = "Was it a car or a cat I saw?".substring(9, 12);
          int lenWhatIs = whatIsTheString.length();
          System.out.println("The string is " + whatIsTheString + " and length is " + lenWhatIs);
          
          
          String hi = "Hi, ";
          String mom = "mom.";
          
          hi.concat(mom);
          System.out.println(hi.concat(mom));
          System.out.println(hi + mom);
          
          // Write a program that computes your initials from your full name and displays them.
          
          String lastName = "Pirau";
          String firstName = "Mihai ";
          
          System.out.print(firstName.charAt(0));
          System.out.println(lastName.charAt(0));
    }
    
}
