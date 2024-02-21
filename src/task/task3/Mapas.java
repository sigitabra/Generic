package task.task3;

import java.util.ArrayList;

public class Mapas<K, V> {
    private final ArrayList<Pora<K,V>> sarasasPoru;

    public Mapas() {
        sarasasPoru = new ArrayList<>();
    }

    public void ideti(K key, V value) {
        this.sarasasPoru.add(new Pora<>(key, value));
    }

    @Override
    public String toString() {
        return "Mapas{" +
                "sarasasPoru=" + sarasasPoru +
                '}';
    }

    public V gauti(K key) {
        for (Pora<K,V> p : sarasasPoru) {
            if (key.equals(p.getRaktas())) {
                return p.getReiksme();
            }
        }
        return null;
    }
}
