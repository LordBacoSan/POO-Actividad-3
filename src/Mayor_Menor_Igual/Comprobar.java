package Mayor_Menor_Igual;

public class Comprobar {
    public static String comprobarNumero(double a, double b){
        String nota;
        if (a>b){
            nota=a+" es mayor que "+b;
        } else if (b>a){
            nota=b+" es mayor que "+a;        
        } else {
            nota="Ambos números son iguales";
        }        
        return nota;
    }
}
