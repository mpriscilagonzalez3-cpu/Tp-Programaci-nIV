import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

// AQUÍ CAMBIAMOS A "App" PARA QUE COINCIDA CON EL ARCHIVO
public class App { 
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Mi primer programa en java");
        ventana.setSize(250, 250);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JLabel etiqueta = new JLabel("Tu nombre:");
        JTextField cajaTexto = new JTextField(15);
        JButton boton = new JButton("Saludo");

        boton.addActionListener(e -> {
            String texto = cajaTexto.getText();
            JOptionPane.showMessageDialog(ventana, "¡Hi, " + texto + "!");
        });

        panel.add(etiqueta);
        panel.add(cajaTexto);
        panel.add(boton);

        ventana.add(panel);
        ventana.setVisible(true);
    }
}
