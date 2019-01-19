import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LanguageDetection {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("HELLO", "ENGLISH");
        map.put("HOLA", "SPANISH");
        map.put("HALLO", "GERMAN");
        map.put("BONJOUR", "FRENCH");
        map.put("CIAO", "ITALIAN");
        map.put("ZDRAVSTVUJTE", "RUSSIAN");

        int i = 1;
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        while(!input.equalsIgnoreCase("#")) {
            String output = map.get(input);
            if(output == null){
                System.out.println("Case " + i +": " + "UNKNOWN");
            } else {
                System.out.println("Case " + i +": " + output);
            }
            i++;
            input = in.next();
        }
    }
}
