package Fibo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//import sun.jvm.hotspot.code.ScopeValue;

public class Serie extends JFrame implements ActionListener{
	JTextField txtNumero1;
	JTextArea area;
	JButton boton2;
	JPanel panel;
	private JTextField txtNumeroInicial;
	
	public Serie() {
	
	txtNumero1= new JTextField();
	txtNumero1.setBounds(139, 44, 80, 20);
	
	boton2= new JButton("Calcuar");
	boton2.setBounds(300,20,80,20);
	boton2.addActionListener(this);
	
	area = new JTextArea();
	area.setBounds(10, 77, 116,340 );
	
	panel= new JPanel();
	panel.setLayout(null);
	panel.add(txtNumero1);
	panel.add(boton2);
	panel.add(area);
	getContentPane().add(panel);
	
	JLabel lblNewLabel = new JLabel("Iteraciones");
	lblNewLabel.setBounds(10, 44, 80, 20);
	panel.add(lblNewLabel);
	
	JLabel lblNewLabel_1 = new JLabel("Numero inicial");
	lblNewLabel_1.setBounds(10, 23, 80, 20);
	panel.add(lblNewLabel_1);
	
	txtNumeroInicial = new JTextField();
	txtNumeroInicial.setBounds(133, 13, 86, 20);
	panel.add(txtNumeroInicial);
	txtNumeroInicial.setColumns(10);
	setSize(500,500);
	setVisible(true);
	
	}
	
public static void main(String[]args) {
	Serie p =new Serie();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	Calcular();
}




public void Calcular() {
	int inicio=Integer.parseInt(txtNumeroInicial.getText());
	int var1=0;
	int var2=1;
	int var3=0;
	
	int iteraciones = Integer.parseInt(txtNumero1.getText()) ;
	int x=0;
	String valor="";
	
	area.setText(valor);
  
	//System.out.println(var1);
	//System.out.println(var2);
	do {
		if(inicio==x)
		{
		 valor=String.valueOf(var1)+"\n"+String.valueOf(var2) ;
		iteraciones=iteraciones + var1;
		}
	 if(x >= inicio)
		{
			
	        valor = valor + "\n"+(var3);
	       area.setText(valor);
		}
		var3=var1+var2; 
		x++;
		
       
       
       var1=var2;
		var2=var3;
	
	}
	while(var2 <= iteraciones);

}
}
