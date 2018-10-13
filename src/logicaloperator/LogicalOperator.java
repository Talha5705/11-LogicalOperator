
package logicaloperator;
import java.util.Scanner;
/**
 *
 * @author Talha Zubaer
 */
public class LogicalOperator {

    char c;
    
    public static void main(String[] args) {
        System.out.println("Enter a lowercase character");
        Scanner sc=new Scanner(System.in);
        
        char c=sc.next().charAt(0);
        
        if(c== 'a' ||c== 'e'||c=='i'||c=='o'||c=='u'){
        System.out.println("Vowel");
        }
        else 
            System.out.println("Invalid input");
        
        
    }
    
}
