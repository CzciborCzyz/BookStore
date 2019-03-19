import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main  {
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


            bookList.add(new Book(Integer.parseInt(parts[0]), parts[1], parts[2],
                    Integer.parseInt( parts[3]), parts[4], author1, category));


        }
        bufferedReader.close();
    }


    public static void readAuthorsFromCsv() throws IOException {
        FileReader fileReader = new FileReader("authors.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String text;
        while ((text = bufferedReader.readLine()) != null) {
            String[] parts = text.split(";");
            authorList.add(new Author(Integer.parseInt(parts[0]), parts[1], parts[2]));
        }
        bufferedReader.close();//TODO TEST
    }

    public static void readCategories() throws IOException {
        FileReader fileReader = new FileReader("categories.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String text;
        while ((text = bufferedReader.readLine()) != null) {
            String[] parts = text.split(";");
            categoryList.add(new Category(Integer.parseInt(parts[0]), parts[1], Integer.parseInt(parts[2])));
        }
        bufferedReader.close();//TODO TEST
    }

    public static void addAuthor() throws IOException {

        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj id autora");
        String id = odczyt.nextLine();
        System.out.println("Podaj imie i nazwisko autora:");
        String name = odczyt.nextLine();
        System.out.println("Podaj wiek ");
        String age = odczyt.nextLine();
        Author autor = new Author(Integer.parseInt(id), name, age);
        authorList.add(autor);


    }

    public static void addCategory() throws IOException {
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj id kategori");
        String nr = odczyt.nextLine();
        System.out.println("Podaj kategorie");
        String kategoria = odczyt.nextLine();
        System.out.println("Podaj typ ");
        String type = odczyt.nextLine();
        Category category = new Category(Integer.parseInt(nr), kategoria, Integer.parseInt(type));
        // Integer.parseInt(nr),nameCategory,Integer.parseInt(type
        categoryList.add(category);

    }

    public static void saveFile() throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("smiecitxt.csv"))) {

            //String content = authorList
            for (Author author : authorList) {

                bw.write(author.id + ";" + author.name + ";" + author.age +"\n");


            }


        } catch (IOException e) {

        }
    }
    public static void renameIndexOfFile() {
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Wybierz kategorie  do edycji");
        String e = "";
        for (Category category : categoryList) {
            e = e + category.getNr()+" . " + category.getNameCategory() + "\n";

        }
        System.out.println(e);
        int number = Integer.parseInt(odczyt.nextLine());
        System.out.println("Jak chcesz nazwac");
        String newName = odczyt.nextLine();
        for (Category category : categoryList) {
            if(category.getNr()==number){
                category.setNameCategory(newName);
            }

        }
        System.out.println(categoryList);

    }
        public static void getBooksFromCategory (){
        List<Book>booksCategory = new ArrayList<>();
        for (Book book : bookList) {
            if(book.category.getNameCategory().equals("Wzorce projektowe")){
                booksCategory.add(book);
            }
        }
        System.out.println(booksCategory);

    }
    public static void getBooksByAuthor (){
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj nazwisko autora");
        String nameAuthor = odczyt.nextLine();
        for (Book book : bookList) {
            if(book.authors.name.equals(nameAuthor)) {
                System.out.println(book);

            }


            }





    }


    public static void main(String[] args) throws IOException {
        readAuthorsFromCsv();
        readCategories();
        readFile();
        saveFile();
        Scanner odczyt = new Scanner(System.in);
        while (true) {
            System.out.println("Wybierz zadanaie");
            System.out.println("1.Wyswietl Ksiazki");
            System.out.println("2.Wyswietl Autorow");
            System.out.println("3.Wyswietl kategorie");
            System.out.println("4.Wyjdz z menu");
            System.out.println("5.Dodaj autora");
            System.out.println("6.Dodaj kategorie");
            System.out.println("7.Zapisz plik");
            System.out.println("8.Sprawdz czy ksiazka została wydana przed 2000");
            System.out.println("9.Edytuj nazwe kategori ");
            System.out.println("10.Wydrukuj ksiażki z kategorii Wzorce Projektowe");
            System.out.println("11.Wydrukuj ksiazki tego samego autora");
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
            } else if (choice.equals("4")) {

            } else if (choice.equals("5")) {
                addAuthor();
            } else if (choice.equals("6")) {
                addCategory();
            } else if (choice.equals("7")) {

                saveFile();
            } else if(choice.equals("8")){
                BookFunction bookFunction = new BookFunction();
                List<Book> namesList =  bookFunction.checkIfBookWasRealseBefor2003(bookList);
                System.out.println(namesList);
            } else if(choice.equals("9")){
                renameIndexOfFile();


            }
            else if(choice.equals("10")){
                getBooksFromCategory();
            }
            else if(choice.equals("11")){
                getBooksByAuthor();

            }
            else {
                System.out.println("Błąd wyboru");


            }

        }
    }
}







