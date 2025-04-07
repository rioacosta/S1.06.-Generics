package nivel1Ejercicio1;

public class NoGenericMethod {
    String first, second, third;;
    public NoGenericMethod(String first, String second, String third) {
       this.first = first;
       this.second = second;
       this.third = third;
    }

        public Object getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public Object getSecond() {
            return second;
        }

        public void setSecond(String second) {
            this.second = second;
        }

        public Object getThird() {
            return third;
        }

        public void setThird(String third) {
            this.third = third;
        }

        @Override
        public String toString() {
            return "Nivel 1, ejercicio 1: \n" +
                    "primer argumento: " + first +
                    ", segundo argumento: " + second +
                    ", tercer argumento: " + third;
        }
    }

