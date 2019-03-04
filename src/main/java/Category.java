public class Category {
    int nr;
    String categories;
    int type;

    public Category(int nr, String categories, int type) {
        this.nr = nr;
        this.categories = categories;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Category{" +
                "nr=" + nr +
                ", categories='" + categories + '\'' +
                ", type=" + type +
                '}';
    }

}
