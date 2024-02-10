package OOPConcepte;

public class FabricaMasina {


    //OOP= Programare Orientata Obiect
    // Are 4 principii= Mostenire, Incapsulare, Abstractizare si Polimorfism

    // Mostenirea este conceptul prin care clasa parinte este mostenita de clasa copil
    // In Java, o clasa poate sa mosteneasca doar o singura clasa
    // Clasa copil trebuie sa apeleze constructorul din clasa parinte
    // Copilul are vizibilitate asupra metodelor/variabilelor din parinte daca sunt publice/protected
    // Ca sa apelam constructorul parinte in clasa copil vom folosi sintagma - SUPER


    //Access control: PUBLIC, PRIVATE, PROTECTED, DEFAULT
    //PUBLIC = ofera vizibilitate pentru oricine si oriunde (in tot proiectul)
    //PRIVATE = ofera vizibilitate doar in interiorul clasei

    private String marca;
    private String model;
    private String sasiu;
    private String culoare;
    private String motorizare;

    public FabricaMasina(String marca, String model, String sasiu, String culoare, String motorizare) {
        this.marca = marca;
        this.model = model;
        this.sasiu = sasiu;
        this.culoare = culoare;
        this.motorizare = motorizare;

    }

    public void prezentareMasina (){

        System.out.println("Marca masinii este " + marca);
        System.out.println("Modelul masinii este " + model);
        System.out.println("Sasiul masinii este " + sasiu);
        System.out.println("Culoarea masinii este " + culoare);
        System.out.println("Motorizarea masinii este " + motorizare);

    }

    //Polimorfismul = conceptul prin care o metoda poate suferi modificari la nivel de continut sau structura
    //Polimorfismul este de 2 feluri: STATIC(overload) si DINAMIC(override)
    //Polimorfismul dinamic = intr-o ierarhie de clase extinse prin mostenire, o metoda poate avea implementari diferite
    //Polimorfismul static = mai multe metode pot avea acelasi nume cu conditia sa se diferentieze prin numar sau tip de parametri
    //Nu se poate aplica polimorfismul la metodele cu RETURN SI VOID

    //POLIMORFISM DINAmIC URMEAZA:

    public void angajariFirma(){
        System.out.println("Fabrica mama nu mai face angajari");
    }


    //Ca sa accesam valoarea unei variabile cu PRIVATE ne folosim de conceptul GET
    //Ca sa modificam valoarea unei variabile cu PRIVATE ne folosim de conceptul  SET


    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSasiu() {
        return sasiu;
    }

    public void setSasiu(String sasiu) {
        this.sasiu = sasiu;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getMotorizare() {
        return motorizare;
    }

    public void setMotorizare(String motorizare) {
        this.motorizare = motorizare;
    }
}
