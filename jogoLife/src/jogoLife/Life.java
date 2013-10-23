/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoLife;

/**
 *
 * @author tamara
 */
public class Life {
    int MAX = 10;
    int [][] matriz = new int [MAX][MAX];

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }
    
    void inicializa(){
        int i, j;
        
        for (i = 1; i < MAX - 1; i++)
            for (j = 1; j < MAX - 1; j++)
                matriz [i][j] = (int)(Math.random()*1.5);
        
    }

    void imprimeTabuleiro(){
        int i, j;
        
        for (i = 1; i < MAX; i++){
            for (j = 1; j < MAX; j++){
                if (matriz[i][j]==1)
                    System.out.print("*");
                else
                    System.out.print(".");
            }
                System.out.println();
             
          }
          System.out.println();
       }
    
    int vizinhos(int i, int j){
        int a, b, c;
        a = matriz[i-1][j-1] + matriz[i-1][j] + matriz[i-1][j+1];
        b = matriz[i][j-1] + matriz[i][j+1];
        c = matriz[i+1][j-1] + matriz[i+1][j] + matriz[i+1][j+1];
        return a + b + c;
    }
    
    int [][] iteracao(){
        int [][] aux = new int [MAX][MAX];
        int i,j;
        
        for (i = 1; i < MAX-1; i++){
            for (j = 1; j < MAX-1; j++){
                if (matriz[i][j] == 1){
                    if ((vizinhos(i,j) < 2) || (vizinhos(i,j) > 3))
                        aux[i][j] = 0;
                    else
                        aux[i][j] = 1;
                }
                else {
                    if (vizinhos(i,j) == 3)
                        aux[i][j] = 1;
                    else
                        aux[i][j] = 0;
                }
            }
        }
        return aux;
    }
    
    void simulaVida(int quant){
        int i;
        
        for (i = 0; i < quant; i++){
            imprimeTabuleiro();
            matriz = iteracao();
        }
    }           
}
