import javax.swing.JFrame;

public class BubbleDraw extends JFrame {

	public static void main(String[] args) {
		//set up the frame for our bubble draw app
		JFrame frame= new JFrame("Mayank's bubble draw app");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new BubblePanel());	
		frame.pack();
		frame.setVisible(true);

	}

}
