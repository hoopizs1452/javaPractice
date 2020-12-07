import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class adapter extends WindowAdapter {
	Frame f;
	
	adapter(Frame f){
		this.f = f;
	}
	
	public void windowClosing(WindowEvent e) {
		f.setVisible(false);
	}
}
