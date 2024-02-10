package VariabilaMetoda;

import org.testng.annotations.Test;

public class Student {
    @Test
    public void metoda_test(){
        //get_marire();
        System.out.println(get_marire(30));
        calcul_medie(10.00,8.2, "semestrul 1");

    }

    //metoda care calculeaza salariul unui persoane dupa o marire salariala

    public Integer get_marire(Integer procent){
        Integer salar=15000;
        Integer marire=(salar*procent)/100;
        //Integer salar_final=salar+marire; putem face mai rapid cu return punand formula si aceasta linie se elimina
        return salar+marire;

    }
    public Double get_medie(Double n1, Double n2){
        return (n1+n2)/2;

    }

    public void calcul_medie(Double n1, Double n2, String text){
        System.out.println("Media studentului pentru "+text+"este "+get_medie(n1, n2));

    }
}
