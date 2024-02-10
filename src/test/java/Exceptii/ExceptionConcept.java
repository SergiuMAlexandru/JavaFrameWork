package Exceptii;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionConcept {
    //Exceptie = eroare care apare in momentul cand programul ruleaza
    //Exceptiile trebuie tratate deoarece pot sa contina informatii din interior care pot sa fie exploatate
    //Poate sa apara o exceptie cand vrem sa citim un fisier
    //Citim datele dintr-un tabel din DB care nu exista
    //Exceptiile sunt de 2 tipuri: CHECKED si UNCHECKED
    //CHECKED: exceptii care se trateaza in timpul compilarii (in timpul cand se scrie cod)
    //Acest tip de exceptii (adica CHECKED) mostenesc clasa EXCEPTION
    //UNCHECKED: exceptii care nu se trateaza in timpul compilarii (adica cand se scrie cod)
    //Acest tip de exceptii (adica UNCHECKED) mostenesc clasa RUNTIME EXCEPTION
    //Exista 2 keywords f importante pentru a trata exceptiile: throw si throws
    //Orice tip de exceptie se trateaza folosind structura TRY...CATCH...FINALLY


    //facem exceptiile CHECKED

    public void checkedExample(String path){

        File file = new File(path);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            System.out.println("Am gasit fisierul.");
        }
        catch (FileNotFoundException exception) {
            System.out.println("A intrat pe cauza catch.");
        }
        finally {
            System.out.println("A mai incercat o data sa gaseasca fisierul.");
        }
    }

    //facem exceptiile UNCHECKED

    public void uncheckedExampleV1(){
        System.out.println("Acest cod o sa produca o exceptie.");
        Integer calcul = 7/0;
        System.out.println("Rezultatul este " + calcul);
    }

    public void uncheckedExampleV2(){
        String[] colegi = new String[2];
        colegi[0]="Claudia";
        colegi[1]="Alina";
        colegi[2]="Cristina";
        System.out.println("Acest cod o sa produca o exceptie.");
        for(Integer index=0;index<colegi.length; index++){
            System.out.println(colegi[index]);
        }
    }

    //THROW = este un keyword folosit sa arunce o exceptie specifica
    //THROW se regaseste in interiorul unei metode (de exemplu structuri conditionale:if, etc)

    public void verificaVarsta(Integer varsta){
        if(varsta<18){
            throw new RuntimeException("Nu vindem alcool minorilor.");
        }
        else{
            System.out.println("Persoana este majora, primeste alcool");
        }
    }

    //THROWS = este un keyword folosit in semnatura metodei ca sa arata faptul ca o metoda poate sa arunce o exceptie
    //THROWS poate sa fie urmat de o multime de exceptii delimitate cu virgula
    //THROWS nu prea e recomandat sa o folosim fiindca duci exceptiile dupa tine peste tot

    public void throwsExample(String path) throws FileNotFoundException {

        File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);
        System.out.println("Am gasit fisierul.");
        }

}
