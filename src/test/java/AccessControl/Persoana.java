package AccessControl;

public class Persoana {

    //In JAVA Access Controlul este: private, public si protected
    //Se pot folosi la variabile sau metode

    //PUBLIC = ofera vizibilitate peste tot si oricui, in intregul program
    //Parinte-Copil = vizibil peste tot
    //Obiect =vizibil in acelasi pachet + in orice pachet

    //PRIVATE = ofera vizibilitate doar in interiorul clasei
    //Parinte-Copil = nu este vizibil chiar daca ne aflam in acelasi pachet sau nu
    //Obiect = nu este vizibil in nici un pachet, doar in interiorul clasei sale

    //PROTECTED = ofera vizibilitate peste tot in interiorul pachetului
    //Parinte-Copil = protected cu public sunt identice, la mostenire, aceeasi vizibilitate CA LA PUBLIC
    //Obiect = cu 2 cazuri: este VIZIBIL daca e in acelasi pachet si NU ESTE VIZIBIL in afara pachetului

    public void metodaPublica(){

    }

    private void metodaPrivata(){

    }
    protected void metodaProtected(){

    }
}
