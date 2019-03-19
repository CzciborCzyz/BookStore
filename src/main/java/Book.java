import java.util.List;

public class Book {
    int id ;
    String tittle;
    String ibdn;
    int year;
    String cover;
   Author authors;
   Category category;

    public Book(int id, String tittle, String ibdn, int year, String cover, Author authors, Category category) {
        this.id = id;
        this.tittle = tittle;
        this.ibdn = ibdn;
        this.year = year;
        this.cover = cover;
        this.authors = authors;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", tittle='" + tittle + '\'' +
                ", ibdn='" + ibdn + '\'' +
                ", year=" + year +
                ", cover='" + cover + '\'' +
                ", authors=" + authors +
                ", category=" + category +
                '}';
    }
}


    //    public Book(int id, String tittle, int year, String ibdn, String cover, List<Author> authors, Category categorie) {
//        this.id = id;
//        this.tittle = tittle;
//        this.year = year;
//        this.ibdn = ibdn;
//        this.cover = cover;
//        Authors = authors;
//        Categorie = categorie;




    //    @Override
//    public String toString() {
//        return "Book{" +
//                "id=" + id +
//                ", tittle='" + tittle + '\'' +
//                ", year='" + year + '\'' +
//                ", ibdn='" + ibdn + '\'' +
//                ", cover='" + cover + '\'' +
//                ", authors=" + authors +
//                ", idCategories=" + idCategories +
//                '}';
//    }



