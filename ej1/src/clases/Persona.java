package clases;

public class Persona {
    public String nombre;
    public String apellido;

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido=apellido;
    }

    public void mostrarNombre(){
        System.out.println(getNombre()+" "+getApellido());
    }

}
