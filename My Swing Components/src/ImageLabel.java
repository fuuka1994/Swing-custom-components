import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * JLabel with image background and change background function.
 */
public class ImageLabel extends JLabel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create a normal JLabel.
	 */
	public ImageLabel() {
		super();
	}
	
	/**
	 * Create a new ImageLabel Object.
	 * @param image background image's url
	 * @param width label width
	 * @param height label height
	 */
	public ImageLabel(String image, int width, int height) {
		super();
		try {
			Image img = ImageIO.read(getClass().getResource(image));
			BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
			Graphics g = bi.createGraphics();
			g.drawImage(img, 0, 0, width, height, null);
			ImageIcon icon = new ImageIcon(bi);
			setIcon(icon);
		} catch (IOException e) {
			setText("Image not found");
			e.printStackTrace();
		}
	}
	/**
	 * Change label's backgound to a new image.
	 * @param image new image's url
	 */
	public void changeImage(String image){
		try {
			Image img = ImageIO.read(getClass().getResource(image));
			BufferedImage bi = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
			Graphics g = bi.createGraphics();
			g.drawImage(img, 0, 0, getWidth(), getHeight(), null);
			ImageIcon icon = new ImageIcon(bi);
			setIcon(icon);
		} catch (IOException e) {
			setText("Image not found");
			e.printStackTrace();
		}
	}

}

