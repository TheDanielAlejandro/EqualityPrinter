public class IntEqualityPrinter {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void printEqual(int a, int b, int c){
        if(a >= 0 && b >= 0 && c >= 0){
            if(a == b && b == c){
                System.out.println("All numbers are equal");
            }else if(a == b || b == c || c == a){
                System.out.println("Neither all are equal or different");
            }else{
                System.out.println("All numbers are different");
            }

        }else{
            System.out.println(INVALID_VALUE_MESSAGE);
        }
    }

}
