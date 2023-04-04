public class App {

    void determinarHora(int dia, int hora){
        if(dia>=1 && dia<6){
            if(hora>=1000 && hora<1500){
                System.out.println("Esta abierto");
            }
            else{
                System.out.println("Esta cerrado");
            }
        }
        else{
            System.out.println("Esta cerrado");
        }
    }

    public static void main(String[] args) throws Exception {
        int dia=3;
        int hora=1551;
        App objeto=new App();

        objeto.determinarHora(dia, hora);
    }
}
