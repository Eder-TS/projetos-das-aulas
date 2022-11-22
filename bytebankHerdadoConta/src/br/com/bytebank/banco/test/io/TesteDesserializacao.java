package br.com.bytebank.banco.test.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.bytebank.banco.modelo.Conta;

public class TesteDesserializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		Conta cc = (Conta) ois.readObject();
		ois.close();
		System.out.println("Nome: " + cc.getTitular().getNome());
		System.out.println("CPF: " + cc.getTitular().getCpf());
		System.out.println("Profissão: " + cc.getTitular().getProfissao());
		System.out.println("Saldo: " + cc.getSaldo());

	}

}
