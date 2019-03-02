
public class Book {
    int id ;
    String tittle;
    int year;
    String ibdn;
    String cover;
   String idAuthors;
   String idCategories;

    public Book(int id, String tittle, int year, String ibdn, String cover, String idAuthors, String idCategories) {
        this.id = id;
        this.tittle = tittle;
        this.year = year;
        this.ibdn = ibdn;
        this.cover = cover;
        this.idAuthors = idAuthors;
        this.idCategories = idCategories;
    }

    public Book(int id, String tittle, String year, String ibdn, String cover, String idAuthors, String idCategories) {

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


