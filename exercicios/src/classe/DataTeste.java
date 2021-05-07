package classe;

public class DataTeste {

	public static void main(String[] args) {

		Data d1 = new Data(20, 10, 1965);

		// Data Padrão
		Data d2 = new Data();
		//d2.ano = 2025;

		String dataFormatada1 = d1.obterDataFormatada();

		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());

		d1.imprimirDataFormatada();
	}

}