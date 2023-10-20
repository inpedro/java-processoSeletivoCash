package sistemaCandidato;

import java.util.concurrent.ThreadLocalRandom;

public class processoSeletivo {
	public static void main(String[] args) {
		selecaoCandidatos();
		imprimirSelecionados();
	}
	static void imprimirSelecionados() {
		String [] candidatos = {"FELIPE","MARCIA","PAULO","JULIA","AUGUSTO"};
		System.out.println("imprimindo a lista de candidatos, informando o indice dos elementos.");
		
		for (int i = 0; i < candidatos.length; i++) {
			System.out.println("o candidato de numero " + (i+1) + " é " + candidatos[i]);
		}
		 System.out.println("Forma abreviada de iteração for each");
		 
		 for (String candidato: candidatos) {
			System.out.println("O candidato selecionado foi " + candidato);
		}
	}
	static void selecaoCandidatos() {
		 String [] candidatos = {"FELIPE","MARCIA","PAULO","JULIA","AUGUSTO","MONICA","FABRICIO"};
		 
		 int candidatosSelecionados = 0;
		 int candidatoAtual = 0;
		 double salarioBase = 2000.0;
		 while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length ) {
			 String candidato = candidatos[candidatoAtual];
			 double salarioPretendido = valorPretendido();
		 System.out.println(" O candidato " + candidato + " Solicitou este valor de salario R$ "  + salarioPretendido);
		 if(salarioBase >= salarioPretendido) {
			 System.out.println("O candidato " + candidato + " foi selecionado para a vaga. ");
			 candidatosSelecionados++;
		 	}
		 	candidatoAtual++;
		 }
	 }
	 
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800,2200);
	}
	 
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA CANDIDATO!");
		}else if(salarioBase==salarioPretendido) {
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS!");
		}else {
			System.out.println("ligar para o canditado com outra proposta...");
		}
	}
}
