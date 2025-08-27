import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyFrame extends JFrame{
    public JPanel contentPane;
    private String name;
    private JTextField textField1;
    private JButton saludarButton;
    private JButton despedirButton;

    public MyFrame(String title) {
        super(title);
        setContentPane(contentPane);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);

        saludarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setName();
                JOptionPane.showMessageDialog(null, "Hola " + name);
            }
        });
        despedirButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setName();
                String adios = JOptionPane.showInputDialog("Como desea ser despedido?");
                if (name.contains("memo")) {
                    JOptionPane.showMessageDialog(null, "memo churro de mota");
                } else {
                    JOptionPane.showMessageDialog(null, adios + " " + name);
                    JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(contentPane); //buscar el elemento padre
                    frame.dispose(); //cerrar la ventana
                }
            }
        });
    }

    //forma de mantener registro siempre del atributo name
    private void setName() {
        this.name = textField1.getText();
    }
}
