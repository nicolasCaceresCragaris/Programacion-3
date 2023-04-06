import clases.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        
        Persona persona= new Persona();
        persona.setNombre("Find");
        persona.setApellido("El humano");
        
        persona.mostrarNombre();
        
    }
}
