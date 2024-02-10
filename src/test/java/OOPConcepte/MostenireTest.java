package OOPConcepte;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MostenireTest {

    @Test
    public void testMethod (){

        List<String> dotariaudiA5 = new ArrayList<>();
        dotariaudiA5.add("jenti");
        dotariaudiA5.add("trapa");
        dotariaudiA5.add("faruri");

        List<String> dotariaudiA7 = new ArrayList<>();
        dotariaudiA7.add("jenti");
        dotariaudiA7.add("trapa");
        dotariaudiA7.add("GPS");


      List<String> dotariBMWX5Interior = new ArrayList<>();
       dotariBMWX5Interior.add("incalzire scaune");
       dotariBMWX5Interior.add("clima bizonica");
       dotariBMWX5Interior.add("spoiler");


      List<String> dotariBMWX5Exterior = new ArrayList<>();
       dotariBMWX5Exterior.add("jenti");
       dotariBMWX5Exterior.add("trapa");
       dotariBMWX5Exterior.add("spoiler");
       dotariBMWX5Exterior.add("oglinzi electrice");


       //FabricaAudi audiA5 = new FabricaAudi( "A5", "sedan", "Rosu", "200", dotariaudiA5);

       // audiA5.prezentareAudi();

        FabricaAudi audiA7 = new FabricaAudi("A7", "SUV", "rosu", "40", dotariaudiA7);
        audiA7.prezentareAudi();

        audiA7.setModel("A8");
        audiA7.prezentareAudi();
        audiA7.afisareRezultate();
        audiA7.afisareRezultate(2022);
        audiA7.afisareRezultate("Fiat");
        audiA7.afisareRezultate("Volvo", 2022);

        audiA7.angajariFirma();


        FabricaBMW BMWX5 = new FabricaBMW("X5", "SUV", "albastru", "30", dotariBMWX5Exterior, dotariBMWX5Interior);
        BMWX5.prezentareBMW();

        BMWX5.angajariFirma();



    }
}
