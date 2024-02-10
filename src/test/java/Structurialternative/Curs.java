package Structurialternative;

import org.testng.annotations.Test;

public class Curs {
    //structurile pot sa fie de 2 feluri: alternative si repetitive
    //structurile alternative:IF...THEN...ELSE, SWITCH...CASE

    @Test
    public void test_method() {

//        verific_nr_mai_mare(7);
//        verific_nr_mai_mare(4);
//        verific_nr_mai_mare(5);
//        verific_nr_mai_mare(-6);
//        verific_nr_mai_mare(4);
//        verific_nr_mai_mare(6);
        verific_nr_par(600000);
        verific_nr_par(4);
        verific_nr_par(1);
        verific_nr_par(-3);
        verific_nr_par(9);
        verific_nr_par(7);
        verific_nr_par(-4);
        verific_nr_par(0);
//        persoana_majora(17);
//        persoana_majora(18);
//        persoana_majora(19);

    }

    //verificam daca un numar este mai mare decat 5

    public void verific_nr_mai_mare(Integer nr) {
        if (nr > 5) {
            System.out.println("Numarul " + nr + " este mai mare ca 5");
        } else {
            System.out.println("Numarul " + nr + " este mai mic ca 5");
        }
    }

    //verificam daca un numar este par si pozitiv

    public void verific_nr_par(Integer nr) {

        //daca vreau cat-ul = / (div)
        //daca vreau restul = % (mod)

        if (nr > 0) {
            if (nr % 2 == 0) {

                System.out.println("Numarul " + nr + " este par si pozitiv");
            } else {
                System.out.println("Numarul " + nr + " este impar si pozitiv");
            }
        } else if (nr < 0) {
            if (nr % 2 == 0) {

                System.out.println("Numarul " + nr + " este par si negativ");
            } else {
                System.out.println("Numarul "+ nr+ " este impar si negativ");
            }
        }
        else{
            System.out.println("Numarul "+ nr+ " este egal cu zero");
        }
    }

    //verificam daca o persoana este majora
    public void persoana_majora(Integer varsta){
       if (varsta>=18) {
           System.out.println("Persoana este majora");
       }
       else {
           System.out.println("Persoana este minora");
       }
    }
}
