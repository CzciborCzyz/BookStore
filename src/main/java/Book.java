import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
public class Book {
    int id ;
    String tittle;
    String year;
    String ibdn;
    String cover;
   List<Authors> idAuthors;
   Categories idCategories;

    public Book(int id, String tittle, String year, String ibdn, String cover, List<Authors> idAuthors, Categories idCategories) {
        this.id = id;
        this.tittle = tittle;
        this.year = year;
        this.ibdn = ibdn;
        this.cover = cover;
        this.idAuthors = idAuthors;
        this.idCategories = idCategories;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", tittle='" + tittle + '\'' +
                ", year='" + year + '\'' +
                ", ibdn='" + ibdn + '\'' +
                ", cover='" + cover + '\'' +
                ", idAuthors=" + idAuthors +
                ", idCategories=" + idCategories +
                '}';
    }
}


