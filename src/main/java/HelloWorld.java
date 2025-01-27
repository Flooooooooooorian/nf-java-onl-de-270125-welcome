public class HelloWorld {


    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println("Hallo nf-java-onl-de-270125");


        int myAge = 28;

        System.out.println(myAge);

        myAge = 35;

        System.out.println(myAge);

        String myName = "Florian";

        System.out.println(myName);

        boolean isFullAge = true;

        System.out.println(isFullAge);

        System.out.println(myAge + 3);
        System.out.println(myAge - 3);
        System.out.println(myAge * 3);
        System.out.println(myAge / 3);

        System.out.println("Hallo" + myName);
        System.out.println(myName + myAge);

        String newAge = myName + myAge;

        isFullAge = myAge == 35;
        System.out.println(isFullAge);

        System.out.println(myAge != 35);
        System.out.println(myAge > 18);
        System.out.println(myAge < 18);
        System.out.println(myAge <= 18);

        System.out.println(myAge == 36 || myName == "Florian");

    }

}
