import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Bediende marc = new Bediende("Marc", 3000);
        System.out.println(marc.getBerekendLoon());
        Arbeider jos = new Arbeider("Jos", 20);
        jos.registreerUren(160);
        System.out.println(jos.getBerekendLoon());

        ArrayList<IBerekendLoon> lijst = new ArrayList<>();    // interface als type
        lijst.add(marc);
        lijst.add(jos);

        double totaal = 0;
        for (IBerekendLoon loon : lijst) {               // interface als type
            totaal += loon.getBerekendLoon();
        }

        System.out.println(totaal);
    }
}
