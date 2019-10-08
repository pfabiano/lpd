import java.io.IOException;
import java.util.ArrayList;

public class LexicoMain {
	public static void main(String[]args) throws IOException {
		
		//Cria lista de tokens
		ArrayList<Token> lt = new ArrayList<Token>();
		
		//Cria analisador l�xico
		Lexico lexico = new Lexico();
		
		//Realiza a an�lise l�xica
		//lexico.analisa(args[0]);		
		lt = lexico.analisa("teste1.lpd");
		
		//Imprime n�mero de tokens
		System.out.println("Numero de tokens" +lt.size());
		
		//Percorre lista de tokens imprimindo-os
		lt.forEach(token -> System.out.println(token.toString()));
		
	}
	
}