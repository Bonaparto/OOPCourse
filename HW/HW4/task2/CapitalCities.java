package HW.HW4.task2;

public class CapitalCities <K, V> {
    public K country;
    public V capital;

    public CapitalCities(K country, V capital) {
        this.country = country;
        this.capital = capital;
    }   

    public V getCapital() {
        return capital;
    }

    public K getCountry() {
        return country;
    }

    public void setCapital(V capital) {
        this.capital = capital;
    }
}   
