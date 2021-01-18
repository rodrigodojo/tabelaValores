package aplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Program extends JFrame{
	
		private JTextField lblPeso,lblTempo,lblQuantidade,lblResultado,lblTotal,lblValor;
		private JLabel lblPesotitle,lblTempotitle,lblQuantidadetitle;
		private	JButton  btnCalcular;
		private double num=0,num2=0;
		
		public Program(){	
			
			lblPesotitle = new JLabel("Peso :");
			lblPesotitle.setBounds(20,10,90,40);
			lblPesotitle.setFont(new Font("Arial", Font.BOLD , 18));
			lblPesotitle.setBackground(Color.WHITE);
			add(lblPesotitle);
			
			lblPeso = new JTextField("");
			lblPeso.setBounds(230,10,90,40);
			lblPeso.setFont(new Font("Arial", Font.BOLD | Font.ITALIC , 16));
			lblPeso.setOpaque(true);
			lblPeso.setBackground(Color.WHITE);
			add(lblPeso);
			
			lblTempotitle = new JLabel("Tempo :");
			lblTempotitle.setBounds(20,70,90,40);
			lblTempotitle.setFont(new Font("Arial", Font.BOLD , 18));
			lblTempotitle.setBackground(Color.WHITE);
			add(lblTempotitle);
			
			lblTempo = new JTextField("");
			lblTempo.setBounds(230,70,90,40);
			lblTempo.setFont(new Font("Arial", Font.BOLD | Font.ITALIC , 16));
			lblTempo.setOpaque(true);
			lblTempo.setBackground(Color.WHITE);
			add(lblTempo);
			
			lblQuantidadetitle = new JLabel("Quantidade :");
			lblQuantidadetitle.setBounds(20,140,150,40);
			lblQuantidadetitle.setFont(new Font("Arial", Font.BOLD , 18));
			lblQuantidadetitle.setBackground(Color.WHITE);
			add(lblQuantidadetitle);
			
			lblQuantidade = new JTextField("");
			lblQuantidade.setBounds(230,140,90,40);
			lblQuantidade.setFont(new Font("Arial", Font.BOLD | Font.ITALIC , 16));
			lblQuantidade.setOpaque(true);
			lblQuantidade.setBackground(Color.WHITE);
			add(lblQuantidade);
			
			lblResultado = new JTextField("");
			lblResultado.setBounds(230,200,90,40);
			lblResultado.setFont(new Font("Arial", Font.BOLD | Font.ITALIC , 16));
			lblResultado.setOpaque(true);
			lblResultado.setBackground(Color.WHITE);
			add(lblResultado);
			
			lblValor = new JTextField("");
			lblValor.setBounds(330,200,90,40);
			lblValor.setFont(new Font("Arial", Font.BOLD | Font.ITALIC , 16));
			lblValor.setOpaque(true);
			lblValor.setBackground(Color.WHITE);
			add(lblValor);
			
			lblTotal = new JTextField("");
			lblTotal.setBounds(230,265,90,40);
			lblTotal.setFont(new Font("Arial", Font.BOLD | Font.ITALIC , 16));
			lblTotal.setOpaque(true);
			lblTotal.setBackground(Color.WHITE);
			add(lblTotal);
					
			btnCalcular = new JButton("Calcular o Custo.");
			btnCalcular.setBounds(10,200,200,40);
			btnCalcular.setFont(new Font("Arial", Font.BOLD , 18));
			add(btnCalcular);
			btnCalcular.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
							num = calcular(lblPeso.getText(),lblTempo.getText(),lblQuantidade.getText());
							lblResultado.setText(Double.toString(num));
					}
				}
			);

			btnCalcular = new JButton("Calcular o Valor.");
			btnCalcular.setBounds(10,265,200,40);
			btnCalcular.setFont(new Font("Arial", Font.BOLD , 18));
			add(btnCalcular);
			btnCalcular.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
							num2 = calcularValor(lblValor.getText());
							lblTotal.setText(Double.toString(num2));
					}
				}
			);
		}
		
		public static void main(String args[]){
			
			Program form = new Program();
			form.setLayout(null);
			form.setBounds(0,0,460,370);
			form.setVisible(true);
			form.setResizable(false);
			form.setLocationRelativeTo(null);
			form.setDefaultCloseOperation(EXIT_ON_CLOSE);
			form.setTitle("Precos de Produtos");
			
		}

		public double calcular(String pesoItem, String tempoItem, String quantItem){
			
			double pesoFilamento=0.15,energiaImpressora=0.84,manutencaoImpressora=0.95,resultado=0,embalagem=1.68;
			
			resultado = ((pesoFilamento*Double.parseDouble(pesoItem))*Double.parseDouble(quantItem))+(energiaImpressora*Double.parseDouble(tempoItem))+(manutencaoImpressora*Double.parseDouble(tempoItem)+embalagem);
			
			return resultado = (resultado*0.30) + resultado;			
		}
		
		public double calcularValor(String custo){
			
			double custoAnuncio=0,totalPreco=0;
			
			return custoAnuncio = (Double.parseDouble(custo)*16/100)+5;	
		}
}
