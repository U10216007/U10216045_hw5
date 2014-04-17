import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;



	public class CalculatorPassword extends JFrame { 
		private JPasswordField jpfpassword = new JPasswordField(4);
		private JButton jbtlogin = new JButton("Login");
		private JLabel status = new JLabel("");
		public boolean log = false;

		public CalculatorPassword(){
			JPanel p4 = new JPanel(new GridLayout(2,1));
			p4.add(status);
			p4.add(jpfpassword);

			JPanel p5 = new JPanel(new GridLayout(1,1));
			p5.add(jbtlogin);

			add(p4, BorderLayout.CENTER);
			add(p5, BorderLayout.SOUTH);

			jbtlogin.addActionListener(new ButtonListener());

		}
		private class ButtonListener implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent ek){
				char[] password = jpfpassword.getPassword();
				String pw = new String(password);
				String truepassword = "0000";
				if(pw.equals(truepassword)){
					status.setText("Your password is true.");
					Calculator_GUI gui = new Calculator_GUI();
					gui.pack();
					gui.setSize(400, 500);
					gui.setTitle("Calculator");
					gui.setLocationRelativeTo(null);
					gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					gui.setVisible(true);
				}
				else {
					status.setText("Your password is wrong.");
				}

			}
		}



	public static void main(String[] args){		
		CalculatorPassword  pw = new CalculatorPassword ();
		pw.pack();		
		pw.setSize(400, 300);
		pw.setTitle("CalculatorPassword");
		pw.setLocationRelativeTo(null);
		pw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pw.setVisible(true);

	}
}

class Calculator_GUI extends JFrame{

	private JLabel jlresult = new JLabel("0", JLabel.RIGHT);
	private JButton jbtone = new JButton("1");
	private JButton jbttwo = new JButton("2");
	private JButton jbtthree = new JButton("3");
	private JButton jbtfour = new JButton("4");
	private JButton jbtfive = new JButton("5");
	private JButton jbtsix = new JButton("6");
	private JButton jbtseven = new JButton("7");
	private JButton jbteight = new JButton("8");
	private JButton jbtnine = new JButton("9");
	private JButton jbtzero = new JButton("0");
	private JButton jbtplus = new JButton("+");
	private JButton jbttime = new JButton("X");
	private JButton jbtminus = new JButton("-");
	private JButton jbtdivide = new JButton("/");
	private JButton jbtroot = new JButton("root");
	private JButton jbtsquare = new JButton("square");
	private JButton jbtsin = new JButton("sin");
	private JButton jbtcos = new JButton("cos");
	private JButton jbttan = new JButton("tan");
	private JButton jbtdelete = new JButton("C");
	private JButton jbtcalculate = new JButton("=");
	private JButton jbtdecimal = new JButton(".");

  
	public Calculator_GUI(){

		JPanel p1 = new JPanel(new GridLayout(4,5,3,3));
		p1.add(jbtplus);
		p1.add(jbtone);
		p1.add(jbttwo);
		p1.add(jbtthree);
		p1.add(jbtsin);
		p1.add(jbtminus);
		p1.add(jbtfour);
		p1.add(jbtfive);
		p1.add(jbtsix);
		p1.add(jbtcos);
		p1.add(jbttime);
		p1.add(jbtseven);
		p1.add(jbteight);
		p1.add(jbtnine);
		p1.add(jbttan);
		p1.add(jbtdivide);
		p1.add(jbtdecimal);
		p1.add(jbtzero);
		p1.add(jbtroot);
		p1.add(jbtsquare);

    
		JPanel p2 = new JPanel(new GridLayout(1,2,3,0));

		p2.add(jbtdelete);
		p2.add(jbtcalculate);

		JPanel p3 = new JPanel(new GridLayout(1,1));
		p3.add(jlresult);


		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		add(p3, BorderLayout.NORTH);



		ButtonListener listener = new ButtonListener();
		jbtplus.addActionListener(listener);
		jbtone.addActionListener(listener);
		jbttwo.addActionListener(listener);
		jbtthree.addActionListener(listener);
		jbtsin.addActionListener(listener);
		jbtminus.addActionListener(listener);
		jbtfour.addActionListener(listener);
		jbtfive.addActionListener(listener);
		jbtsix.addActionListener(listener);
		jbtcos.addActionListener(listener);
		jbttime.addActionListener(listener);
		jbtseven.addActionListener(listener);
		jbteight.addActionListener(listener);
		jbtnine.addActionListener(listener);
		jbttan.addActionListener(listener);
		jbtdivide.addActionListener(listener);
		jbtdecimal.addActionListener(listener);
		jbtzero.addActionListener(listener);
		jbtroot.addActionListener(listener);
		jbtsquare.addActionListener(listener);
		jbtdelete.addActionListener(listener);
		jbtcalculate.addActionListener(listener);

	}

