import java.util.Locale;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class mavenPractice {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please your favorite quote.");
        String resp = scanner.nextLine();
        System.out.println("You Entered: " + resp);

//        My solution: checks if there is a number anywhere in the input
        if(StringUtils.containsAny(resp, "1234567890")){
            System.out.println("You entered a string that contains a number.");
        }else{
            System.out.println("Your quote does not contain any numbers.");
        };

//        instructor example
//        if(!StringUtils.isNumeric(resp)){
//            System.out.println("This is not a number");
//        } else {
//            System.out.println("This is a number.");
//        };

        System.out.println("Flipped Case: " + StringUtils.swapCase(resp));
        System.out.println("Reversed: " + StringUtils.reverse(resp));


    }
}
