import com.sun.xml.internal.bind.v2.TODO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookFunctionTest {
   BookFunction bookFunction = new BookFunction();

   List<Book> books = new ArrayList<>();

   @Before
 public void metoda() {

    books.add(new Book(132,"Buszujący w zbożu","IBDN25",1956,"T",null,null));
    books.add(new Book(155,"Władca Pierscieni","IBDN01",1939,"T",null,null));
    books.add(new Book(105,"Faust","IBDN25",1822,"M",null,null));
    books.add(new Book(666,"Potop","IBDN23",1903,"M",null,null));
    books.add(new Book(132,"Detoks","IBDN88",2015,"T",null,null));
    books.add(new Book(133,"Wojna","IBDN123",1920,"T",null,null));


}

   @Test
   public void test() {
      Book znajdz = bookFunction.znajdz( books, "IBDN25");
      Assert.assertEquals("Buszujący w zbożu", znajdz.tittle);

   }
   @Test
   public void test2(){
      List <Book> znajdz2 = bookFunction.znajdz2(books);
      System.out.println(znajdz2);
      Assert.assertEquals(znajdz2.get(0).tittle, "Detoks");
      Assert.assertEquals(znajdz2.get(1).tittle, "Wojna");
   }
//   @Test
//   public void test3(){
//      List<Book> = bookFunction.oldestBookStream(books);
// System.out.println(oldestBookStream);
// }

@Test
   public void test5(){
      int dodaj = bookFunction.dodaj(books);
      Assert.assertEquals(11548,dodaj);

}
@Test
public void test5Stream(){
      int dodajStream = bookFunction.dodajStream(books);
      Assert.assertEquals(11597,dodajStream);
}
@Test
   public void test6() {
   List<Book> check = bookFunction.checkIfBookWasRealesAfter2007(books);
   System.out.println(check);
   Assert.assertEquals(check.get(0).tittle, "Wojna");
}


   @Test
    public void test7(){
      boolean check2000= bookFunction.checkIfbooksIsRealesAfter2000(books);
      System.out.println(check2000);
      Assert.assertEquals(false,check2000);

   }
   @Test
   public void test7Stream(){
      boolean check2000= bookFunction.checkIfbooksIsRealesAfter2000Stream(books);
      System.out.println(check2000);
      Assert.assertEquals(false,check2000);



   }
   @Test
   public void test8(){
      double returnMiddle = bookFunction.returnMiddleAge(books);
      Assert.assertEquals(1934.33,returnMiddle, 0.01);

   }
   @Test
   public void test9(){
      List<Book> relaseBefor = bookFunction.checkIfBookWasRealseBefor2003(books);
      System.out.println(relaseBefor);
      Assert.assertEquals(relaseBefor.get(1).tittle,"Władca Pierscieni");

   }
   @Test
   public void test10(){
      List<Book> withP = bookFunction.checkIfStarsWithP(books);
      System.out.println(withP);
      Assert.assertEquals(withP.get(0).tittle,"Potop" );
   }
   @Test
   public void test11(){
      List<Book>divide2 = bookFunction.searchIfYeardivide2(books);
      System.out.println(divide2);
      Assert.assertEquals(divide2.get(1).tittle,"Faust");

   }
   @Test
   public void test12(){
     // Map<String,Book>retM = bookFunction.returnMap("IBDN23",(Book));
     // TODO
   }
   @Test
   public void test13(){

   }





}
