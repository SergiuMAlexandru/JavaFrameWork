import org.testng.annotations.Test;

public class Tema1 {
    public String nume;
    public String prenume;
    public Boolean experienta;
    public Boolean masina;
    public Character sex;

    @Test

    public void testaretema(){
        angajare();
        etapa1();
    }

    public void angajare (){
        nume="Mihailescu";
        prenume="Ionut";
        experienta=true;
        masina=false;
        sex='M';

        System.out.println("Numele canditatului este "+nume);
        System.out.println("Prenumele candidatului este "+prenume);
        System.out.println("Are experienta in domeniu?"+experienta);
        System.out.println("Detine masina proprie?"+masina);
        System.out.println("Ce sex are candidatul?"+sex);


    }

    public void etapa1 (){
        Integer testaptitudini=100;
        Integer potrivireprofil=80;
        System.out.println("Sansele de angajare sunt "+potrivireprofil);

    }

}
