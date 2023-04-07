import clases.Vehiculo;

public class App {
    public static void main(String[] args) throws Exception {
        
        Vehiculo auto=new Vehiculo();
        auto.setMarca("Mercedes");
        auto.setModelo("2008");
        auto.setPatente(auto.marca,auto.modelo);
        auto.mostrar();

    }
}
