public class  {
    public static void main(String[] args){
        Persona persona = new Persona();

        persona.setEdad(18);
        persona.setNombre("Koga");
        persona.setTelefono(380477777);

        System.out.println("Me llamo " + persona.getNombre());
        System.out.println("Tengo " + persona.getEdad() + " años.");
        System.out.println("Mi teléfono es " + persona.getTelefono());

    }
}    

static class Persona{

        private int edad;
        private String nombre;
        private int telefono;

        public void setEdad(int edad){
            this.edad = edad;
        }
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public void setTelefono(int telefono){
            this.telefono = telefono;
        }

        public int getEdad(){
            return this.edad;
        }
        public String getNombre(){
            return this.nombre;
        }
        public int getTelefono() {
            return this.telefono;
        }
}
