package OOPAbInterfeteTEMARestaurant;

public class MeniuVegan extends Restaurant implements MeniuVeganInt{
    public MeniuVegan(String numeRestaurant, String specificRestaurant, String orarRestaurant) {
        super(numeRestaurant, specificRestaurant, orarRestaurant);
    }

    @Override
    public void angajeazaBucatarVegan() {
        System.out.println("Restaurantul vegan angajeaza bucatar specializat in pregatirea mancarurilor vegane");
    }

    @Override
    public void creeazaMeniuVegan() {
        System.out.println("Restaurantul vegan creeaza meniu pentru persoanele vegane");
    }

    @Override
    public void cumparaMateriePrimaVegana() {
        System.out.println("Restaurantul vegan contacteaza furnizori de materie prima vegana");
    }
}
