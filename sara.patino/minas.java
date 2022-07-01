import java.util.Scanner;
class Pacman{	
	


	public static void main(String[] args){
		int turno=0;
        
        
		int[][] unMapa = {
            {0, 1,  2,  3,  4,  5,  6,  7},
            {1, 8,  8,  8,  8,  8,  8,  8},
            {2, 8,  8,  8,  8,  8,  8,  8},
            {3, 8,  8,  8,  8,  8,  8,  8},
            {4, 8,  8,  8,  8,  8,  8,  8},
            {5, 8,  8,  8,  8,  8,  8,  8}
        };


            
		do {
        
			imprimeMapa(unMapa);
		

		} while ((procesaMovimiento(unMapa)));
	}

	private static void limpiaPantalla() {
		System.out.print("\033[H\033[2J");
        System.out.flush();
	}

	private static boolean procesaMovimiento(int[][] elMapa){
		Scanner entrada = new Scanner(System.in);
		String inputUsuario;
		
		inputUsuario = entrada.nextLine();
        
		
    
		   if (inputUsuario.equals("f")) {
			        return false;
		}

       return true;
	}

    private static void imprimeMapa(int[][] mapaPorImprimir){
		limpiaPantalla();

		imprimeBordeHorizontal(mapaPorImprimir[0].length);
		
		for (int i=0; i<mapaPorImprimir.length; i=i+1){
			imprimeBordeVertical(false);
			for (int j=0; j<mapaPorImprimir[i].length; j=j+1) {
					imprimeElemento(mapaPorImprimir[i][j]);
				 
			}
			

        
			imprimeBordeVertical(true);
		}		
		imprimeBordeHorizontal(mapaPorImprimir[0].length);
		


	}




	private static void imprimeBordeHorizontal(int laLongitud){
		System.out.print("+");
		for (int j=0;j<laLongitud;j=j+1){
			System.out.print("---");
		}
		System.out.println("+");		
	}
	private static void imprimeBordeVertical(boolean bordeDerecho){
		System.out.print("|");
		if (bordeDerecho) {System.out.println();}
	}
	
	


	private static void imprimeElemento(int elementoDelMapa) {
		String[] matrizDeElementos = {"   "," 1 "," 2 "," 3 "," 4 "," 5 "," 6 "," 7 "," - "};
		System.out.print(matrizDeElementos[elementoDelMapa]);
	}

}