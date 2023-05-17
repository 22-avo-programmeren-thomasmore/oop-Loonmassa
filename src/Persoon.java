abstract public class Persoon implements IBerekendLoon {    // abstracte klasse
    private String naam;

    public Persoon(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    abstract public double getBerekendLoon();   // abstracte methode heeft geen body

}
