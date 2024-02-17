package ejemploHashClase;

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Hashtable<String, String> hashPaises = new Hashtable<String, String>();

        hashPaises.put("ES", "España");
        hashPaises.put("EN", "Inglaterra");

        System.out.println(hashPaises.get("ES"));

        hashPaises.remove("ES");
        System.out.println(hashPaises.get("ES"));

    }
}
