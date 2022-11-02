
import java.util.ArrayList;
import java.util.Scanner;

public class LoanItem {
    private String answer;
    boolean cheackanswer;
    int integer=1;

    // making the ArrayList.
    private ArrayList<Item> listOfItems = new ArrayList<>();

    public LoanItem() { // We make the empty constructor for the ArrayList.

    }
    public void test(){ // we make the first method, and we call the " listItems".
        // we give them som value beacuse when the user press the info we want to save them in the arraylist.
        listOfItems.add(new Book(1,"test","test1"));
        System.out.println(listOfItems); // we're making the sout and put the "listofitem" inside.
    }
    public void start() { // we're making  another method that call "Start".And put the "Strat1" method in.
        start1();
        Scanner scanner1=new Scanner(System.in); // we make the Scanner. and give the scanner name.
        System.out.println("Do you want to register more Items?- y/n"); // we make the sout and ask the user?
        String answer1=scanner1.nextLine(); // we give the user the option to answer.
        if (answer.equalsIgnoreCase("y")){ // if the user want to continue he should press "y or n".
            cheackanswer=true; // if the answer is true the program will start.
        } else if (answer1.equalsIgnoreCase("n")) {
            cheackanswer=false; // if the answer is "NO".The program will stop.
            System.out.println(listOfItems); // we put the "listItem" and save the user choice.

        }
        while (cheackanswer){ // we're making  the while loop and put the condition inside.
            start(); // calling the methods.
            start1();
        }
    }
    public void start1(){ // making the second method, and we call it the start1.
        Scanner scanner=new Scanner(System.in); // we're making new scanner
        System.out.println("ITEM NO"+integer++); // write the sout.
        System.out.println("Type (B or V)"); // making another sout.
        answer=scanner.nextLine(); // taking the input form the user.
        if (answer.equalsIgnoreCase("B")){
            String type="Book";
            System.out.println("What is the title of the Book");
            String title=scanner.nextLine();
            listOfItems.add(new Book(1,type,title));
        } else if (answer.equalsIgnoreCase("V")) {
            String type1="Video";
            System.out.println("What is the title of the video");
            String title2=scanner.nextLine();
            listOfItems.add(new Video(2,type1,title2)); // save the user option inside the listItem.

        }
    }


    // getter for the ArrayList.
    public ArrayList<Item> getListOfItems() {
        return listOfItems;
    }








    }





