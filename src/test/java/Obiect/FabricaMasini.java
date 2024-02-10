package Obiect;

public class FabricaMasini {

    // Constructor = are ca rol sa initializeze atributele unei clase
    // Un constructor este public si are acelasi nume cu clasa
    // Un constructor poate sa fie de 2 feluri: cu parametri si fara parametri
    // Un constructor fara parametri se mai numeste si default
    // Daca nu am definit noi un constructor, avem unul default si nu este vizibil dar exista
    // Intr-o clasa putem avea N constructori diferentiati prin numar sau tip de parametri


    // Obiect = instanta unei clase, un obiect reprezinta o structura pe care o are clasa si din care poate accesa variabilele si metodele respective


    // Dintr-o clasa putem initializa N obiecte
    // In momentul in care initializam un obiect apelam constructorul din clasa


    public String marca;
    public String model;
    public String combustibil;
    public String transmisie;
    public Integer an;
    public Double motorizare;
    public Integer pret;

    public FabricaMasini(String marca, String model, String combustibil, String transmisie, Integer an, Double motorizare) {
        this.marca = marca;
        this.model = model;
        this.combustibil = combustibil;
        this.transmisie = transmisie;
        this.an = an;
        this.motorizare = motorizare;
    }


    public FabricaMasini(String marca, String model, String combustibil, String transmisie, Integer an, Double motorizare, Integer pret) {
        this.marca = marca;
        this.model = model;
        this.combustibil = combustibil;
        this.transmisie = transmisie;
        this.an = an;
        this.motorizare = motorizare;
        this.pret = pret;
    }

    public void prezentareProdus(){
        System.out.println("Marca masinii este "+ marca);
        System.out.println("Modelul masinii este "+ model);
        System.out.println("Combustibilul masinii este "+ combustibil);
        System.out.println("Transmisia masinii este "+ transmisie);
        System.out.println("Anul de fabricatie al masinii este "+ an);
        System.out.println("Motorizarea masinii este "+ motorizare);


        if (pret!= null) {
            System.out.println("Pretul produsului este "+ pret);
        }

    }

    public void calculImpozit(){
        if ( an >=2020 && combustibil.equals("Electric")){
            System.out.println("Clientul trebuie sa plateasca 5 lei");
        }
        else {
            System.out.println("Clientul trebuie sa plateasca in functie de anul masinii.");
        }
    }

}



