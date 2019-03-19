public class Category {
    int nr;
    String nameCategory;
    int type;

    public Category(int nr, String nameCategory, int type) {
        this.nr = nr;
        this.nameCategory = nameCategory;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Category{" +
                "nr=" + nr +
                ", nameCategory='" + nameCategory + '\'' +
                ", type=" + type +
                '}';
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
