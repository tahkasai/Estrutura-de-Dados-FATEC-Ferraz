public class App {
    public static void main(String[] args) throws Exception {
        int [][] matriz = new int[2][3]; //2 linhas e 3 colunas

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        // Criando e inicializando
        int [][] matriz_2 = {{7,8,9},{10,11,12}};

        // Percorrendo uma matriz
        for (int linha = 0; linha < matriz_2.length; linha++){
            for(int coluna = 0; coluna < matriz_2.length; coluna++){
                System.out.println(matriz[linha][coluna]);
            }
        }
    }
}
