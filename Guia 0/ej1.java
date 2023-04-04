
public class App {


    void calcularPromedio(double notaUno, double notaDos, double notaTres){
        double promedio=(notaUno+notaDos+notaTres)/3;
        
        if(promedio<4){
            System.out.println("Insuficiente: "+promedio);
        }
        if(promedio>=4 && promedio<6 ){
            System.out.println("Regular: "+promedio);
        }
        if(promedio>=6 && promedio<8){
            System.out.println("Bien:"+promedio);
        }
        if(promedio>=8 && promedio<10){
            System.out.println("Muy bien: "+promedio);
        }
        if(promedio==10){
            System.out.println("Sobresaliente: "+promedio);
        }

        
    }


    public static void main(String[] args) throws Exception {
        
        double notaUno=4.0;
        double notaDos=7.0;
        double notaTres=10.0;

        App objeto= new App();

        objeto.calcularPromedio(notaUno, notaDos, notaTres);

    }
}
