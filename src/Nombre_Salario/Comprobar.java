package Nombre_Salario;

public class Comprobar {
    public static String comprobarSalario(String nombre, double basico, double horas){
        String nota;
        double salario=basico*horas;
        if (salario>450000){
            nota="Nombre: "+nombre+"\n"
                    +"Salario: "+salario;
        } else {
            nota="Nombre: "+nombre;
        }        
        return nota;
    }    
}
