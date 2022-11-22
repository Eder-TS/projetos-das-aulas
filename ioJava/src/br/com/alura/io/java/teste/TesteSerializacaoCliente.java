package br.com.alura.io.java.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Cliente cliente = new Cliente();
		cliente.setCpf("78954321");
		cliente.setNome("Jacó");
		cliente.setProfissao("abanador");
		
		//serialiação
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		oos.writeObject(cliente);
		oos.close();

		//desserialização
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente jaco = (Cliente) ois.readObject();
		ois.close();
		System.out.println(jaco.getNome());
		System.out.println(jaco.getCpf());
		System.out.println(jaco.getProfissao());
		
		//O UID de serialização é o meio que o Java usa para marcar os objetos criados e depois 
		//conferir na desserialização para verificar se o objeto o mesmo da classe.
		//Pode auxiliar no versionamento, quando se altera a classe de forma significativa o UID
		//também deve mudar.
		
		
	}

}
