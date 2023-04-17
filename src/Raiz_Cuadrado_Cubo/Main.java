package Raiz_Cuadrado_Cubo;

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
        
        JLabel aLabel = new JLabel("Ingrese el valor del primer número");  
        aLabel.setBounds(10,20,200,25);        
        panel.add(aLabel);
        
        JTextField aEspacio = new JTextField();
        aEspacio.setBounds(150,60,50,25);
        panel.add(aEspacio);
        
        JLabel bLabel = new JLabel("Ingrese el valor del segundo número");  
        bLabel.setBounds(10,100,250,25);        
        panel.add(bLabel);
        
        JTextField bEspacio = new JTextField();
        bEspacio.setBounds(150,140,50,25);
        panel.add(bEspacio);
        
        JButton aceptarBoton = new JButton("Aceptar");        
        aceptarBoton.setBounds(120,180,100,25);
        panel.add(aceptarBoton);
        aceptarBoton.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    double a = Double.parseDouble(aEspacio.getText());
                    double b = Double.parseDouble(bEspacio.getText());                   
                    
                    double raiz_a = Raiz.sacarRaiz(a);
                    double raiz_b = Raiz.sacarRaiz(b);
                    double cuadrado_a = Cuadrado.sacarCuadrado(a);
                    double cuadrado_b = Cuadrado.sacarCuadrado(b);
                    double cubo_a = Cubo.sacarCubo(a);
                    double cubo_b = Cubo.sacarCubo(b);
                    
                    resultados(raiz_a, raiz_b, cuadrado_a, cuadrado_b, cubo_a, cubo_b);
                }
            }
        );
    }
public static void resultados(double raiz_a, double raiz_b, double cuadrado_a, double cuadrado_b, double cubo_a, double cubo_b){    
    String mensaje ="Raíz cuadrada de: "+raiz_a+"\n"
            +"Cuadrado del primer número: "+cuadrado_a+"\n"
            +"Cubo del primer número: "+cubo_a+"\n\n"
            +"Raíz cuadrada del segundo número: "+raiz_b+"\n"
            +"Cuadrado del segundo número: "+cuadrado_b+"\n"
            +"Cubo del segundo número: "+cubo_b;
    JOptionPane.showMessageDialog(null, mensaje);
}    
}
