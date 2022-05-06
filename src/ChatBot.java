import java.util.*;
public class ChatBot {
    public static void main(String[] args) throws Exception {
        
        Scanner s = new Scanner(System.in);
        Greeting();
        AskForName();
        GuessAge();
        Counting();
        RandomQuestion();

    }

    //greeting method
    public static void Greeting() {
        System.out.println("Hello User!");
        System.out.println("Hello");
    }
    //Asking for name
    public static void AskForName() {
        Scanner s = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = s.nextLine();

        System.out.println("Hello " + name + " nice to meet you.");
    }
    //Guessing age
    public static void GuessAge() {
        Scanner s = new Scanner(System.in);
        
        while(true) {
            System.out.println("Take a guess at age");
            int x = s.nextInt();

            if (x == 39) {
                System.out.println("you are correct");
                break;
            }
            if (x < 39) {
                System.out.println("your guess is too low");
            } 
            if (x > 39) {
                System.out.println("your guess is too high");
            }
        }
    }

    //Counting any number they want
    public static void Counting () {
        Scanner s = new Scanner(System.in);

            System.out.println("What number would you like to count to?");
            int number = s.nextInt();
    
            for (int i = 1; i <= number; i++){
                System.out.println(i);
            }
    }

    //Random question...
    public static void RandomQuestion () {
        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.println("What is my favorite color");
            System.out.println("A. Black");
            System.out.println("B. Green");
            System.out.println("C. Red");
            System.out.println("D. Blue");
    
            char input = s.next().charAt(0);
            
            char upperCaseInput = Character.toUpperCase(input);

            if(upperCaseInput == 'A') {
                System.out.println("Correct");
                break;
            }
            if (upperCaseInput != 'A') {
                System.out.println("Wrong");
            }
        }
    }
}
