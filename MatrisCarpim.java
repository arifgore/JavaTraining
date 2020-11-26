import java.util.*;
public class MatrisCarpim {

	public static void main(String[] args) {
		System.out.printf("İlk matris için: \n\n");
		int A[][] = CreateMatris();
		System.out.printf("İkinci matris için: \n\n");
		int B[][] = CreateMatris();
		if(A[0].length!=B.length) {
			System.out.println("Matrisler çarpılmak için uygun değil!!!");
			return;
		}
		
		int C[][] = carp(A,B);
		printMatris(C);
		return;

	}
	
	public static int[][] carp(int[][] A, int[][] B) {
		
		int sonuc[][] = new int [A.length][B[0].length];
			
		for(int i=0;i<A.length;i++) {
			for(int k=0;k<B[0].length;k++) {
				for(int j=0;j<B.length;j++) {
					sonuc[i][k] += A[i][j]*B[j][k];
				}
			}
		}
	
		return sonuc;
	}
	
	
	public static void printMatris(int list [][]) {
		for(int i=0;i<list.length;i++) {
			for(int j=0;j<list[0].length;j++) {
				System.out.printf("%d ",list[i][j]);
			}
			System.out.printf("\n");
		}
		return;
	}
	
	public static int [][] CreateMatris(){
		Scanner inp = new Scanner(System.in);
		
		System.out.printf("Satır sayısı giriniz; ");
		int satir = inp.nextInt();
		System.out.printf("\nSütun sayısı giriniz; ");
		int sutun = inp.nextInt();
		
		int matris [][] = new int[satir][sutun];
		
		for(int i=0;i<satir;i++) {
			for(int j=0;j<sutun;j++) {
				System.out.printf("\n%d:%d. elemanı girin; ",i,j);
				matris[i][j] = inp.nextInt();
			}
		}
		System.out.printf("\n");
		return matris;
		
		
	}

}
