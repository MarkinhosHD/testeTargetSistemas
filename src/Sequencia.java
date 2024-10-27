import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Sequencia {

	public static void main(String[] args) {
		//mensagem de início
				String numero = JOptionPane.showInputDialog(null, "Informe o valor desejado para saber se faz parte da Sequência de Fibonacci.");
				int nConvertido = Integer.parseInt(numero);
				
				ArrayList<Integer> fibonacci = new ArrayList<>();
		        fibonacci.add(0); // 1º n. Sequência de Fibonacci
		        fibonacci.add(1); // 2º n. Sequência de Fibonacci

		        boolean encontrado = false;
		        
		     // Sequência de Fibonacci e armazena os números em uma arrayList
		        for (int i = 2; ; i++) {
		            int proximoNumero = fibonacci.get(i - 1) + fibonacci.get(i - 2);
		            if (proximoNumero > nConvertido) {
		                break; // Interrompe a sequência se o número gerado for maior que o número a ser validado
		            }
		            fibonacci.add(proximoNumero);

		            if (proximoNumero == nConvertido) {
		                encontrado = true;
		                break; // Interrompe a sequência se o número fornecido for encontrado
		            }
		        }
				
		     // Mostra a sequência gerada
		        
		        JOptionPane.showMessageDialog(null,"Os números da Sequência de Fobonacci gerados são: \n" + fibonacci);
		        
		        
		        
		        // Verifica se o número está na sequência
		        if (encontrado) {		            
		            JOptionPane.showMessageDialog(null,"O número " + nConvertido + " faz parte da Sequência de Fibonacci.");
		        } else {		           
		        	JOptionPane.showMessageDialog(null,"O número " + nConvertido + " não faz parte da Sequência de Fibonacci.");
		        }
		        

	}

}
