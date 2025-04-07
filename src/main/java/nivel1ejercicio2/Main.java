package nivel1ejercicio2;

public class Main {
    public static void main(String[] args) {
        GenericMethod example1 = new GenericMethod();

        Person example2 =  new Person("Manuel","Noriega",45);


        example1.GenericArgumentsMethod("Some", 8, new Person("Lilo","Lopez",45));

        example1.GenericArgumentsMethod(example2, 500, false);

        example1.GenericArgumentsMethod(10, true, 3.1416);

    }
}
