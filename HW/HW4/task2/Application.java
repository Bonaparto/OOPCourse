import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        ArrayList<CapitalCities<String, String>> arr = new ArrayList<>();
        CapitalCities<String, String> cc = new CapitalCities<>("Kazakhstan", "Astana");
        arr.add(cc);
        for(CapitalCities<String, String> c: arr) {
            if(c.getCountry() == "Kazakhstan")
                System.out.println(c.getCapital());
        }
    }
}
