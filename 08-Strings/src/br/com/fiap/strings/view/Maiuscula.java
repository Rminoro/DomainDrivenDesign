package br.com.fiap.strings.view;
import javax.swing.JOptionPane;

public class Maiuscula {
 public static void main(String[] args) {

		String palavra = JOptionPane.showInputDialog("Digite a a palavra");
		
		String palavraMaiusculo = palavra.toUpperCase();
		
		System.out.println(palavraMaiusculo);
 	}
		
}