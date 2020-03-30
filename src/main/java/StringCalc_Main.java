import static java.lang.System.*;

public class StringCalc_Main {
    public static void main(String[] args) throws Exception {
        StringCalculator calculate = new StringCalculator();
        out.println("add function that can handle up to two integers passed in as a string.");
        System.out.println(calculate.add(""));
        System.out.println(calculate.add("1"));
        System.out.println(calculate.add("1,1"));

        out.println("\n");

        out.println("add function to handle multiple integers.");
        out.println(calculate.add("1,2,3,4"));

        out.println("add function to handle new lines between integers.");
        out.println(calculate.add("1\n2,3"));

        out.println("add function so that it can handle different delimeters.");
        out.println(calculate.add("//;\n1;2"));
        out.println(calculate.add("//4\n142"));

        out.println("------------------------------------------------------------");
        out.println("add function so that it can handle negative integers");
        //System.out.println(calculate.add("-1,-2,3,4"));
        out.println("--------------------------------------------------------------");
        out.println("Modify the add function so that it ignores integers greater than or equal to 1000");
       // out.println(calculate.add("//\n1000,1,2"));
        out.println("---------------------------------------------------------------");
        out.println("add function so that it can support delimiters of any length");
        out.println(calculate.add("//***\n1***2***3"));

        out.println("add function so that it is able to support different delimiters of any length");
        out.println(calculate.add("//[:D][%]\n1:D2%3"));
        out.println(calculate.add("//[***][%%%]\n1***2%%%3"));
        out.println(calculate.add("//[(-_-')][%]\n1(-_-')2%3"));
        out.println(calculate.add("//[abc][777][:(]\n1abc27773:(1"));

        out.println("add function so that it can handle invalid input");
//       out.println(calculate.add("//;\n1000;1;2;"));
//       out.println(calculate.add("1,2,3//;\n1000,1;2"));

    }
}
