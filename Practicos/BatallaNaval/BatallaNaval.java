public class BatallaNaval {
	public static void main(String[] args) {
		imprimirTablero(5);
	}

	public static void imprimirTablero(int tam){
		for (int i = 0; i < tam; i++){
			for (int j = 0; j < tam ; i++ ) {
				if (j == (tam-1)) {
					System.out.println("O");
				} else {
					System.out.print("O ");
				}
			}
		}
	}
}