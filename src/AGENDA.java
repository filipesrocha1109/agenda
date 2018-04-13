import java.util.ArrayList;
import java.util.Scanner;

public class AGENDA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		ArrayList<ENDERECO> e = new ArrayList<ENDERECO>();
		ArrayList<PESSOA> p = new ArrayList<PESSOA>();
		ArrayList<TELEFONE> t = new ArrayList<TELEFONE>();

		System.out.println("DESEJA INICIAR O PROGRAMA: [S] - SIM, [N] - NAO");
		String confirma = ler.next();

		
		while (confirma.equalsIgnoreCase("s")) {

			System.out.println("informe o opçao correspondente abaixo:");
			System.out.println("[1] - cadastrar,  [2] buscar [3] excluir");
			String opcao = ler.next();

			if(opcao.equalsIgnoreCase("1")){
				PESSOA c_pes = new PESSOA();
				TELEFONE c_tel = new TELEFONE();
				ENDERECO c_end = new ENDERECO();
				
				System.out.println("Nome:");
				c_pes.setPessoa(ler.next());
				p.add(c_pes);

				System.out.println("telefone:");
				c_tel.setTelefone(ler.next());
				t.add(c_tel);

				System.out.println("endereço:");
				c_end.setEndereco(ler.next());
				e.add(c_end);

			}

			if(opcao.equalsIgnoreCase("2")){

				System.out.println("Nome:");
				String busca = ler.next();
				int s;
					
				PESSOA b_pes = new PESSOA();
				TELEFONE b_tel = new TELEFONE();
				ENDERECO b_end = new ENDERECO();

				s = e.size() - 1;
				
				for (int i = 0; i < e.size(); i++) {
					// Copia a referencia da posicao 0 para uma variavel local
					b_pes = p.get(i);
					
					// b_pes.getdel serve para mudar o valor e não encontrar 
					
					if (busca.equalsIgnoreCase(b_pes.getPessoa()) &&  b_pes.getDel() == 0) {
						System.out.println("Encontrou");
						b_tel = t.get(i);
						b_end = e.get(i);

						System.out.println("Nome: " + b_pes.getPessoa());
						System.out.println("Telefone " + b_tel.getTelefone());
						System.out.println("Endereco: " + b_end.getEndereco());

						break;

					}
					
					if (i == s) {
						System.out.println("Nao Cadastrado");

					}

				}
				
			
			}
			if(opcao.equalsIgnoreCase("3")){

				System.out.println("Nome:");
				String busca1 = ler.next();
				int s1;

				PESSOA e_pes = new PESSOA();
		
				s1 = e.size() - 1;
				
				for (int i = 0; i < e.size(); i++) {
					// Copia a referencia da posicao 0 para uma variavel local
					e_pes = p.get(i);
				 	
					if (busca1.equalsIgnoreCase(e_pes.getPessoa()) &&  e_pes.getDel() == 0) {
						System.out.println("Excluido com sucesso");
						e_pes.setDel();
						break;

					}

					if (i == s1) {
						System.out.println("Nao Cadastrado");

					}

				}
				
			}
			System.out.println("DESEJA CONTINUAR: [S] - SIM, [N] - NAO");
			confirma = ler.next();

		}

	}

}
