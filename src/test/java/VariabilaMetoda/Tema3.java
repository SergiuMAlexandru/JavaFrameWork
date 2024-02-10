package VariabilaMetoda;

import org.testng.annotations.Test;

public class Tema3 {

    @Test

    public void metoda_test() {
        //verificare_numar(7.00,8.88,34.15);
        //afisare_DA_for();
        //afisare_DA_while();
        //afisare_nr_div3_for();
        //afisare_nr_div3_while();
        //afisare_nr_div5_for();
        //afisare_nr_div5_while();
        //afisare_nr_pare_while();
       // afisare_nr_pare_for();
        //suma_numere_while();
        //suma_numere_for();
        //produs_numere_for();
        produs_numere_while();


    }

    //Citim 3 numere cu valori diferite.Daca suma primelor 2 numere este mai mare decat al 3 lea numar afisam un mesaj corespunzator +valoarea sumei, altfel afisam contrariul

    public void verificare_numar(Double a, Double b, Double c) {
        //Double a=3.23;
        //Double b=7.00;
        //Double c=14.56;
        Double suma = a + b;


        if (suma > c) {
            System.out.println("Suma primelor 2 numere este mai mare decat al 3 lea numar si este " + suma);
        } else
            System.out.println("Suma primelor 2 numere este mai mica decat al 3 lea numar care este " + c);
    }

    //Afiseaza de 5 ori cuvantul "DA" pe acelasi rand cu un spatiu intre
    public void afisare_DA_for() {
        for (Integer index = 0; index < 5; index++) {
            System.out.print("DA ");
        }
    }

    public void afisare_DA_while() {
        Integer index = 0;
        while (index < 5) {
            System.out.print("DA ");
            index++;
        }
    }
    //Primele 5 numere divizibile cu 3

    public void afisare_nr_div3_for() {
        Integer count = 0;
        for (Integer index = 0; index < 50; index++) {
            if (index % 3 == 0 && count < 5) {
                count++;
                System.out.println(index);
            }
        }
    }

    public void afisare_nr_div3_while() {
        Integer index = 0;
        Integer count = 0;
        while (index < 50) {
            if (index % 3 == 0 && count < 5) {
               System.out.println(index);
               count++;
            }
             index++;
        }
    }

    //Primele 3 numere dibizibile cu 5

    public void afisare_nr_div5_for() {
        Integer count = 0;
        for (Integer index = 0; index < 50; index++) {
            if (index % 5 == 0 && count < 3) {
                count++;
                System.out.println(index);
            }
        }
    }

    public void afisare_nr_div5_while() {
        Integer count = 0;
        Integer index = 0;
        while (index < 50) {
            if (index % 5 == 0 && count < 3) {
                System.out.println(index);
                count++;
            }
            index++;

        }

    }

    //Primele 4 numere pozitive si pare

    public void afisare_nr_pare_while(){
        Integer count=0;  //numara nr gasite
        Integer nr=1;   // numarul curent pe care il verificam si de la care incepem
        while (count < 4){
            if (nr%2==0){
                System.out.println(nr);
                count++;
            }
            nr++;
        }
    }

    public void afisare_nr_pare_for(){
        Integer count=0;
        for (Integer index=1; index< 60; index++){
            if (index%2==0 && count<4){
                System.out.println(index);
                count++;
            }
        }
    }

    // Suma numerelor pana la 10

    public void suma_numere_while(){
        Integer index=0;
        Integer suma=0;
        while (index <11){
            suma=suma+index;
            index++;
        }
        System.out.println("Suma numerelor pana la 10 este:"+ suma);
    }

    public void suma_numere_for(){
        Integer suma=0;
        for (Integer index=0; index<11; index++){
            suma=suma+index;
        }
        System.out.println("Suma numerelor pana la 10 este:"+ suma);
    }

    //Produsul numerelor pana la 5

    public void produs_numere_for(){  //Ambele variabile vor avea valoarea 1 ca punct de inceput, inmultirea cu 0 nefiind relevanta in acest caz
        Integer produs=1;
        for (Integer index=1; index <6; index++){
            produs=produs*index;
        }
        System.out.println("Produsul numerelor pana la 5 este:"+produs);
    }

    public void produs_numere_while(){
        Integer index=1;
        Integer produs=1;
        while (index <6){
            produs=produs*index;
            index++;
        }
        System.out.println("Produsul numerelor pana la 5 este:"+produs);
    }
}






