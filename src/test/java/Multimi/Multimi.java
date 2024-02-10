package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Multimi {

    @Test

    public void metoda_test (){
        //nume_cursanti_array();
       // nume_cursanti_lista();
        //obiecte_hashmap();
        //tari_orase();
        reteteGatit("Tiramisu");

    }

    //Afisam numele cursantilor cu MULTIME SI APOI CU LISTA

    public void nume_cursanti_array(){  // ARRARY(MULTIME) se recunoaste dupa []

        String [] nume_cursanti=new String[4];   //prin aceasta linie de cod definim o multime in care putem introduce 3 elemente de acelasi fel
        nume_cursanti [0]="Adi";
        nume_cursanti [1]="Anca";
        nume_cursanti [2]="Andreea";
        nume_cursanti [3]="Claudia";

        for (Integer index=0;index<nume_cursanti.length;index++){  //length iti da marimea multimii
            System.out.println(nume_cursanti[index]);
        }

    }
    public void nume_cursanti_lista(){  //invatam despre LISTE
        List<String> nume_cursanti=new ArrayList<>();
        nume_cursanti.add("Cosmin");
        nume_cursanti.add("Diana");
        nume_cursanti.add("Letitia");
        nume_cursanti.add("Oana");

        for (Integer index=0;index<nume_cursanti.size();index++){  //size iti da marimea listei
            System.out.println(nume_cursanti.get(index));
        }

    }

    // HASHMAP = key - value, este o multime mai complexa care se bazeaza pe aceasta teorie.

    public void obiecte_hashmap(){

        HashMap<String, String> obiecte=new HashMap<>();
        obiecte.put("electronic", "telefon");
        obiecte.put("alimente","supa");
        obiecte.put("masina", "ford");

        for (String Key: obiecte.keySet()){
            System.out.println("Cheia este "+ Key);
            System.out.println("Valoarea cheii este "+obiecte.get(Key));
        }

    }

    // Reprezentam niste tari cu orase

    public void tari_orase(){
        HashMap<String, List<String>> test_data=new HashMap<>();  //ca sa definim o cheie si o multime de valori

        List<String> orase_romania= new ArrayList<>();
        orase_romania.add("Cluj Napoca");
        orase_romania.add("Satu Mare");
        orase_romania.add("Campia Turzii");

        List<String> orase_italia=new ArrayList<>();
        orase_italia.add("Roma");
        orase_italia.add("Florenta");
        orase_italia.add("Venetia");

        List<String> orase_spania= new ArrayList<>();
        orase_spania.add("Barcelona");
        orase_spania.add("Madrid");
        orase_spania.add("Sevillia");


        test_data.put("Romania", orase_romania);
        test_data.put("Italia", orase_italia);
        test_data.put("Spania", orase_spania);

        for (String Key: test_data.keySet()) {
            System.out.println("Tara este " + Key);
            System.out.println("Orasele sunt urmatoarele:");

            List<String> orasele_curente = test_data.get(Key);
            for (Integer index = 0; index < orasele_curente.size(); index++) {
                System.out.println(orasele_curente.get(index));
            }
        }

    }

    //definim retete de gatit

    public void reteteGatit(String reteta){
        HashMap<String, List<String>> carteBucate=new LinkedHashMap<>();

        List<String> ciorbaRadauteana= new ArrayList<>();
        ciorbaRadauteana.add("Morcovi -2 bucati");
        ciorbaRadauteana.add("Ceapa - 3 bucati");
        ciorbaRadauteana.add("Telina - 1/2 bucati");
        ciorbaRadauteana.add("Galbenus de ou");
        ciorbaRadauteana.add("Apa - 4l");
        ciorbaRadauteana.add("Carne de pui - 500 g");
        ciorbaRadauteana.add("Sare si piper, dupa gust");

        List<String> tiramisu=new ArrayList<>();
        tiramisu.add("Piscoturi 400 g");
        tiramisu.add("Mascarpone 500 g");
        tiramisu.add("Cafea 100 ml");
        tiramisu.add("Amareto 20 ml");
        tiramisu.add("Oua - 3 buc");
        tiramisu.add("Zahar - 3 linguri");


        carteBucate.put("Ciorba Radauteana", ciorbaRadauteana);
        carteBucate.put("Tiramisu", tiramisu);

        for (String Key: carteBucate.keySet()) {
            if (Key.equals(reteta)){

            System.out.println("Reteta pentru " + Key);
            System.out.println("Ingredientele sunt urmatoarele:" + carteBucate.get(Key));
            }

    }

    }



}
