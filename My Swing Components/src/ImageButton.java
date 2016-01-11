import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * JButton with background image and hover effect.
 */
public class ImageButton extends JButton {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private ImageIcon defaultIcon;
	private ImageIcon hoverIcon;
	private boolean state;
	
	/**
	 * Create a normal JButton.
	 * */
	public ImageButton(){
		super();
	}
	
	/**
	 * Create a new ImageButton Object.
	 * @param img1 normal image url of the button
	 * @param img2 hover image url of the button
	 * */
	public ImageButton(String img1, String img2){
		super();
		try {
			BufferedImage defaultImg = ImageIO.read(getClass().getResource(img1));
			BufferedImage hoverImg = ImageIO.read(getClass().getResource(img2));
			defaultIcon = new ImageIcon(defaultImg);
			hoverIcon = new ImageIcon(hoverImg);
		} catch (IOException e) {
			e.printStackTrace();
		}
		state = false;
		setIcon(defaultIcon);
		setRolloverIcon(hoverIcon);
		setBorder(null);
		setOpaque(false);
		setContentAreaFilled(false);
		setBorderPainted(false);
	}
	
	/**
	 * Create a new ImageButton Object with fixed width and height.
	 * @param img1 normal image url of the button
	 * @param img2 hover image url of the button
	 * @param width button width
	 * @param height button height
	 * */
	public ImageButton(String img1, String img2, int width, int height){
		super();
		try {
			BufferedImage defaultImg = ImageIO.read(getClass().getResource(img1));
			BufferedImage hoverImg = ImageIO.read(getClass().getResource(img2));
			defaultIcon = new ImageIcon(defaultImg);
			hoverIcon = new ImageIcon(hoverImg);
		} catch (IOException e) {
			e.printStackTrace();
		}
		state = false;
		setIcon(defaultIcon);
		setRolloverIcon(hoverIcon);
		setPreferredSize(new Dimension(width, height));
		setBorder(null);
		setOpaque(false);
		setContentAreaFilled(false);
		setBorderPainted(false);
	}
	
	/**
	 * Create a new ImageButton Object with fixed bounds.
	 * @param img1 normal image url of the button
	 * @param img2 hover image url of the button
	 * @param xasis button's position on the x-asis
	 * @param yasis button's position on the y-asis
	 * @param width button width
	 * @param height button height
	 * */
	public ImageButton(String img1, String img2, int xasis, int yasis, int width, int height){
		super();
		try {
			BufferedImage defaultImg = ImageIO.read(getClass().getResource(img1));
			BufferedImage hoverImg = ImageIO.read(getClass().getResource(img2));
			defaultIcon = new ImageIcon(defaultImg);
			hoverIcon = new ImageIcon(hoverImg);
		} catch (IOException e) {
			e.printStackTrace();
		}
		state = false;
		setIcon(defaultIcon);
		setRolloverIcon(hoverIcon);
		setBounds(xasis, yasis, width, height);
		setBorder(null);
		setOpaque(false);
		setContentAreaFilled(false);
		setBorderPainted(false);
	}
	
	/**
	 * Hover the button.
	 * */
	public void hover(){
		if(state){
			setIcon(hoverIcon);
		} else {
			setIcon(defaultIcon);
		}
	}
}
