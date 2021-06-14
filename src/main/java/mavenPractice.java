import java.util.Locale;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class mavenPractice {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please your favorite quote.");
        String resp = scanner.nextLine();

        if(StringUtils.containsAny(resp, "1234567890")){
            System.out.println("You entered a string that contains a number.");
        }else{
            System.out.println("Your quote does not contain any numbers.");
        };

        System.out.println(StringUtils.swapCase(resp));
        System.out.println(StringUtils.reverse(resp));


    }
}
