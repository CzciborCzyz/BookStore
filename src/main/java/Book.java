import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Book {
    String tittle;
    String year;
    String ibdn;

    public Book(String tittle, String ibdn, String year) {
        this.tittle = tittle;
        this.year = year;
        this.ibdn = ibdn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "tittle='" + tittle + '\'' +
                ", year=" + year +
                ", ibdn=" + ibdn +
                '}';
    }
}


