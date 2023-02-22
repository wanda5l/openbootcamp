public class k {
    public static void main(String[] args) {
        var NumeroIf = 0;

        if (NumeroIf > 0) {
            System.out.println("El número es positivo");
        }
        if (NumeroIf < 0) {
            System.out.println("El número es negativo");
        }
        if (NumeroIf == 0) {
            System.out.println("El número es igual a 0");
        }

        int NumeroWhile = 1;

        while (NumeroWhile < 3) {
            System.out.println(NumeroWhile);
            NumeroWhile = NumeroWhile + 1;
        }

        System.out.println("se ejecuta DO-WHILE");
        var Numero = 1;
        do {
            System.out.println(Numero);
            Numero = Numero + 1;
        } while (Numero < 3);

        System.out.println("ahora se ejecuta for:");
        for (int NumeroFor = 0; NumeroFor <= 3; NumeroFor++) {
            System.out.println(NumeroFor);
        }

        System.out.println("ahora se ejecuta switch");
        var ESTACION = "pileta";

        switch (ESTACION) {
            case "VERANO": {
                System.out.println("Es verano");
            }
            case "INVIERNO": {
                System.out.println("Es invierno");
            }
            case "OTOÑO": {
                System.out.println("Es otoño");
            }
            case "PRIMAVERA": {
                System.out.println("Es primavera");
            }
            default: {
                System.out.println("no es una estación");
            }
        }
    }
}
