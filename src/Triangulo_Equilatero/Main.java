package Triangulo_Equilatero;

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
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        
        panel.setLayout(null);
        
        JLabel textoLabel = new JLabel("Ingrese el valor de uno de los lados del triángulo equilatero");  
        textoLabel.setBounds(10,20,400,25);        
        panel.add(textoLabel);
        
        JTextField ladoBoton = new JTextField();
        ladoBoton.setBounds(150,60,50,25);
        panel.add(ladoBoton);
        
        JButton aceptarBoton = new JButton("Aceptar");        
        aceptarBoton.setBounds(120,100,100,25);
        panel.add(aceptarBoton);
        aceptarBoton.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    double lado = Double.parseDouble(ladoBoton.getText());
                    double perimetro = Perimetro.calcularPerimetro(lado);
                    double area = Area.calcularArea(lado);
                    double altura = Altura.calcularAltura(lado);
                    resultados(perimetro,altura,area);
                }
            }
        );
    }

public static void resultados(double perimetro, double altura, double area){
    String mensaje ="Perimetro: "+perimetro+"\n"
            +"Altura: "+altura+"\n"
            +"Area: "+area;
    JOptionPane.showMessageDialog(null, mensaje);
}    
}
