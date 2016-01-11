import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * JPanel with pattern background.
 */
public class PatternPanel extends JPanel {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	private BufferedImage bgImage;
	private BufferedImage background;

	/**
	 * Create a normal JPanel.
	 */
	public PatternPanel(){
		super();
	}
	
	/**
	 * Create a new PatternPanel Object.
	 * @param image pattern url of the panel
	 * */
	public PatternPanel(String image) {
		try {
          bgImage = ImageIO.read(getClass().getResource(image));
      } catch (IOException ex) {
          ex.printStackTrace();
      }
		setOpaque(false);
		setBackground(Color.WHITE);
	}
	
	/**
	 * Create a new PatternPanel Object with fixed size.
	 * @param image pattern url of the panel
	 * @param width panel width
	 * @param height panel height
	 * */
	public PatternPanel(String image, int width, int height) {
		try {
          bgImage = ImageIO.read(getClass().getResource(image));
      } catch (IOException ex) {
          ex.printStackTrace();
      }
		setOpaque(false);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(width, height));
	}
	
	@Override
	public void paintComponent(Graphics g) {
		int width = getWidth();
		int height = getHeight();
		background = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2d = background.createGraphics();
        int x = 0;
        int y = 0;
        while (y < getHeight()) {	
        	while (x < getWidth()) {
        		g2d.drawImage(bgImage, x, y, this);
        		x += bgImage.getWidth();
        	}
        	x = 0;
        	y += bgImage.getHeight();
        }
        g2d.dispose();
		g.drawImage(background, 0, 0, null);
	}

}