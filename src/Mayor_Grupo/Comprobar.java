package Mayor_Grupo;

public class Comprobar {
    public static String comprobarNumero(double a, double b){
        String nota;
        double mayor;
        if (a>b){
            mayor=a;
            nota="El número mayor es "+mayor;            
        } else {
            mayor=b;
            nota="El número mayor es "+mayor;
        }        
        return nota;
    }
}
