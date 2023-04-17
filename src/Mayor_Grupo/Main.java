package Mayor_Grupo;

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
                    
                    String nota = Comprobar.comprobarNumero(a,b);
                    
                    resultados(nota);
                }
            }
        );
    }
public static void resultados(String nota){        
    JOptionPane.showMessageDialog(null, nota);
}    
}
