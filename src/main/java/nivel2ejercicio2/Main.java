package nivel2ejercicio2;

public class Main {
    public static void main(String[] args) {
        GenericMethodWithList exampleMethod = new GenericMethodWithList();

        exampleMethod.GenericMethodWithArgsList(1, 2, 3, 4, 5, 6);
        exampleMethod.GenericMethodWithArgsList("Lala", "Lele", "Lili", "Lolo", "Lulu");
        exampleMethod.GenericMethodWithArgsList(false, true, false, true);
    }
}
