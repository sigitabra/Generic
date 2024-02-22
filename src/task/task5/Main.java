package task.task5;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        SuperPair<String, String, Integer> pirmaSuperPora = new SuperPair<>("Šiandien", "yra", 4);
        out.println(pirmaSuperPora);
        SuperPair<Double, Double, Double> antraSuperPora = new SuperPair<>(1d, 2d, 3d);
        out.println(antraSuperPora);
//        SuperPair<String, String, String> treciaSuperPora = new SuperPair<>("ar", "pavyks", "bandymas?");
//        System.out.println(treciaSuperPora);
    }
}
