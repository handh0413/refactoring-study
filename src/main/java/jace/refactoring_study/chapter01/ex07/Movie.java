package jace.refactoring_study.chapter01.ex07;

public class Movie {
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDREN = 2;

    private String title;
    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public Price getPrice() {
        return price;
    }

    public void setPriceCode(int priceCode) {
        switch (priceCode) {
            case REGULAR:
                price = new RegularPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            case CHILDREN:
                price = new ChildrenPrice();
                break;
            default:
                throw new IllegalArgumentException("Invalid price code: " + priceCode);
        }
    }

    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }
}
