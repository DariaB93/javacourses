package praktika;

public class Sapogi extends Obuvi implements ObuvForFix{


    @Override
    public void pochinit() {
        System.out.println("Чиним Сапоги!!!");
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

