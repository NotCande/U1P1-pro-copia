import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //añadir el aspecto de windows classic
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        MyFrame view = new MyFrame();
        JFrame frame = new JFrame("U1P1");
        frame.setContentPane(view.contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //terminar el proceso al terminar a la ventana
        frame.pack(); //establece el tamaño deseado de la página
        frame.setLocationRelativeTo(null); //ubica la ventana al centro de la pantalla
        frame.setVisible(true);
    }
}