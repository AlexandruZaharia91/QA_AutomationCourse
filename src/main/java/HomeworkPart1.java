import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeworkPart1 {
    int x,y,z = 10;
    int year = 24;
    String sentence = "I like Java";

    // exercise 1
    // metoda accesibila numai prin crearea unei instante                                               2w/
    public void displaySentence() {
        // afisez cu ajutorul sintaxei System.out.println(adaug in ghilimele textul pe care vreau sa il afisez)
        System.out.println("I like IT" + " fara variabila adaugata in printare");

        // afisez cu ajutorul sintaxei System.out.println(adaug variabila de tip String : sentence)
        System.out.println(sentence + " cu variabila sentence in printare");
    }


    //exercise 2
    public static void displaySentences() {
        //afiseaza propozitia “Cursul acesta este foarte fain!” de 6 ori
        System.out.println("Cursul acesta este foarte fain!");
        System.out.print("Cursul acesta este foarte fain!   ");

        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");

        System.out.print("Cursul acesta este foarte fain!   ");
        System.out.println("Cursul acesta este foarte fain!");
    }


    //exercise 3
    public void age() {
        //local variable. it cannot be accessed from outside method
        int age = year - 6;
        System.out.println("Varsta David: " + (year - 6));
        System.out.println("Varsta David: " + age);
    }



    //exercise 4

    public void readAndDisplay() {
        String readSentence;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Scrie propozitia la tastatura: ");

        readSentence = keyboard.nextLine();
        System.out.println("Afiseaza propozitia de la tastatura: " +readSentence);


    }


    public void myVariables() {
        int x = 10;
        String value = "the first program";
        boolean check = true;
        System.out.println(value + " -- "+ x + " -- "+ " -- " + check);
    }


    public String checkVariablesKeyboard(int x, String value) {
        String newValue = String.valueOf(x);
        return newValue + " <--> " +value;
    }












    public static void main(String[] args) {
        HomeworkPart1 part1 = new HomeworkPart1();
        part1.displaySentence();
        displaySentences();
        part1.age();
        part1.readAndDisplay();
        //part1.age
        part1.myVariables();
        Scanner value = new Scanner(System.in);
        int x = value.nextInt();
        String keyboardValue = value.nextLine();
        System.out.println(part1.checkVariablesKeyboard(x, keyboardValue));



    }
}
