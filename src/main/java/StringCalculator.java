
import java.util.ArrayList;



public class StringCalculator {
    private static final int Value = 100;

    static int add(String input) throws Exception {
        StringBuilder delim = new StringBuilder(",\n");

        if (input.startsWith("//")) {
            delim = new StringBuilder(input.substring(input.indexOf("//") + 2, input.indexOf("\n")));
            String[] arrayOfNumbers = delim.toString().split("[,]");
            for (String s : arrayOfNumbers) {
                delim.append(s);

            }
            input = input.substring(input.indexOf("\n"));
        }
        delim = new StringBuilder("[" + delim + "]");
        return add(input, delim.toString());
    }
    public static int add(final String numbers, String delim) throws Exception {
        int Total = 0;
        String[] arrayOfNumbers = numbers.split("[" + delim + "]");
        ArrayList<Integer> negInt = new ArrayList<>();
        try {
            for (String result : arrayOfNumbers) {
                if (!result.trim().isEmpty()) {
                    int i = Integer.parseInt(result.trim());
                    if (i < 0) {
                        negInt.add(i);
                    } else if (i < Value) {
                        Total += i;
                    }
                }
            }
        }catch (Exception e){
            System.err.println("Invalid Input");
            throw new Exception("");
        }

        if(negInt.size()>1){
            StringBuilder neg = new StringBuilder();

            for (int i = 0; i < negInt.size()-1; i++) {
                neg.append(negInt.get(i)).append(", ");
            }
            neg.append(negInt.get(negInt.size() - 1));
            System.err.println( "Error : negative values  not allowed" + neg);
            throw new Exception("");
        }
        return Total;
    }


}