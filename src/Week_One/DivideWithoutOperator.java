package Week_One;

public class DivideWithoutOperator {

    public static void divideWithoutOperator(int dividend,int divisor){

        int division = 0;

        if (dividend>=divisor){
            for (int i = divisor; i <= dividend ; i+=divisor) {
                division++;
            }
        }
        System.out.println(division);
    }

    public static void main(String[] args) {

        divideWithoutOperator(1,1);


    }

}
