import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Book> bookList = new ArrayList<>();
    static List<Author> authorList = new ArrayList<>();
    static List<Category> categoryList = new ArrayList<>();


    public static void readFile() throws IOException {
        FileReader fileReader = new FileReader("books2.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String text;
        while ((text = bufferedReader.readLine()) != null) {
            String[] parts = text.split(";");
            String authorsId = parts[5];
            Category category = null;
            for (Category category1 : categoryList) {
                String categoryId = parts[6];
                if (category1.nr == Integer.parseInt(categoryId)) {
                    category = category1;
                }
            }
            Author author1 = null;
            for (Author author : authorList) {
                String authors2 = parts[5];
                if (author.id == Integer.parseInt(authorsId)) {
                    author1 = author;
                }
            }


            bookList.add(new Book(Integer.parseInt(parts[0]), parts[1], Integer.parseInt(parts[2]),
                    parts[3], parts[4], author1, category));

            bufferedReader.close();

        }
    }





        public static void readAuthorsFromCsv () throws IOException {
            FileReader fileReader = new FileReader("authors.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String text;
            while ((text = bufferedReader.readLine()) != null) {
                String[] parts = text.split(";");
                authorList.add(new Author(Integer.parseInt(parts[0]), parts[1], parts[2]));
            }
            bufferedReader.close();
        }

        public static void readCategories () throws IOException {
            FileReader fileReader = new FileReader("categories.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String text;
            while ((text = bufferedReader.readLine()) != null) {
                String[] parts = text.split(";");
                categoryList.add(new Category(Integer.parseInt(parts[0]), parts[1], Integer.parseInt(parts[2])));
            }
            bufferedReader.close();
        }
        public static void addAuthor () throws IOException{
            List<Author> authorList = new ArrayList<>();
           Scanner odczyt = new Scanner(System.in);
            System.out.println("Podaj id autora");
            String id = odczyt.nextLine();
           System.out.println("Podaj imie i nazwisko autora:");
            String name = odczyt.nextLine();
            System.out.println("Podaj wiek ");
            String age = odczyt.nextLine();
            Author autor = new Author(Integer.parseInt(id),name,age);
            authorList.add(autor);


    }


        public static void main (String[]args) throws IOException {
            readAuthorsFromCsv();
            readCategories();
//            readFile();
            Scanner odczyt = new Scanner(System.in);
            while (true) {
                System.out.println("Wybierz zadanaie");
                System.out.println("1.Wyswietl Ksiazki");
                System.out.println("2.Wyswietl Autorow");
                System.out.println("3.Wyswietl kategorie");
                System.out.println("4.Wyjdz z menu");
                System.out.println("adres email: CheepBook.gmail.com");
                System.out.println("");
                String choice = odczyt.nextLine();
                if (choice.equals("1")) {
                    System.out.println(bookList);
                    System.out.println("");
                } else if (choice.equals("2")) {
                    System.out.println(authorList);
                    System.out.println();

                } else if (choice.equals("3")) {
                    System.out.println(categoryList);
                }
                else if (choice.equals("4")){

                }
                else if(choice.equals("5")){
                    addAuthor();
                }
                {

                    System.out.println("Błąd wyboru");
                }
            }
        }
    }


