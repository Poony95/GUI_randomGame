package layout;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FlowLayoutTest extends JFrame implements ActionListener{
	JTextField j;
	JTextField j2;
	JButton btn;
	JLabel l;
	
	public FlowLayoutTest(){
		j = new JTextField(10);
		j2 = new JTextField(10);
		btn  = new JButton("확인");
		l = new JLabel();
		
		setLayout(new FlowLayout());
		
		add(new JLabel("아이디"));
		add(j);
		add(new JLabel("비밀번호"));
		add(j2);
		add(btn);
		btn.addActionListener(this);
		add(l);
		
		setSize(400,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new FlowLayoutTest();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		l.setText("아이디는 "+j.getText()+" 비밀번호는 "+j2.getText()+"입니다.");
		
		
	}

}
