package generics;

import java.util.List;

public class ListaUtil {

	public static Object getUtltimo1(List<?> lista) {
		return lista.get(lista.size() - 1);
	}

	public static <T> T getUtltimo2(List<T> lista) {
		return lista.get(lista.size() - 1);
	}
}
