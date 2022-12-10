package br.com.alura.java8novidades;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println("hoje: " + hoje);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(hoje.format(formatador));
		
		LocalDate aposentar = LocalDate.of(2025, Month.MAY, 30);
		int anos = aposentar.getYear() - hoje.getYear();
		System.out.println(anos + " anos para aposentar.");
		
		Period periodo = Period.between(hoje, aposentar);//variável precisa ser tratada
		System.out.println(periodo + " periodo");//não tratada
		//System.out.println(periodo.format(formatador) + " periodo formatado");não compilou
		
		LocalDate proximoCometa = aposentar.plusYears(50);
		System.out.println(proximoCometa.format(formatador));
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatador) + " agora");//Para aparecer a hora preciso alterar o formatador
		DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println(agora.format(formatadorHora) + " agora com hora");
		
		
		
		//Ainda existem muitas classes para datas. 
	}

}
