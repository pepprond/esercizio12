import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person userDetails = null;
        Scanner userInput = new Scanner(System.in);

        String name = null;
        System.out.println("hello");

        System.out.println("write your name");
        name=userInput.nextLine();

        System.out.println("write your surname");
        String surname = null;
        surname=userInput.nextLine();


        System.out.println("write your height");
        double height = 0;
        height=userInput.nextDouble();

        int age = 0;
        System.out.println("write your age");
        age=userInput.nextInt();

        userDetails = new Person(name, surname, height, age);
        System.out.printf("hello \nname: %s \nsurname: %s \nheight: %.2f \nage: %d",userDetails.getName(),userDetails.getSurname(),userDetails.getHeight(),userDetails.getAge());







    }
}