	private class ButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent ev){
			int staticplus = 0;
			double number = 0;
			double result = 0;
			boolean decimalcheck = false;
			int integernumber = 0;


			if(ev.getSource() == jbtplus){
				number = Double.parseDouble(jlresult.getText());
				staticplus = 1;
				jlresult.setText("0");
			}			

			else if(ev.getSource() == jbtone){
				number = Double.parseDouble(jlresult.getText());

				if(number == 0){
					jlresult.setText("1");
				}
				else{
					if(decimalcheck == true)
						jlresult.setText(number + "1");
					else {
						integernumber = (int) (number);
						jlresult.setText(integernumber + "1");
					}
				}
			}

			else if(ev.getSource() == jbttwo){
				number = Double.parseDouble(jlresult.getText());

				if(number == 0){
					jlresult.setText("2");
				}
				else{
					if(decimalcheck == true)
						jlresult.setText(number + "2");
					else{
						integernumber = (int) (number);
						jlresult.setText(integernumber + "2");
					}
				}
			}

			else if(ev.getSource() == jbtthree){
				number = Double.parseDouble(jlresult.getText());

				if(number == 0){
					jlresult.setText("3");
				}
				else{
					if(decimalcheck == true)
						jlresult.setText(number + "3");
					else{
						integernumber = (int) (number);
						jlresult.setText(integernumber + "3");
					}
				}
			}

			else if(ev.getSource() == jbtfour){
				number = Double.parseDouble(jlresult.getText());

				if(number == 0){
					jlresult.setText("4");
				}
				else{
					if(decimalcheck == true)
						jlresult.setText(number + "4");
					else{
						integernumber = (int) (number);
						jlresult.setText(integernumber + "4");
					}
				}
			}

			else if(ev.getSource() == jbtfive){
				number = Double.parseDouble(jlresult.getText());

				if(number == 0){
					jlresult.setText("5");
				}
				else{
					if(decimalcheck == true)
						jlresult.setText(number + "5");
					else{
						integernumber = (int) (number);
						jlresult.setText(integernumber + "5");
					}
				}
			}

			else if(ev.getSource() == jbtsix){
				number = Double.parseDouble(jlresult.getText());

				if(number == 0){
					jlresult.setText("6");
				}
				else{
					if(decimalcheck == true)
						jlresult.setText(number + "6");
					else{
						integernumber = (int) (number);
						jlresult.setText(integernumber + "6");
					}
				}					

			}

			else if(ev.getSource() == jbtseven){
				number = Double.parseDouble(jlresult.getText());

				if(number == 0){
					jlresult.setText("7");
				}
				else{
					if(decimalcheck == true)
						jlresult.setText(number + "7");
					else{
						integernumber = (int) (number);
						jlresult.setText(integernumber + "7");
					}
				}
			}

			else if(ev.getSource() == jbteight){
				number = Double.parseDouble(jlresult.getText());

				if(number == 0){
					jlresult.setText("8");
				}
				else{
					if(decimalcheck == true)
						jlresult.setText(number + "8");
					else{
						integernumber = (int) (number);
						jlresult.setText(integernumber + "8");
					}
				}
			}

			else if(ev.getSource() == jbtnine){
				number = Double.parseDouble(jlresult.getText());

				if(number == 0){
					jlresult.setText("9");
				}
				else{
					if(decimalcheck == true)
						jlresult.setText(number + "9");
					else{
						integernumber = (int) (number);
						jlresult.setText(integernumber + "9");
					}
				}
			}

			else if(ev.getSource() == jbtzero){
				number = Double.parseDouble(jlresult.getText());

				if(number == 0){
					jlresult.setText("0");
				}
				else{
					if(decimalcheck == true)
						jlresult.setText(number + "0");
					else{
						integernumber = (int) (number);
						jlresult.setText(integernumber + "0");
					}
				}
			}

			else if(ev.getSource() == jbtminus){
				number = Double.parseDouble(jlresult.getText());
				staticplus = 2;
				jlresult.setText("0");
			}

			else if(ev.getSource() == jbttime){
				number = Double.parseDouble(jlresult.getText());
				staticplus = 3;
				jlresult.setText("0");
			}

			else if(ev.getSource() == jbtdivide){
				number = Double.parseDouble(jlresult.getText());
				staticplus = 4;
				jlresult.setText("0");
			}

			else if(ev.getSource() == jbtsin){
				number = Double.parseDouble(jlresult.getText());
				result = Math.sin(number);
				String Value = new String(""+result);
				jlresult.setText(Value);
			}

			else if(ev.getSource() == jbtcos){
				number = Double.parseDouble(jlresult.getText());
				result = Math.cos(number);
				String Value = new String(""+result);
				jlresult.setText(Value);
			}

			else if(ev.getSource() == jbttan){
				number = Double.parseDouble(jlresult.getText());
				result = Math.tan(number);
				String Value = new String(""+result);
				jlresult.setText(Value);
			}

			else if(ev.getSource() == jbtdecimal){
				while(decimalcheck == false){
					number = Double.parseDouble(jlresult.getText());
					jlresult.setText(number + ".");
					decimalcheck = true;
				}
			}

			else if(ev.getSource() == jbtroot){
				number = Double.parseDouble(jlresult.getText());
				result = Math.sqrt(number);
				String Value = new String(""+result);
				jlresult.setText(Value);
			}

			else if(ev.getSource() == jbtsquare){
				number = Double.parseDouble(jlresult.getText());
				result = Math.pow(number , 2 );
				String Value = new String(""+result);
				jlresult.setText(Value);
			}	

			else if(ev.getSource() == jbtdelete){
				number = 0;
				result = 0; 
				staticplus = 0;
				jlresult.setText("0");
			}

			else if(ev.getSource() == jbtcalculate){
				result = Double.parseDouble(jlresult.getText());
				switch(staticplus){
					case 0:result = result;break;
					case 1:result = result + number;break;
					case 2:result = number - result;break;
					case 3:result = number * result;break;
					case 4:result = number / result;
				}
				String Value = new String(""+result);
				jlresult.setText(Value);
				staticplus = 0;
				number = 0;
				result = 0; 
			}

		}
    }	
}
