package mostrarcolores2jframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

/**
 *
 * @author maryse
 * 
 * El paquete javax.swing proporciona el componente de la GUI JColorChooser para
 * permitir a los usuarios de aplicaciones seleccionar colores. 
 * La aplicación demuestra un cuadro de diálogo JColorChooser. 
 * Al hacer clic en el botón Cambiar color, aparece un cuadro de diálogo JColorChooser. 
 * Al seleccionar un color y oprimir el botón Aceptar, el color de fondo de la ventana 
 * de la aplicación cambia.
 */
public class MostrarColores2JFrame extends JFrame {

    private JButton cambiarColorJButton;
    private Color color = Color.LIGHT_GRAY;
    private JPanel coloresJPanel;

    // establece la GUI
    public MostrarColores2JFrame() {
        super("Uso de JColorChooser");

        // crea objeto JPanel para mostrar color
        coloresJPanel = new JPanel();
        coloresJPanel.setBackground(color);

        // establece cambiarColorJButton y registra su manejador de eventos
        cambiarColorJButton = new JButton("Cambiar color");
        cambiarColorJButton.addActionListener(
                new ActionListener() { // clase interna anónima

            // muestra JColorChooser cuando el usuario hace clic con el botón
            public void actionPerformed(ActionEvent evento) {
                color = JColorChooser.showDialog(
                        MostrarColores2JFrame.this, "Seleccione un color", color);
                // establece el color predeterminado, si no se devuelve un color
                if (color == null) {
                    color = Color.LIGHT_GRAY;
                }
                // cambia el color de fondo del panel de contenido
                coloresJPanel.setBackground(color);
            } // ﬁn del método actionPerformed
        } // ﬁn de la clase interna anónima
        ); // ﬁn de la llamada a addActionListener
        add(coloresJPanel, BorderLayout.CENTER); // agrega coloresJPanel
        add(cambiarColorJButton, BorderLayout.SOUTH); // agrega botón
        setSize(400, 130); // establece el tamaño del marco
        setVisible(true); // muestra el marco
    } // ﬁn del constructor de MostrarColores2JFrame
} // ﬁn de la clase MostrarColores2JFrame
