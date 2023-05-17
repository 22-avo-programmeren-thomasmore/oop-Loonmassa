public class Bediende extends Persoon {
    private double maandloon;

    public Bediende(String naam, double maandloon) {
        super(naam);
        this.maandloon = maandloon;
    }

    @Override
    public double getBerekendLoon() {
        return maandloon;
    }
}
