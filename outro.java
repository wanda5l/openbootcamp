public class outro {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.AddPuertas();
        System.out.println(miCoche.Puertas);
    }
}
class Coche {
    public int Puertas = 4;
    public void AddPuertas() {
        this.Puertas++;
    }
}
