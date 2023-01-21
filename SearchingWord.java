import java.util.Scanner;

public class SearchingWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.printf("Please enter the text : ");
        String text = scan.nextLine();

        System.out.printf("Please enter the searching word : ");
        String searchingWord = scan.nextLine();

        int index = text.indexOf(searchingWord);
        if (index == -1)
            System.out.println("Searching word doesn't found");

        int counter = 0;

        while (index != -1) {
            index = text.indexOf(searchingWord, index + 1);
            counter++;
        }
        System.out.println(counter + " occurness");
    }
}