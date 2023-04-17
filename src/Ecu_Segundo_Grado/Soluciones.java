package Ecu_Segundo_Grado;

public class Soluciones {
    public static String solucionarEcuacion(double a, double b, double c){
        String nota;
        double solucion1, solucion2, raiz;
        double discriminante = b+b - 4*a*c;
        if (discriminante>0){
            solucion1 = (-b + Math.sqrt(discriminante)) / (2*a);
            solucion2 = (-b - Math.sqrt(discriminante)) / (2*a);
            nota = "Las soluciones son "+solucion1+" y "+solucion2;
        } else if (discriminante == 0) {
            raiz = -b / (2*a);
            nota="La solución es "+raiz;
        } else {
            nota="El discriminante es menor que cero";
        }
        return nota;
    }
}
