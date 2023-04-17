package Nombre_Salario;

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
        
        JLabel nombreLabel = new JLabel("Ingrese el nombre del empleado");  
        nombreLabel.setBounds(10,20,200,25);        
        panel.add(nombreLabel);
        
        JTextField nombreEspacio = new JTextField();
        nombreEspacio.setBounds(150,60,50,25);
        panel.add(nombreEspacio);
        
        JLabel basicoLabel = new JLabel("Ingrese el salario básico del empleado");  
        basicoLabel.setBounds(10,100,250,25);        
        panel.add(basicoLabel);
        
        JTextField basicoEspacio = new JTextField();
        basicoEspacio.setBounds(150,140,50,25);
        panel.add(basicoEspacio);
        
        JLabel horasLabel = new JLabel("Ingrese el número de horas trabajadas");  
        horasLabel.setBounds(10,180,250,25);        
        panel.add(horasLabel);
        
        JTextField horasEspacio = new JTextField();
        horasEspacio.setBounds(150,220,50,25);
        panel.add(horasEspacio);
        
        JButton aceptarBoton = new JButton("Aceptar");        
        aceptarBoton.setBounds(120,260,100,25);
        panel.add(aceptarBoton);
        aceptarBoton.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    double basico = Double.parseDouble(basicoEspacio.getText());                    
                    double horas = Double.parseDouble(horasEspacio.getText());                    
                    String nombre = nombreEspacio.getText();
                    
                    String nota = Comprobar.comprobarSalario(nombre,basico,horas);                
                    
                    resultados(nota);
                }
            }
        );        
    }
public static void resultados(String nota){    
    JOptionPane.showMessageDialog(null, nota);
}
}
