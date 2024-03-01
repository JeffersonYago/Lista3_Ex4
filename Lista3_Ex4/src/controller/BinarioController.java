package controller;

public class BinarioController {

	public BinarioController() {
		super();
	}
	public int binConversor(int num) {
		if (num == 0) {
			return 0;
//para evitar divisão por 0, a chamada da recursiva é interrompida quando "num" chega a zero
		}else{
			return (num % 2 + 10 * binConversor(num / 2)); }
//enquanto for possível, o resto de "num" dividido por 2 é multiplicado pela recursiva 
	}
}
