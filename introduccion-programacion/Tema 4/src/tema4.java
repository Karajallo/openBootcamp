public class tema4 {
    public static void main (String[] args) {
        int numero = -1;
        if (numero > 0) {
            System.out.println("Es numero positivo");
        } else if (numero < 0) {
            System.out.println("Es numero negativo");
        } else {
            System.out.println("Es cero");
        }

        int numeroWhile = 0;
        while (numeroWhile<3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while (numeroWhile<1);

        int numeroFor=0;
        for (int i = 0; numeroFor <=3 ; i++) {
            numeroFor++;
            System.out.println(numeroFor);
        }
        var estacion="veranno";
        switch (estacion){
            case "verano":
                System.out.println("es verano");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            case "otono":
                System.out.println("es otono");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
            default:
                System.out.println("No es una estacion");
        }
    }
}
