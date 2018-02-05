import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class SecondSwing extends JFrame implements ActionListener
{	
	JFrame frame;
	float  n1,n2,result;
	JTextField titleText;
	JButton delClr;
	String before;
	char op;
	SecondSwing()
	{
		before = "";
		frame = new JFrame();
		Container cont = getContentPane();
		JPanel tPan = new JPanel();
		titleText = new JTextField();
		titleText.setFont(new Font(titleText.getText(),Font.BOLD,30));
		titleText.setPreferredSize( new Dimension( 200, 70 ) );
		tPan.add(titleText);
		tPan.setLayout(new BoxLayout(tPan,BoxLayout.X_AXIS));
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4,3));
		JButton seven = new JButton("7");
		JButton eight = new JButton("8");
		JButton nine = new JButton("9");
		JButton four = new JButton("4");
		JButton five = new JButton("5");
		JButton six = new JButton("6");
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton three = new JButton("3");
		JButton point = new JButton(".");
		JButton zero = new JButton("0");
		JButton equal = new JButton("=");
		two.addActionListener(this);
		three.addActionListener(this);
		one.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		point.addActionListener(this);
		equal.addActionListener(this);
		zero.addActionListener(this);
		panel.add(seven);
		panel.add(eight);
		panel.add(nine);
		panel.add(four);
		panel.add(five);
		panel.add(six);
		panel.add(one);
		panel.add(two);
		panel.add(three);
		panel.add(point);
		panel.add(zero);
		panel.add(equal);
		JPanel pan = new JPanel();
		pan.setLayout(new GridLayout(5,1));
		delClr = new JButton("DEL");
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		JButton mult = new JButton("*");
		JButton div = new JButton("/");
		delClr.addActionListener(this);
		plus.addActionListener(this);
		minus.addActionListener(this);
		mult.addActionListener(this);
		div.addActionListener(this);
		pan.add(delClr);
		pan.add(div);
		pan.add(mult);
		pan.add(minus);
		pan.add(plus);
		cont.add(tPan,BorderLayout.NORTH);
		cont.add(panel,BorderLayout.CENTER);
		cont.add(pan,BorderLayout.EAST);
		frame.add(cont);
		frame.setSize(500,500);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String str  = e.getActionCommand();
		if(!str.equals("CLR"))
		{
			delClr.setText("DEL");
		}
		if(str.equals("1"))	
		{
			titleText.setText(titleText.getText()+"1");	
		}		
		if(str.equals("2"))	
		{
			titleText.setText(titleText.getText()+"2");
		}	
		if(str.equals("3"))	
		{
			titleText.setText(titleText.getText()+"3");
		}	
		if(str.equals("4"))	
		{
			titleText.setText(titleText.getText()+"4");
		}	
		if(str.equals("5"))	
		{
			titleText.setText(titleText.getText()+"5");
		}	
		if(str.equals("6"))	
		{
			titleText.setText(titleText.getText()+"6");
		}	
		if(str.equals("7"))	
		{
			titleText.setText(titleText.getText()+"7");
		}	
		if(str.equals("8"))	
		{
			titleText.setText(titleText.getText()+"8");
		}	
		if(str.equals("9"))	
		{
			titleText.setText(titleText.getText()+"9");
		}	
		if(str.equals("0"))	
		{
			titleText.setText(titleText.getText()+"0");
		}	
		if(str.equals("+"))	
		{
			op = '+';
			n1 = Float.parseFloat(titleText.getText());
			titleText.setText("");
		}	
		if(str.equals("-"))	
		{
			op = '-';
			n1 = Float.parseFloat(titleText.getText());
			titleText.setText("");
		}	
		if(str.equals("*"))	
		{
			op = '*';
			n1 = Float.parseFloat(titleText.getText());
			titleText.setText("");
		}	
		if(str.equals("/"))	
		{
			op = '/';
			n1 = Float.parseFloat(titleText.getText());
			titleText.setText("");
		}	
		if(str.equals("CLR"))	
		{
			n1 = n2 = 0;
			titleText.setText("");
			delClr.setText("DEL");
		}	
		if(str.equals("DEL"))
		{
			String cur = titleText.getText();
			if(!cur.isEmpty())
				cur = cur.substring(0,cur.length()-1);
			else 
				cur = "";
			titleText.setText(cur);
		}
		if(str.equals("="))	
		{
			n2 = Float.parseFloat(titleText.getText());
			switch(op)
			{
				case '+' : result = n1 + n2;
					   break;
				case '-' : result = n1 - n2;
					   break;
				case '*' : result = n1 * n2;
					   break;
				case '/' : result = n1 / n2;
				           break;
			}
			titleText.setText(Float.toString(result));
			delClr.setText("CLR");
		}	
		if(str.equals("."))	
		{
			 titleText.setText(titleText.getText()+".");
		}	
	}
	public static void main(String [] args)	
	{
		new SecondSwing();
	}
}
