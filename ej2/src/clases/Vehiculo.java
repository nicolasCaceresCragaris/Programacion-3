package clases;

public class Vehiculo {
    
    public String marca;
    public String modelo;
    private String patente;

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo=modelo;
    }

    public String getPatente(){
        return patente;
    }

    public void setPatente(String marca,String modelo){
        if(marca=="Mercedes" && modelo=="2008"){
            this.patente="MRC08";
        }
    }

    public void mostrar(){
        System.out.println("Marca:"+marca);
        System.out.println("Modelo:"+modelo);
        System.out.println("Patente:"+getPatente());

    }

}
