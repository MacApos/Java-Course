import javax.swing.JOptionPane;

class hypotenus {

    public static void main(String[] args) {

    double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Insert first side: ", null, 3));
    JOptionPane.showMessageDialog(null, "First side is " + a);
    
    double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Insert second side: ", null, 3));
    JOptionPane.showMessageDialog(null, "Second side is " + b);

    double c = Math.sqrt((Math.pow(a,2)+Math.pow(b,2)));
    JOptionPane.showMessageDialog(null, "The hypotenus is: " + c);

    }

}