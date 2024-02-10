package VariabilaMetoda;

import org.testng.annotations.Test;

public class Cursant {
    //Primul curs mai greu
    //Clasa=Un sablon specific unui obiect care contine variabile si metode
    //Identificam o clasa dupa cuvantul class
    //O clasa trebuie sa aiba un nume
    //Continutul unei clase se regaseste intre acolade
    //Intr-un fisier java putem avea mai multe clase
    //Variabila=Proprietate a unei clase
    //Variabilele sunt de 2 feluri: global si local
    //Variabila globala=este vizibila peste tot in clasa
    //Variabila locala=este vizibila doar in locul declarat
    //Variabila globala=public tip de data nume variabila
    //Variabila poate sau nu sa primeasca o valoarea
    //Metoda=Actiunea unei clase
    //Metodele sunt de 2 feluri: void si return
    //Void=Metoda care executa si arata actiunea
    //Return=Metoda care returneaza actiunea
    public String nume;
    public String prenume;
    public Integer varsta;
    public String adresa;
    public Double inaltime;
    public Float greutate;
    public Character sex;
    public Boolean areStudii;

    @Test
    public void metodatest(){

        afisareDate();
        calculmedie("Semestru 1 ",9.25,6.50);
        calculmedie("Semestru 2 ", 8.00,7.50);
        calculpret(10);
        calculpret(20);
    }

    public void afisareDate(){
        nume="Gologan";
        prenume="Claudia";
        varsta=37;
        adresa="Cluj Napoca nr.45 bl.4";
        inaltime=1.62;
        greutate=52.0f;
        sex='F';
        areStudii=true;

        //System.out.print(nume);
       // System.out.print(" "+prenume);
        System.out.println ("Numele cursantului este " +nume+" "+prenume); //prinln se pune primul ca urmatorul sa se afiseze pe urmatoarea linie
        System.out.println ("Varsta cursantului este "+varsta);
        System.out.println ("Adresa cursantului este "+adresa);
        System.out.println ("Inaltimea cursantului este "+inaltime);
        System.out.println("Greutatea cursantului este "+greutate);
        System.out.println("Sexul cursantului este "+sex);
        System.out.println("Are cursantul studii? "+areStudii);

    }

    public void calculmedie (String tipnote, Double nota1,Double nota2)
    {
        Double rezultat=(nota1+nota2)/2;
        System.out.println("Media examenelor la "+tipnote+" este "+rezultat);

    }

    public void calculpret (Integer reducere)
    {
        Integer pret=1000;
        System.out.println("Pretul initial al cursului este "+pret);
        Integer diferentapret=(pret*reducere)/100;
        Integer pretfinal=pret-diferentapret;
        System.out.println("Pretul final al cursului dupa aplicarea reducerii este "+pretfinal);

    }

}
