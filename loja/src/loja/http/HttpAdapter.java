package loja.http;

import java.util.Map;

//Aplicando o pattern Adapter
public interface HttpAdapter {

	void post(String url, Map<String, Object> dados);
}
