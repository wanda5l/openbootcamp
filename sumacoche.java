public class sumacoche {
    public static void main(String[] args) {
        suma(10, 30, 25);

        Coche miCoche = new Coche();
        miCoche.AddPuertas();
        System.out.println("El número de puertas es " + miCoche.Puertas);
    }
    public static void suma(int a, int b, int c){
        int resultado = a + b + c;
        System.out.println("El resultado de la suma de las tres variables es " + resultado);
    }
}
class Coche {
    public int Puertas = 4;
    public void AddPuertas() {
        this.Puertas++;
    }
}
