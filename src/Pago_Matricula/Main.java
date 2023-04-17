package Pago_Matricula;

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
        
        JLabel codigoLabel = new JLabel("Ingrese el número de inscripción");  
        codigoLabel.setBounds(10,20,200,25);        
        panel.add(codigoLabel);
        
        JTextField codigoEspacio = new JTextField();
        codigoEspacio.setBounds(150,60,50,25);
        panel.add(codigoEspacio);
        
        JLabel nombreLabel = new JLabel("Ingrese el nombre del estudiante");  
        nombreLabel.setBounds(10,100,200,25);        
        panel.add(nombreLabel);
        
        JTextField nombreEspacio = new JTextField();
        nombreEspacio.setBounds(150,140,50,25);
        panel.add(nombreEspacio);
        
        JLabel patrimonioLabel = new JLabel("Ingrese el patrimonio del estudiante");  
        patrimonioLabel.setBounds(10,180,250,25);        
        panel.add(patrimonioLabel);
        
        JTextField patrimonioEspacio = new JTextField();
        patrimonioEspacio.setBounds(150,220,50,25);
        panel.add(patrimonioEspacio);
        
        JLabel estratoLabel = new JLabel("Ingrese el estrato social del estudiante");  
        estratoLabel.setBounds(10,280,250,25);        
        panel.add(estratoLabel);
        
        JTextField estratoEspacio = new JTextField();
        estratoEspacio.setBounds(150,300,50,25);
        panel.add(estratoEspacio);
                                                                                
        JButton aceptarBoton = new JButton("Aceptar");        
        aceptarBoton.setBounds(120,340,100,25);
        panel.add(aceptarBoton);
        aceptarBoton.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    double inscripcion = Double.parseDouble(codigoEspacio.getText());                    
                    double patrimonio = Double.parseDouble(patrimonioEspacio.getText());
                    double estrato = Double.parseDouble(estratoEspacio.getText());                    
                    String nombre = nombreEspacio.getText();
                    
                    double matricula = ValorMatricula.calcularMatricula(patrimonio,estrato);                    
                    
                    resultados(inscripcion,matricula,nombre);
                }
            }
        );        
    }
public static void resultados(double inscripcion,double matricula,String nombre){
    String mensaje ="El estudiante con número de"+"\n" 
            +"inscripción "+inscripcion+" y nombre"+"\n"
            +nombre+" debe pagar $"+matricula;
    JOptionPane.showMessageDialog(null, mensaje);
}
}
