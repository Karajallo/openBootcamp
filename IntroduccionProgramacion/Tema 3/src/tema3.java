public class tema3 {
    public static void main(String[] args) {
        int resul;
        resul = suma(1,3,4);
        System.out.println(resul);

        Coche miCoche = new Coche();
        miCoche.sumaPuertas();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c) {
        // Integer resul;
        return a+b+c;
    }
}

    class Coche{
        public int puertas = 4;

        public void sumaPuertas() {
            this.puertas++;
        }

    }

