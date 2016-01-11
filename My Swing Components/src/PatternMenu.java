import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JMenuBar;

/**
 * JMenuBar with pattern background.
 */
public class PatternMenu extends JMenuBar {

private static final long serialVersionUID = 1L;
	
	private BufferedImage bgImage;
	private BufferedImage background;
	
	/**
	 * Create a normal JMenuBar.
	 */
	public PatternMenu(){
		super();
	}
	
	/**
	 * Create a new PatternMenu.
	 * @param image menu pattern's url
	 */
	public PatternMenu(String image){
		try {
			bgImage = ImageIO.read(getClass().getResource(image));
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		setOpaque(false);
		setBackground(Color.WHITE);
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
