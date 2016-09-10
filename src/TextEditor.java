import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class TextEditor implements KeyListener {
	JFrame frame;
	JPanel panel;
	JLabel label;
	String text;
	Stack<Character> stack;

	public TextEditor() {
		text = "";
		stack = new Stack<Character>();
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel();
	}

	public static void main(String[] args) {
		new TextEditor().createUI();
	}

	void createUI() {
		frame.add(panel);
		panel.add(label);
		frame.addKeyListener(this);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE && text.length() > 0) {
			stack.push(text.charAt(text.length() - 1));
			text = text.substring(0, text.length() - 1);
		} else if (e.getKeyCode() == KeyEvent.VK_UP && stack.size() > 0) {
			text += stack.pop();
		}
		else {
			text += e.getKeyChar();
		}
		
		label.setText(text);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
