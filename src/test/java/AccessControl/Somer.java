package AccessControl;

public class Somer {
    public void metoda(){
        Persoana persoana = new Persoana();
        persoana.metodaPublica();
        persoana.metodaProtected();
        //nu apare private
    }
}
