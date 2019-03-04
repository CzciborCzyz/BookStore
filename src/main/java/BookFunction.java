import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookFunction {

    public Book znajdz(List<Book> bookis, String ibdn) {
        for (int i = 0; i < bookis.size(); i++) {
            if (bookis.get(i).ibdn.equals(ibdn)) {
                return bookis.get(i);
            }
        }
        return null;
    }


//    Zwróć sumę lat wydania wszystkich książek.
//    Zwróć liczbę książek wydanych po 2007 roku.
//    Zwróć informacje o tym czy wszystkie książki w naszym katalogu są wydane po 2000 roku.
//    Zwróć średni rok wydania książki w naszym katalogu

    //    Zwróć dwie ostatnie książki.
    public List<Book> znajdz2(List<Book> books) {
        return books.subList(4, 6);
    }


//    //Zwróć najwcześniej wydana książkę.
//    public Book oldestBook(List<Book> bookies) {
//        for (int i = 0; i < bookies.size(); i++) {
//            if (bookies.get(i).year == year) {
//                return bookies.get(i);
//
//            } TODO
//
//        }
//        return null;
//    }
//    //    Zwróć najpóźniej wydana książkę.

    //    Zwróć sumę lat wydania wszystkich książek.
    public int dodaj(List<Book> bookies) {
        int suma = 0;
        for (Book book : bookies) {
            suma = suma + book.year;
        }
        return suma;

    }

    public List<Book> checkIfBookWasRealesAfter2007(List<Book> bookies) {
        List<Book> booksAfter2007 = new ArrayList<>();

        for (Book booky : bookies) {
            if (booky.year >= 2007) {
                booksAfter2007.add(booky);


            }

        }
        return booksAfter2007;

    }

    public boolean checkIfbooksIsRealesAfter2000(List<Book> bookies) {
        for (Book booky : bookies) {
            if (booky.year < 2000) {
                return false;
            }
        }
        return true;
    }

    public double returnMiddleAge(List<Book> bookies) {
        double sum = 0;
        for (Book booky : bookies) {
            sum = sum + booky.year;

        }
        return sum / 6;
    }

    // Zwróć informacje o tym czy jakakolwiek książka w naszym katalogu jest wydana przed  2003 rokiem.
    public List<Book> checkIfBookWasRealseBefor2003(List<Book> bookies) {
        List<Book> bookRealseBefor = new ArrayList<>();
        for (Book booky : bookies) {
            if (booky.year < 2003) {
                bookRealseBefor.add(booky);
            }

        }

        return bookRealseBefor;

    }

    //Zwróć wszystkie książki, których tytuł zaczyna się od litery “P” i były one wydane po 1900 roku.
//StarsWith
    public List<Book> checkIfStarsWithP(List<Book> bookies) {
        List<Book> checkP = new ArrayList<>();
        for (Book book : bookies) {
            if (book.year > 1900 && book.tittle.startsWith("P")) {
                checkP.add(book);
            }
        }
        return checkP;

    }

    public List<Book> searchIfYeardivide2(List<Book> bookies) {
        List<Book> searchIf = new ArrayList<>();
        for (Book booky : bookies) {
            if (booky.year % 2 == 0) {
                searchIf.add(booky);

            }
        }
        return searchIf;
    }
    public Map<String ,Book>returnMap (String ibdn, List<Book>bookies) {
        Map<String, Book> returnM = new HashMap<>();
        returnM.put(ibdn, (Book) bookies);
        return returnM;
        // TODO
    }


}























