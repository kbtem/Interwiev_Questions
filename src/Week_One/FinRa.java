package Week_One;

public class FinRa {
    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {
            if (i%15==0) {
                System.out.println("FinRa");

                }else if (i%3==0){
                    System.out.println("Fin");
                }else if (i%5==0){
                    System.out.println("Ra");
                }else{
                    System.out.println(i);
                }

            }
        }

    }
