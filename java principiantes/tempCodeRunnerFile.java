import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
public class LabelFrame extends JFrame {

    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JLabel etiqueta3;

    public LabelFrame() {
        super("Prueba JLabel");
        setLayout(new FlowLayout());

        etiqueta1 = new JLabel("Etiqueta con texto");
        etiqueta1.setToolTipText("Etiqueta con texto");
        add(etiqueta1);

        Icon insecto = new ImageIcon(getClass().getResource("insecto.gif"));
        etiqueta2 = new JLabel("Etiqueta con texto y icono", insecto,SwingConstants.LEFT);
        etiqueta2.setToolTipText("Esta es etiqueta2");
        add(etiqueta2);

        etiqueta3 = new JLabel();
        etiqueta3.setText("Etiqueta con icono y texto en la parte inferior");
        etiqueta3.setIcon(insecto);
        etiqueta3.setHorizontalTextPosition(SwingConstants.CENTER);
        etiqueta3.setVerticalTextPosition(SwingConstants.BOTTOM);
        etiqueta3.setToolTipText("esta es atiqueta3");
        add(etiqueta3);
    } // fin del cosntructor de LabelFrame 
} // fin de la clase LabelFrame

