import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    static List<Book> bookList = new ArrayList<>();


    public static void readFile() throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\czcib\\Downloads\\books.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String text;
        while((text = bufferedReader.readLine()) != null){
            String[] parts = text.split(";");
            bookList.add(new Book(parts[0], parts[1], parts[2]));
        }

        bufferedReader.close();
    }
    public static void main(String[] args) throws IOException {
readFile();
        Scanner odczyt = new Scanner(System.in);
        while (true) {
            System.out.println("Wybierz zadanaie");
            System.out.println("1.Wyswietl");
            System.out.println("2.wyjscie");
            System.out.println("adres email: CheepBook.gmail.com");
            System.out.println("");
            String choice = odczyt.nextLine();

            if (choice.equals("1")) {
                System.out.println(bookList);
                System.out.println("");
            } else if (choice.equals("2")) {
                System.out.println("Wyjscie");

            } else {
                System.out.println("Błąd wyboru");

            }
        }
    }
}

