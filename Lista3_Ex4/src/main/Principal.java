package main;

import javax.swing.JOptionPane;

import controller.BinarioController;

public class Principal {

	public static void main(String[] args) {
		BinarioController bin = new BinarioController();
		int num = Integer.parseInt(JOptionPane.showInputDialog("insira um número"));
		while(num > 2000) {
			num = Integer.parseInt(JOptionPane.showInputDialog("insira um número"));
		}
		String resultado = String.valueOf(bin.binConversor(num));
		System.out.println(resultado);
	}

}
