package OOPAbInterfeteTEMARestaurant;

public class MeniuNonVegan extends Restaurant implements MeniuNonVeganInt{
    public MeniuNonVegan(String numeRestaurant, String specificRestaurant, String orarRestaurant) {
        super(numeRestaurant, specificRestaurant, orarRestaurant);
    }

    @Override
    public void angajeazaBucatarNonVegan() {
        System.out.println("Restaurantul non vegan angajeaza bucatar traditional");
    }

    @Override
    public void creeazaMeniuNonVegan() {
        System.out.println("Restaurantul non vegan creeaza meniu non vegan");
    }

    @Override
    public void cumparaMateriePrimaNonVegana() {
        System.out.println("Restaurantul non vegan contacteaza furnizori de materie prima non vegana");
    }

    @Override
    public void promoveazaRestaurantulNonVegan() {
        System.out.println("Restaurantul non vegan isi promoveaza afacerea pe social media");
    }
}
