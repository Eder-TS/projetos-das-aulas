package bytebankherdado;
//contrato Autenticavel
	//quem assina esse contrato precisa implementar:
		//método setSenha
		//método autenticaSenha
public abstract interface Autenticavel {

	public abstract boolean autenticaSenha(int senha);

	public abstract void setSenha(int senha);
}
