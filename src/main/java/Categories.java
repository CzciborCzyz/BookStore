public class Categories {
    int nr;
    String categories;
    int type;

    public Categories(int nr, String categories, int type) {
        this.nr = nr;
        this.categories = categories;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "nr=" + nr +
                ", categories='" + categories + '\'' +
                ", type=" + type +
                '}';
    }

}
