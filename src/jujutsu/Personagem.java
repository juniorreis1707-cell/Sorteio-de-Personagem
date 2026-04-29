package jujutsu;

public class Personagem {
		
		String nome;
		String origem;
		String nivel;
		String energia;
		String tecnica;
		String habilidade;
		String dominio;
		String estiloLuta;
		String personalidade;
		String fraqueza;
		
		
		public Personagem(String nome, String origem, String nivel, String energia, String tecnica, String habilidade, 
				String dominio, String estiloLuta, String personalidade, String fraqueza) {
			
			this.nome = nome;
			this.origem = origem;
			this.nivel = nivel;
			this.energia = energia;
			this.tecnica = tecnica;
			this.habilidade = habilidade;
			this.dominio = dominio;
			this.estiloLuta = estiloLuta;
			this.personalidade = personalidade;
			this.fraqueza = fraqueza;
			
		}
		
		public void exibir() {
			System.out.println("\n===== PERSONAGEM GERADO =====");
			System.out.println("Nome: " + nome);
			System.out.println("Origem: " + origem);
			System.out.println("Nivel: " + nivel);
			System.out.println("Energia: " + energia);
			System.out.println("Tecnica: " + tecnica);
			System.out.println("Habilidade: " + habilidade);
			System.out.println("Dominio: " + dominio);
			System.out.println("Estilo de Luta: " + estiloLuta);
			System.out.println("Personalidade: " + personalidade);
			System.out.println("Fraqueza: " + fraqueza);
		}
	}

