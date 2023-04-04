public class App {

    void calcularMayor(String nombreUno, String nombreDos, String nombreTres, int edadUno, int edadDos, int edadTres){
        String nomMayor=nombreUno;
        int edadMayor=edadUno;

        if(edadMayor<edadDos){
            nomMayor=nombreDos;
            edadMayor=edadDos;
        }
        if(edadMayor<edadTres){ 
            nomMayor=nombreTres;
            edadMayor=edadTres;
        }

        System.out.println(nomMayor+" "+edadMayor);
    }
    


    public static void main(String[] args) throws Exception {
        
        String nombreUno="Pedro";
        String nombreDos="Carlos";
        String nombreTres="Juan";
        int edadUno=20;
        int edadDos=19;
        int edadTres=21;

        App objeto=new App();

        objeto.calcularMayor(nombreUno, nombreDos, nombreTres, edadUno, edadDos, edadTres);

    }
}
