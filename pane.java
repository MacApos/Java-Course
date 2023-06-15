import javax.swing.JOptionPane;

public class pane {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("What is your name");
        JOptionPane.showMessageDialog(null, "Hello there " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        JOptionPane.showMessageDialog(null, "Your are "+ age +" years old");

        int height = Integer.parseInt(JOptionPane.showInputDialog("How tall are you?"));
        JOptionPane.showMessageDialog(null, "Your are "+ height +" cm tall");
    }
    
}
