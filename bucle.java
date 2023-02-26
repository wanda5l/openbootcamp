public class bucle {
    public static void main(String[] args) {
        System.out.println("se ejecuta if:");
        var NumeroIf = 0;

        if (NumeroIf > 0) {
            System.out.println("El número " + NumeroIf + " es positivo");
        }
        else if (NumeroIf < 0) {
            System.out.println("El número " + NumeroIf + " es negativo.");
        } else {
            System.out.println("El número " + NumeroIf + " es igual a 0");
        }
        // while
        System.out.println("se ejecuta while:");
        int numeroWhile = 1;

        while (numeroWhile < 3) {
            numeroWhile = numeroWhile + 1;
            System.out.println("La variable numeroWhile ahora vale = " + numeroWhile);

        }
        // do while
        System.out.println("se ejecuta DO-WHILE:");
        var Numero = 1;
        do {
            Numero = Numero + 1;
            System.out.println("La variable dowhile ahora vale = " + Numero);

        } while (Numero < 3);

        System.out.println("ahora se ejecuta for:");
        for (int NumeroFor = 0; NumeroFor <= 3; NumeroFor++) {
            System.out.println("La variable numeroFor ahora vale = " + NumeroFor);
        }
        //SWITCH
        System.out.println("ahora se ejecuta switch:");
        var ESTACION = "VERANO";

        switch (ESTACION) {
            case "VERANO": {
                System.out.println("Es verano");
                break;
            }
            case "INVIERNO": {
                System.out.println("Es invierno");
                break;
            }
            case "OTOÑO": {
                System.out.println("Es otoño");
                break;
            }
            case "PRIMAVERA": {
                System.out.println("Es primavera");
                break;
            }
            default: {
                System.out.println("no es una estación");
            }
        }
    }
}
