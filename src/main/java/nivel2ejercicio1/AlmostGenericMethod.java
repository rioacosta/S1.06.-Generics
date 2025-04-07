package nivel2ejercicio1;

public class AlmostGenericMethod {
        private int number;
    public <Int, U, V> void AlmostGenericArgumentsMethod(int number, U second, V third) {
        this.number = number;
        System.out.println(second);
        System.out.println(third);
        System.out.println();
    }
    public int getNumber() {
        return this.number;
    }
}
