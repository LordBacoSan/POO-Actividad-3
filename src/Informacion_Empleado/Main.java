package Informacion_Empleado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {

    public static void main(String[] args) {
        
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();     
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        
        panel.setLayout(null);
        
        JLabel codigoLabel = new JLabel("Ingrese el código del empleado");  
        codigoLabel.setBounds(10,20,200,25);        
        panel.add(codigoLabel);
        
        JTextField codigoEspacio = new JTextField();
        codigoEspacio.setBounds(150,60,50,25);
        panel.add(codigoEspacio);
        
        JLabel nombreLabel = new JLabel("Ingrese el nombre del empleado");  
        nombreLabel.setBounds(10,100,200,25);        
        panel.add(nombreLabel);
        
        JTextField nombreEspacio = new JTextField();
        nombreEspacio.setBounds(150,140,50,25);
        panel.add(nombreEspacio);
        
        JLabel horas_mesLabel = new JLabel("Ingrese el número de horas trabajadas en el mes");  
        horas_mesLabel.setBounds(10,180,350,25);        
        panel.add(horas_mesLabel);
        
        JTextField horas_mesEspacio = new JTextField();
        horas_mesEspacio.setBounds(150,220,50,25);
        panel.add(horas_mesEspacio);
        
        JLabel valor_horaLabel = new JLabel("Ingrese el valor de la hora");  
        valor_horaLabel.setBounds(10,260,200,25);        
        panel.add(valor_horaLabel);
        
        JTextField valor_horaEspacio = new JTextField();
        valor_horaEspacio.setBounds(150,300,50,25);
        panel.add(valor_horaEspacio);
        
        JLabel retencionLabel = new JLabel("Ingrese el porcentaje de retencion de la fuente");  
        retencionLabel.setBounds(10,340,350,25);        
        panel.add(retencionLabel);
        
        JTextField retencionEspacio = new JTextField();
        retencionEspacio.setBounds(150,380,50,25);
        panel.add(retencionEspacio);                                                                                
        
        JButton aceptarBoton = new JButton("Aceptar");        
        aceptarBoton.setBounds(120,420,100,25);
        panel.add(aceptarBoton);
        aceptarBoton.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    double codigo = Double.parseDouble(codigoEspacio.getText());                    
                    double horas_mes = Double.parseDouble(horas_mesEspacio.getText());
                    double valor_hora = Double.parseDouble(valor_horaEspacio.getText());
                    double retencion = Double.parseDouble(retencionEspacio.getText());
                    String nombre = nombreEspacio.getText();
                    
                    double bruto = SalarioBruto.calcularBruto(horas_mes,valor_hora);
                    double neto = SalarioNeto.calcularNeto(bruto,retencion);
                    
                    resultados(codigo,bruto,neto,nombre);
                }
            }
        );        
    }
public static void resultados(double codigo, double bruto, double neto, String nombre){
    String mensaje ="Código: "+codigo+"\n"
            +"Nombre: "+nombre+"\n"
            +"Salario Bruto: "+bruto+"\n"
            +"Salario Neto: "+neto;
    JOptionPane.showMessageDialog(null, mensaje);
}
}

