import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calculadora = new Calculadora();
		
		
		
		 calculadora.somar(10,50);
		 calculadora.somar(20,10);
		
		JOptionPane.showMessageDialog(null ,calculadora.getValor());
		calculadora.dividir();
		calculadora.subtrair();
		

	}

}
