package Informacion_Empleado;

public class SalarioNeto {
    public static double calcularNeto(double bruto, double retencion){
        return bruto*(1-retencion/100);
    }
}
