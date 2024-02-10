package Structurialternative;

import org.testng.annotations.Test;

public class Angajat {

    @Test

    public void metoda_test(){
        zilele_saptamanii(3);


    }

    //reprezentam zilele saptamanii cu switch case
    // IF evalueaza CONDITIA, mai complex daca sunt mai multe cerinte
    // SWITCH CASE evalueaza VALOAREA, stii cazurile, e mai multa certitudine

    public void zilele_saptamanii(Integer zi){
        switch (zi){
            case 1:
                System.out.println("Astazi este duminica");
                break;
            case 2:
                System.out.println("Astazi este luni");
                break;
            case 3:
                System.out.println("Astazi este marti");
                break;
            case 4:
                System.out.println("Astazi este miercuri");
                break;
        }

    }
}
