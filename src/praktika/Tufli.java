package praktika;

public class Tufli extends Obuvi implements ObuvForFix {
    private String kindOfMaterial;

    @Override
    public void pochinit() {
        System.out.println("Чиним ТУФЛИ!!!");
    }

    @Override
    public String kindOfMaterial() {
        return null;
    }

    @Override
    public int condition() {
        return 0;
    }

    @Override
    public String sole() {
        return null;
    }
}
