public class Author {
    int id;
    String name;
    String age ;


    public Author(int id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }



    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
