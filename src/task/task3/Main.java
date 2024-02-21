package task.task3;

import static java.lang.System.*;
import static task.task3.DnsProvider.*;


public class Main {
    public static void main(String[] args) {
        Mapas<DnsProvider, DnsServer> dnsMap = new Mapas<>();
        dnsMap.ideti(GOOGLE, new DnsServer("8.8.8.8", "8.8.4.4"));
        dnsMap.ideti(AMAZON, new DnsServer("169.254.169.253", "169.254.169.253"));
        dnsMap.ideti(AZURE, new DnsServer("168.63.129.16", "168.63.129.16"));

        out.println(dnsMap.gauti(GOOGLE));
        out.println(dnsMap.gauti(AMAZON));
        out.println(dnsMap.gauti(AZURE));

        out.println();
        Mapas<String, String> stringMaps = new Mapas<>();
        stringMaps.ideti("Rytas", "Good morning!");
        stringMaps.ideti("Diena", "Good day!");
        stringMaps.ideti("Vakaras", "Good evening!");

        out.println(stringMaps.gauti("Rytas"));
        out.println(stringMaps.gauti("Diena"));
        out.println(stringMaps.gauti("Vakaras"));
    }


}
