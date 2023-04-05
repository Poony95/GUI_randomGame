package randomGame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Test extends JFrame implements ActionListener{
	
	JButton b;
	JButton b2;
	JTextField tf1;
	JTextField tf2;
	JTextField result;
	int random;
	
	public Test() {
		Random r = new Random();
		random = r.nextInt(100)+1;
		setLayout(new FlowLayout());
		
		b = new JButton("다시한번");
		b2 = new JButton("종료");
		tf1 = new JTextField("숫자게임",35);
		tf2 = new JTextField(18);
		result= new JTextField(30);
		
		add(tf1);
		add(new JLabel("숫자를 추측하시오 : "));
		add(tf2);
		
		add(result);
		result.setBackground(Color.pink);
		
		add(b);
		add(b2);
		
		b.addActionListener(this);
		b2.addActionListener(this);
		
		setSize(400,200);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Test();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		
		System.out.println(random);
		int n = Integer.parseInt(tf2.getText());
		
		if(str.equals("다시한번")) {
				if(random > n) result.setText("값이 작습니다.");
				else if(random < n) result.setText("값이 큽니다.");
				else if(random == n) result.setText("정답입니다!!!");
			
		}
		if(str.equals("종료")) {
			System.exit(0);
		}
	}
}
