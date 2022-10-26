import java.util.Random;

public class Main {

    public static void main(String[] args) {

        years(generateRandomAge(), 542);
        years(generateRandomAge(), -50);
        years(generateRandomAge(), 10);
        years(generateRandomAge(), 2);
        years(generateRandomAge(), 33);


    }

        private static int years (int oldd, int degree) {

            if (oldd >= 20 && oldd <= 45 && degree > -20 && degree < 30)
                System.out.println("можно1 ли идти гулять");

            else if (oldd < 20 && degree >= 0 && degree <= 28)
                System.out.println("можно2 идти гулять");
            else if (oldd > 45 && degree > -10 && degree < 25) {
                System.out.println("можно3 идти гулять");
            } else {
                System.out.println("оставайтесь дома");
            }
            return oldd+degree;
        }


    public static int generateRandomAge() {
        Random random = new Random();
        int ran = random.nextInt(100);
        return ran +=1;
    }

}






