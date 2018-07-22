public class Main {

    public static void main(String[] args) {
	// write your code here


        int factResult = FactIterative(4);
        System.out.println("Factorial 4 is:  " + factResult);

        int factRResult = FactR(4);
        System.out.println("FactorialR 4 is:  " + factRResult);

    }

    /**
     * Recursive Factorial function
     * @param num
     * @return
     */
    public static int FactR(int num){

        // base case
        if(num == 1)
            return 1;

        return num * FactR(num -1);

    }

    /**
     * Iterative factorial function
     * @param num
     * @return
     */
    public static int FactIterative(int num){
        int result = 1;

        for(int i=1; i<= num; i++){
            result = result * i;
        }

        return result;
    }
}
