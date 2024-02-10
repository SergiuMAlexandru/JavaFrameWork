package ValueTypeReferenceType;

import org.testng.annotations.Test;

public class Concediu {

    public Integer value1;
    public int value2;
    //Care e diferenta intre Integer si int

    public Double value3;
    public double value4;
    //Care e diferenta intre Double si double

    @Test

    public void testMethod(){

        value1=10; //variabila non primite, sub forma de clasa
        value2=10; //variabila primita
        value3=10.0;
        value4=10.0;

        //Variabile pot fi primite si non primite

        int rezultat =value1.compareTo(value2);
    }
}
