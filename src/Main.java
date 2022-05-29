public class Main {

    public static void main(String[] args) {
        System.out.println(ageTemperature(30, 60));
        System.out.println(ageTemperature(40, 80));
        System.out.println(ageTemperature(20, 10));
        System.out.println(ageTemperature(16, 4));

    }

    public static String ageTemperature(int ageOfPerson, int temperature) {


        if (ageOfPerson > 20 && ageOfPerson < 45 && temperature > -20 && temperature < 30) {
            return ("You can go for a walk");

        }
        else if (ageOfPerson < 20 && temperature > 0 && temperature < 30) {

            return ("You can go for a walk2");
        }
        else if (ageOfPerson > 45 && temperature > -10 && temperature < 25) {
            return ("You can go for a walk3");
        }
        else
            return ("Stay at home");
    }
}


