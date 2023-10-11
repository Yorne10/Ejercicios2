package marcopanel;

import javax.swing.JFrame;

/**
 *
 * @author maryse
 */
public class DemoPanel extends JFrame
{

    public static void main(String args[])
    {
        MarcoPanel marcoPanel = new MarcoPanel();
        marcoPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoPanel.setSize(450, 200); // establece el tamaño del marco
        marcoPanel.setVisible(true); // muestra el marco
    } // ﬁn de main
} // ﬁn de la clase DemoPanel
