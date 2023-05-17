public class Arbeider extends Persoon {
    private double uurloon;
    private int urenGewerkt;

    public Arbeider(String naam, double uurloon) {
        super(naam);
        this.uurloon = uurloon;
        urenGewerkt = 0;
    }

    public void registreerUren(int urenGewerkt) {
        this.urenGewerkt = urenGewerkt;
    }

    @Override
    public double getBerekendLoon() {
        return uurloon * urenGewerkt;
    }
}
