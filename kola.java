public class kola {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.edad = 18;
        cliente.nombre = "Koga";
        cliente.telefono = 380577777;
        cliente.credito = 900.90;
        System.out.println("Me llamo " + cliente.nombre + ", tengo " + cliente.edad + " años y mi número de" +
                " teléfono es " + cliente.telefono + ". Mi crédito actual es de $" + cliente.credito);

        trabajador.nombre = "Childe";
        trabajador.edad = 21;
        trabajador.telefono = 3809898;
        trabajador.salario = 999999.9;
        System.out.println("Me llamo " + trabajador.nombre + ", tengo " + trabajador.edad + " años y mi número de" +
                " teléfono es " + trabajador.telefono + ". Mi salario es de $" + trabajador.salario);




    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona{
    double salario;
}

