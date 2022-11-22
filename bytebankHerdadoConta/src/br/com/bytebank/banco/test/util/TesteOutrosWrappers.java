package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		Integer idadeRef = Integer.valueOf(10);//boxing
		System.out.println(idadeRef.intValue());//unboxing
		
		Double doub = Double.valueOf(3.2);
		System.out.println(doub.doubleValue());
		
		Boolean bul = Boolean.valueOf(true);
		System.out.println(bul.booleanValue());
		//ou
		Boolean bool = Boolean.FALSE;//constantes são escrcitas com letra maiúscula
		System.out.println(bool.booleanValue());
		
		//Como todos são números (exceto boolean e char), herdam da classe Number então:
		Number refNumero = Double.valueOf(34.8);
		System.out.println(refNumero.doubleValue());
		
		Number refNumb = Float.valueOf(56.7f);
		System.out.println(refNumb.floatValue());
		
		List<Number> lista = new ArrayList<>();//posso fazer uma lista com qualquer tipo de número
		lista.add(refNumb);
		lista.add(refNumero);
		lista.add(idadeRef);
		lista.add(doub);
		lista.add(12);
		lista.add(0.8);
		
		

	}

}
