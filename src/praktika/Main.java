package praktika;

public class Main {
    public static void main(String[] args) {
        Tufli tufli1 = new Tufli();
        Tufli tufli2 = new Tufli();
        Tufli tufli3 = new Tufli();

        Sapogi sapogi1 = new Sapogi();
        Sapogi sapogi2 = new Sapogi();
        Sapogi sapogi3 = new Sapogi();

        Obuvi[] obuvis = new Obuvi[6];
        obuvis[0] = sapogi1;
        obuvis[1] = sapogi2;
        obuvis[2] = sapogi3;
        obuvis[3] = tufli1;
        obuvis[4] = tufli2;
        obuvis[5] = tufli3;

        for (Obuvi o:obuvis){
            o.pochinit();
        }


    }
}
