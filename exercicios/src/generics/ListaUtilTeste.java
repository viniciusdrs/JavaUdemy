package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {
		List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

		String ultimaLinguagem1 = (String) ListaUtil.getUtltimo1(langs);
		System.out.println(ultimaLinguagem1);

		Integer ultimoNumero1 = (Integer) ListaUtil.getUtltimo1(nums);
		System.out.println(ultimoNumero1);

		String ultimaLinguage2 = ListaUtil.getUtltimo2(langs);
		System.out.println(ultimaLinguage2);

		Integer ultimoNumer2 = ListaUtil.<Integer>getUtltimo2(nums);
		System.out.println(ultimoNumer2);
	}
}
