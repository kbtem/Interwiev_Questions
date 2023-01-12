package Week_One;

public class DivideWithoutOperator {

    public static void divideWithoutOperator(int dividend,int divisor){

        int division = 0;

        if (dividend>=divisor){

                            //2         //4
            for (int i = divisor; i <= dividend ; i+=divisor) {
                division++;
            }
        }
        System.out.println(dividend + " divided by " + divisor + " is: " + division);
    }

    public static void main(String[] args) {

        divideWithoutOperator(4,2);


    }

}
