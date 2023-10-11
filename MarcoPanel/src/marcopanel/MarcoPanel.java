package marcopanel;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author maryse
 *
 * La clase JPanel extiende a JComponent, y JComponent extiende a la clase
 * Container, por lo que todo JPanel es un Container. Por lo tanto, todo objeto
 * JPanel puede tener componentes, incluyendo otros paneles, los cuales se
 * adjuntan mediante el método add de Container. La aplicación demuestra cómo
 * puede usarse un objeto JPanel para crear un esquema más complejo, en el cual
 * se coloquen varios objetos JButton en la región SOUTH de un esquema
 * BorderLayout.
 */
public class MarcoPanel extends JFrame
{

    private JPanel panelBotones; // panel que contiene los botones
    private JButton botones[]; // arreglo de botones

    // constructor sin argumentos
    public MarcoPanel()
    {
        super("Demostracion de Panel");
        botones = new JButton[5]; // crea el arreglo botones
        panelBotones = new JPanel(); // establece el panel
        panelBotones.setLayout(new GridLayout(1, botones.length));

        // crea y agrega los botones
        for (int cuenta = 0; cuenta < botones.length; cuenta++)
        {
            botones[cuenta] = new JButton("Etiqueta " + (cuenta + 1));
            panelBotones.add(botones[cuenta]); // agrega el botón al panel
        } // ﬁn de for
        add(panelBotones, BorderLayout.SOUTH); // agrega el panel a JFrame
    } // ﬁn del constructor de MarcoPanel
} // ﬁn de la clase MarcoPanel

