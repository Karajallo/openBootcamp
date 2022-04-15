public class tema8 {
   public static void main(String[] args){
       Persona persona1 = new Persona();

       persona1.setEdad(20);
       persona1.setNombre("Mario");
       persona1.setTelefono(123456);

       System.out.println(persona1.getEdad());
       System.out.println(persona1.getNombre());
       System.out.println(persona1.getTelefono());
   }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad (int edad){
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono() {
        return telefono;
    }
}
