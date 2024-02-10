package Obiect;

import org.testng.annotations.Test;

public class ObiectTest {

    @Test

    public void testMethod(){
        FabricaMasini Mercedes = new FabricaMasini("Mercedes", "AMG", "Motorina", "Manuala", 2023, 4.89 );

        Mercedes.prezentareProdus();
        Mercedes.calculImpozit();

        System.out.println("=======================================================");


        FabricaMasini Fiat = new FabricaMasini("Fiat", "500", "Electric", "Automata", 2023, 1.3);
        Fiat.prezentareProdus();
        Fiat.calculImpozit();

        System.out.println("=======================================================");

        FabricaMasini Audi = new FabricaMasini("Audi", "R8", "Electric", "Manuala", 2021, 2.45, 99000);
        Audi.prezentareProdus();
        Audi.calculImpozit();

    }
}
