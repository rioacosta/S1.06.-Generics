package nivel1Ejercicio1;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        NoGenericMethod example1 = new NoGenericMethod("Innie", "Minnie", "Mo");
        NoGenericMethod example2 = new NoGenericMethod("Mo", "Innie", "Minnie");
        NoGenericMethod example3 = new NoGenericMethod("Minnie", "Mo", "Innie");


        System.out.println("Generic 1: " + example1
                + "\nGeneric 2: " + example2
                + "\nGeneric 3: " + example3);
    }

}
