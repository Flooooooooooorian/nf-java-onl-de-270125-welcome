public class IfMethod {


    public static void main(String[] args) {
        int floriansAge = 17;
        int maxsAge = 18;
        int tanjasAge = 19;

        checkAge(maxsAge);
        checkAge(19);
        boolean result = checkAge(17);
        System.out.println(result);

        helloWorld();
        helloWorld();

    }

    public static void helloWorld() {
        System.out.println("Hello");
        System.out.println("World");
    }

    public static boolean checkAge(int age) {

        if (age > 30) {
            System.out.println("Du bist über 30 Jahre alt!");
            return true;
        } else if (age > 18) {
            System.out.println("Du bist volljährig!");
            return true;
        } else if (age == 18) {
            System.out.println("Hey du bist genau 18!");
            return true;
        } else {
            System.out.println("Du bist NICHT volljährig!");
            return false;
        }
    }
}
