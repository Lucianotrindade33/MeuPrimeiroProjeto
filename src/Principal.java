import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calculadora = new Calculadora();
		
		
		
//		 calculadora.somar(10,50);
//		 calculadora.somar(20,10);
		int primeiroValor= Integer.parseInt(
		JOptionPane.showInputDialog("digite um valor"));
		int segundoValor= Integer.parseInt(
				JOptionPane.showInputDialog("digite um valor"));
		

		JOptionPane.showMessageDialog(null ,
				"o valor somado é : "+calculadora.getValor());

		//calculadora.multiplicar(10, 5));
		calculadora.multiplicar(primeiroValor, segundoValor);
		JOptionPane.showMessageDialog(null ,calculadora.getValor());
		
		calculadora.dividir();
		calculadora.subtrair();
		

	}

}
