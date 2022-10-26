import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println(years(generateRandomAge(), 542));
        System.out.println(years(generateRandomAge(), -50));
        System.out.println(years(generateRandomAge(), 10));
        System.out.println(years(generateRandomAge(), 10));
        System.out.println(years(generateRandomAge(), 10));
    }

        private static String years (int oldd, int degree) {

            if (oldd >= 20 && oldd <= 45 && degree > -20 && degree < 30)
                return ("можно1 ли идти гулять");

            else if (oldd < 20 && degree >= 0 && degree <= 28)
                return ("можно2 идти гулять");
            else if (oldd > 45 && degree > -10 && degree < 25) {
                return ("можно3 идти гулять");
            } else {
                return ("оставайтесь дома");

            }
     }


    public static int generateRandomAge() {
        Random random = new Random();
        int ran = random.nextInt(100);
        return ran +=1;
    }

}






