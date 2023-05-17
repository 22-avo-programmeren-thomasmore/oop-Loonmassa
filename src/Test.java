import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Bediende marc = new Bediende("Marc", 3000);
        System.out.println(marc.getBerekendLoon());
        Arbeider jos = new Arbeider("Jos", 20);
        jos.registreerUren(160);
        System.out.println(jos.getBerekendLoon());

        ArrayList<Persoon> lijst = new ArrayList<>();
        lijst.add(marc);
        lijst.add(jos);

        double totaal = 0;
        for (Persoon persoon : lijst) {
            totaal += persoon.getBerekendLoon();
        }

        System.out.println(totaal);
    }
}
