package Pago_Matricula;

public class ValorMatricula {
    public static double calcularMatricula(double patrimonio, double estrato){
        double matricula=50000;
        if (patrimonio>2000000 && estrato>3){
            matricula=50000+(patrimonio*0.03);
        }
        return matricula;
    }
}
