package nivel2ejercicio2;

public class GenericMethodWithList {
    public <T> void GenericMethodWithArgsList(T... args) {
        for (T arg : args) {
            System.out.println(arg);
        }
    }
}
