import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * JPanel with image background.
 */
public class ImagePanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Image bgImage;
	
	/**
	 * Create a normal JPanel.
	 */
	public ImagePanel(){
		super();
	}
	
	/**
	 * Create a new ImagePanel Object with fixed size same as the image.
	 * @param image image url of the panel
	 * */
	public ImagePanel(String image){
		bgImage = new ImageIcon(getClass().getResource(image)).getImage();
		Dimension size = new Dimension(bgImage.getWidth(null), bgImage.getHeight(null));
		setPreferredSize(size);
		setMinimumSize(size);
		setMaximumSize(size);
		setSize(size);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(bgImage, 0, 0, null);
	}
}
