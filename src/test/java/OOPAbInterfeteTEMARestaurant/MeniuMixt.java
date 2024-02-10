package OOPAbInterfeteTEMARestaurant;

public class MeniuMixt extends Restaurant implements MeniuVeganInt, MeniuNonVeganInt{
    public MeniuMixt(String numeRestaurant, String specificRestaurant, String orarRestaurant) {
        super(numeRestaurant, specificRestaurant, orarRestaurant);
    }

    @Override
    public void angajeazaBucatarNonVegan() {
        System.out.println("Restaurantul mixt angajeaza bucatar traditional");
    }

    @Override
    public void creeazaMeniuNonVegan() {
        System.out.println("Restaurant mixt creeaza meniu non vegan");
    }

    @Override
    public void cumparaMateriePrimaNonVegana() {
        System.out.println("Restaurantul mixt contacteaza furnizori de materie prima non vegana");
    }

    @Override
    public void promoveazaRestaurantulNonVegan() {
        System.out.println("Restaurantul mix promoveaza restaurantul pe social media");
    }

    @Override
    public void angajeazaBucatarVegan() {
        System.out.println("Restaurantul mixt angajeaza bucatar specializat in prepararea mancarurilor vegane");
    }

    @Override
    public void creeazaMeniuVegan() {
        System.out.println("Restaurant mixt creeaza meniu vegan");
    }

    @Override
    public void cumparaMateriePrimaVegana() {
        System.out.println("Restaurantul mixt contacteaza furnizori de materie prima vegana");
    }
}
