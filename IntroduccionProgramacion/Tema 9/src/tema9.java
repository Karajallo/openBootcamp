public class tema9 {

    public static void main (String[] args){
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Mario");
        cliente1.setEdad(30);
        cliente1.setTelefono(123456);
        cliente1.setCredito(999999);

        System.out.println("Cliente: "+cliente1.getNombre());
        System.out.println("Edad: "+cliente1.getEdad());
        System.out.println("Telefono: "+cliente1.getTelefono());
        System.out.println("Credito: "+cliente1.getCredito());

        Trabajador trabajador1 = new Trabajador();
        trabajador1.setNombre("Javier");
        trabajador1.setEdad(28);
        trabajador1.setTelefono(666111);
        trabajador1.setSalario(2000);

        System.out.println("Trabajador: "+trabajador1.getNombre());
        System.out.println("Edad: "+trabajador1.getEdad());
        System.out.println("Telefono: "+trabajador1.getTelefono());
        System.out.println("Salario: "+trabajador1.getSalario());


    }

}

class Persona{
    int edad;
    String nombre;
    int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
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

class Cliente extends Persona{
    int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }
}

class Trabajador extends  Persona{
    int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }
}