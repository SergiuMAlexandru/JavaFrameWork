package OOPAbInterfeteTEMARestaurant;

public class Restaurant {

    private String numeRestaurant;
    private String specificRestaurant;
    private String orarRestaurant;

    public Restaurant(String numeRestaurant, String specificRestaurant, String orarRestaurant) {
        this.numeRestaurant = numeRestaurant;
        this.specificRestaurant = specificRestaurant;
        this.orarRestaurant = orarRestaurant;
    }

    public String getNumeRestaurant() {
        return numeRestaurant;
    }

    public void setNumeRestaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
    }

    public String getSpecificRestaurant() {
        return specificRestaurant;
    }

    public void setSpecificRestaurant(String specificRestaurant) {
        this.specificRestaurant = specificRestaurant;
    }

    public String getOrarRestaurant() {
        return orarRestaurant;
    }

    public void setOrarRestaurant(String orarRestaurant) {
        this.orarRestaurant = orarRestaurant;
    }

    public void infoRestaurant(){
        System.out.println("Numele restaurantului este: " + getNumeRestaurant());
        System.out.println("Specificul restaurantului este: " + getSpecificRestaurant());
        System.out.println("Orarul de functionare al restaurantului este: " + getOrarRestaurant());
    }
}
