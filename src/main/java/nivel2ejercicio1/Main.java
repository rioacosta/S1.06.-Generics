package nivel2ejercicio1;

import nivel1ejercicio2.Person;

public class Main {
    public static void main(String[] args) {
        AlmostGenericMethod example1 = new AlmostGenericMethod();

        Person example2 = new Person("Manuel", "Noriega", 45);

        example1.AlmostGenericArgumentsMethod(1,false ,new Person("Lilo","Lopez",45));

        example1.AlmostGenericArgumentsMethod(1 ,8, example2);

        example1.AlmostGenericArgumentsMethod(5,500,false);

        //example1.AlmostGenericArgumentsMethod("HOLA",true,false); //no permite agregar un string en la primera posicion

        System.out.println(example1.getNumber());

    }

}