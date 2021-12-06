package HW.HW4.task2;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        ArrayList<CapitalCities> arr = new ArrayList<>();
        CapitalCities cc = new CapitalCities("Kazakhstan", "Astana");
        arr.add(cc);
        for(CapitalCities c: arr) {
            if(c.getCountry() == "Kazakhstan")
                System.out.println(c.getCapital());
        }
    }
}
