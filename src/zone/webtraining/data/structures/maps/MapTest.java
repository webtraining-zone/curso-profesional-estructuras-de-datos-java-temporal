package zone.webtraining.data.structures.maps;


import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {

        Map<String, Person> map = new HashMap<>();

        String email = "esmeralda@webtraining.zone";
        // Insert new pairs (key, value)
        map.put(email, new Person("Esmeralda", "Rdz", email));
        map.put(email, new Person("Esmeralda", "Rdz", email));


        Person esmeralda = map.get(email);

        if(map.containsKey("doesntexist@gmail.com")) {
            Person noone = map.get("doesntexist@gmail.com");
            System.out.println(noone);
        }

        System.out.println(esmeralda);

    }
}
