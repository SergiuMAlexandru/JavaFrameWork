package Exceptii;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class ExceptiiTest {

    @Test
    public void checkedExceptionType() {
        ExceptionConcept exceptionConcept = new ExceptionConcept();
        exceptionConcept.checkedExample("src/test/java/Exceptii/fisier.txt");
        exceptionConcept.checkedExample("src/test/ja/Exceptii/fisier.txt"); //situatia cand e o problema
    }

    @Test
    public void uncheckedExceptionType() {
        ExceptionConcept exceptionConcept = new ExceptionConcept();
        exceptionConcept.uncheckedExampleV1();

    }

    @Test
    public void uncheckedExceptionTypeV2() {
        ExceptionConcept exceptionConcept = new ExceptionConcept();
        exceptionConcept.uncheckedExampleV2();

    }

    @Test
    public void throwException() {
        ExceptionConcept exceptionConcept = new ExceptionConcept();
        exceptionConcept.verificaVarsta(20);
        exceptionConcept.verificaVarsta(15);

    }

    @Test
    public void throwsException() throws FileNotFoundException {
        ExceptionConcept exceptionConcept = new ExceptionConcept();
        exceptionConcept.throwsExample("");
    }
}