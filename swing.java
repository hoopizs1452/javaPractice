import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;

public class swing {
	public static void main(String[] args) {
		JFrame f = new JFrame("A");
		JButton b = new JButton("test");
		Dimension d = new Dimension(450, 450);
		f.setSize(d);
		b.setBounds(450, 450, 50, 50);
		f.add(b);
		f.setVisible(true);
	}
}
