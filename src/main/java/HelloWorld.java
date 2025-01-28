public class HelloWorld {


    public static void main(String[] args) {

        System.out.println("Hello World!");
        System.out.println("Hallo nf-java-onl-de-270125");


        int age = 28;

        System.out.println(age);

        age = 35;

        System.out.println(age);

        String myName = "Florian";

        System.out.println(myName);

        boolean isFullAge = true;

        System.out.println(isFullAge);

        System.out.println(age + 3);
        System.out.println(age - 3);
        System.out.println(age * 3);
        System.out.println(age / 3);

        System.out.println("Hallo" + myName);
        System.out.println(myName + age);

        String newAge = myName + age;

        isFullAge = age == 35;
        System.out.println(isFullAge);

        System.out.println(age != 35);
        System.out.println(age > 18);
        System.out.println(age < 18);
        System.out.println(age <= 18);

        System.out.println(age == 36 || myName == "Florian");
    }

}
