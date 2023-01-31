import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    // Method to check for valid string
    static boolean validBinary(String str) {
        // regular expression for invalid string
        String regex = "^[0-1]*$";

        // compiling regex
        Pattern p = Pattern.compile(regex);

        // Matcher object
        Matcher m = p.matcher(str);

        return m.find();
    }

    public static void main(String[] args) {
        int int1 = 0;
        int int2 = 0;
        Stack<String> errorMsg = new Stack<>();
        Scanner KB = new Scanner(System.in);

        System.out.println("arg1 >");

        String arg1 = KB.next();

        if (validBinary(arg1)) {
            int1 = Integer.parseInt(arg1, 2);
        } else {
            errorMsg.push("arg1 is not binary");
        }

        String arg2 = KB.next();

        if (validBinary(arg2 + "")) {
            int2 = Integer.parseInt(arg2, 2);
        } else {
            errorMsg.push("arg2 is not binary");
        }

        if (errorMsg.size() == 0) {
            int sum = int1 + int2;

            System.out.println(arg1 + " + " + arg2 + " = " + Integer.toBinaryString(sum));
        } else {
            for (String s : errorMsg) {
                System.out.println(s);
            }
        }
    }
}
