import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class JGraph extends JPanel {
	private Color color;
	public JGraph(Color color){
		this.color = color;
	}
    @Override public void paintComponent(Graphics g) {
    	g.setColor(color);
    	g.fillOval(0, 0, this.getBounds().width, this.getBounds().height); // <-- draws an oval on the panel
    }
    public void setColor(Color c){
    	this.color = c;
    }
}
