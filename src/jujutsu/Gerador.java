package jujutsu;

import java.util.Random;

public class Gerador {

	static Random random = new Random();
	
	static String[] nomes = {"Akira", "Ren", "Kaito", "Hito", "Daiki"};
	static String[] origens = {"Feiticeiros", "Espirito Amaldiçoado", "Hibrido", "Usuario de Maldição"};
	static String[] niveis = {"Grau 4", "Grau 3", "Grau 2", "Semi-Grau 1", "Grau 1", "Grau Especial"};
	static String[] energias = {"Normal", "Massiva", "Refinada", "Caotica", "Negativa pura"};
	static String[] tecnicas = {"Sombras", "Fogo", "Sangue", "Espaço", "Invocação", "Ilusão"};
	static String[] habilidades = {"Black Flash", "Regeneção", "Força Extrema", "Velocidade absurda"};
	static String[] dominios = {"Não Possui", "Incompleto", "Completo"};
	static String[] estilos = {"Corpo a corpo", "Longa distancia", "Estrategico", "Agressivo"};
	static String[] personalidades = {"Frio", "Impulsivo", "Sarcastico", "Cruel"};
	static String[] fraquezas = {"Alto consumo de energia", "Instabilidade emocional", "depende de condições"};
	
	public static String sortear(String[] lista) {
		return lista[random.nextInt(lista.length)];
	}
	
	public static Personagem gerarPersonagem() {
		return new Personagem(
				sortear(nomes),
				sortear(origens),
				sortear(niveis),
				sortear(energias),
				sortear(tecnicas),
				sortear(habilidades),
				sortear(dominios),
				sortear(estilos),
				sortear(personalidades),
				sortear(fraquezas)
				);
	}
}
