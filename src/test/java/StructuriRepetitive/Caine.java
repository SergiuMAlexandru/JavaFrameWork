package StructuriRepetitive;

import org.testng.annotations.Test;

public class Caine {
    //Structuri repetitive= for, while, for each


    @Test

    public void metoda_test(){
       // afisare_numere_for();
        //afisare_numere_while();
       // afisare_nume_for();
        //calcul_numeric();
        afisare_nr_divizibil();


    }

    // Afisam primele 10 numere cu FOR si WHILE

    public void afisare_numere_for(){
        for (Integer index=0; index<10; index=index+1){  //++ se pune astfel cand se creste din 1 in 1
            System.out.println(index);
        }

    }

    public void afisare_numere_while(){
        Integer index=0;
        while (index<10) {
            System.out.println(index);
            index++;

        }
    }

    // Afisam numele nostru de 5 ori

    public void afisare_nume_for(){
        for (Integer index=0; index<5; index++){ //nu conteaza ce printam, intervalul se defineste mereu cu integer
            System.out.println("Gologan");
        }
    }

    //Calculam suma primelor 10 numere cu WHILE

    public void calcul_numeric(){
        Integer index=0;
        Integer suma_numere=index;
        while (index<=10){
            suma_numere=suma_numere+index;
            index++;

        }
        System.out.println("Suma numerelor este "+suma_numere);
    }

    //Afisam primele 3 numere divizibile cu 5

    public void afisare_nr_divizibil(){
        Integer a=0;
        for (Integer index=0; index<21; index++){
            if (index%5==0 && a<3){
                a++;
                System.out.println(index);
            }

            // SAU SE POATE FACE CU ASTFEL
            // if (a==3){
               // break;
            //}

        }

    }
}
