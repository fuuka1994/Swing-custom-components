import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * Testing the components
 */
public class TestComponents extends JFrame {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	private String background = "background.jpg";
	private String pattern = "pattern.png";
	private String buttonbg = "ok.png";
	private String buttonbgh = "okh.png";
	
	public TestComponents(){
		this.setResizable(false);
		this.setTitle("Test Frame");
		this.setBounds((java.awt.Toolkit.getDefaultToolkit().getScreenSize().width-900)/2, 5, 900, 700);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.getContentPane().setLayout(new WrapLayout());
		
		ImagePanel imagePanel = new ImagePanel(background);
		this.getContentPane().add(imagePanel);
		
		PatternPanel patternPanel = new PatternPanel(pattern, 200, 400);
		this.getContentPane().add(patternPanel);
		
		ImageButton imageButton = new ImageButton(buttonbg, buttonbgh, 50, 50);
		this.getContentPane().add(imageButton);
		
		PatternProgressBar patternProgressBar = new PatternProgressBar(pattern);
		patternProgressBar.setPreferredSize(new Dimension(700, 50));
		patternProgressBar.setValue(70);
		this.getContentPane().add(patternProgressBar);
	}

	public static void main(String[] args) {
		new TestComponents().setVisible(true);
	}
}
