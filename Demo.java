import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Rectangle;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;

public class Demo {
	public static void main(String[] args) {
		Frame f = new Frame();
		Dimension d = new Dimension(450, 450);
		f.setSize(d);
		Button b = new Button("12345678");
		//Rectangle r = new Rectangle(50, 50, 100, 100);
		f.add(b);
		TextField t = new TextField("Test");
		//t.setBounds(150, 60, 100, 120);
		t.setSize(100, 120);
		f.add(t);
		//b.setBounds(50, 50, 100, 100);
		//b.setBounds(r);
		b.setSize(100, 100);
		f.add(BorderLayout.EAST, b);
		f.add(BorderLayout.WEST, t);
		//f.setLayout(null);
		f.setVisible(true);
		
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				t.setText(new Time(0).toString());
				
			}
		});
		
//		f.addWindowListener(new WindowAdapter(){
//			public void windowClosing(WindowEvent e) {
//				f.setVisible(false);
//			}
//		});
		
		adapter a = new adapter(f);
		f.addWindowListener(a);
	}
	
	
}
