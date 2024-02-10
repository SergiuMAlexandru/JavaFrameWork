import org.openqa.selenium.interactions.SourceType;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.text.spi.DateFormatSymbolsProvider;
import java.util.Date;

public class Tema2 {
    public String mesaj_intampinare;
    public Integer varsta;
    public String nume;
    public String prenume;
    public String informatii_data;

    public String data;
    public String ora;
    public String ziua;
    public String tema;


    @Test
    public void metodatest() {
        //afisare_date();
        //calcul_matematic();
        //calcul_suma(22.2, 105.66, 56.89);
        //calcul_produs(8, 8);
        //adauga_S();
       // adauga_M();
        //ana_are_mere();
        verific_interval(8);
        verific_interval(15);
        verific_interval(7);
        verific_interval(16);
        verific_interval(12);
        verific_interval(-15);
    }


    public void afisare_date() {
        mesaj_intampinare = "Hello World";
        varsta = 37;
        nume = "Gologan";
        prenume = "Claudia";
        informatii_data = "Care ii data de astazi?";
        data = "1/13/2019";
        ora = "18:30 PM";
        ziua = "Marti/Joi";
        tema = "Poti pleca acasa dupa ce iti verific munca!";


        System.out.println(mesaj_intampinare);
        System.out.println(varsta);
        System.out.println(nume);
        System.out.println(prenume);
        System.out.println(informatii_data);
        System.out.println(data);
        System.out.println(ora);
        System.out.println(ziua);
        System.out.println(tema);

    }

    public void calcul_matematic() {
        Integer calcul1 = 3 * 4;
        Integer calcul2 = 2 + calcul1 - 3;
        Double calculfinal = (calcul2) / 3.0;

        System.out.println("Rezultatul corect este " + calculfinal);
        System.out.println(tema);

    }

    public void calcul_suma(Double variabila1, Double variabila2, Double variabila3) {
        //Double variabila1=11.2;
        //Double variabila2=17.90;
        //Double variabila3=77.78;
        Double suma = variabila1 + variabila2 + variabila3;

        System.out.println("Stiu ca am calculat bine " + suma);
        System.out.println(tema);

    }

    public void calcul_produs(Integer var1, Integer var2) {
        Integer produs = var1 * var2;

        System.out.println("Stiu ca am calculat bine " + produs);
        System.out.println(tema);
    }


    public void adauga_S() {
        String text1 = "Salut";
        Character caracter1 = 'M';
        String concatenare1 = text1 + caracter1;

        System.out.println(concatenare1);
        System.out.println(tema);

    }

    public void adauga_M() {
        String text2 = "Hello";
        Character caracter2 = 'H';
        String concatenare2 = caracter2 + text2;

        System.out.println(concatenare2);
        System.out.println(tema);
    }

    public void ana_are_mere() {
        Character caracter3 = 'Z';

        System.out.println("Ana" + caracter3 + "are" + caracter3 + "mere" + caracter3 + "pere" + caracter3 + "prune" + caracter3);
        System.out.println(tema);
    }

    //verificam daca un numar este cuprins in intervalul [8,15] - se iau si capetele de interval

    public void verific_interval(Integer nr) {
        if (nr >= 8 && nr <= 15) {
            System.out.println("Numarul " + nr + " apartine intervalului [8,15]");
        } else {
            System.out.println("Numarul " + nr + " nu apartine intervalului [8,15]");

        }

    }
}
