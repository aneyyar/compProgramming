package algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class UVA11292 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("input.txt");
		Scanner s = new Scanner(file);
		// TODO Auto-generated method stub
		int gold = 0;
		int d = 0;
		int k = 0; 
		int n = s.nextInt();
		int m = s.nextInt();
		int[] dr = new int[n];
		int[] kn = new int[m];
		for(int i = 0; i < n;i++) {
			dr[i] = s.nextInt();
			
		}
		for(int i = 0; i < m; i ++) {
			kn[i] = s.nextInt();
			
		}
		Arrays.sort(dr);
		Arrays.sort(kn);
		while(d <n&& k<m) {
			
			while(dr[d]>kn[k]&&k<m)k++;
			if(k == m) {
				break;
			}
			gold += kn[k];
			d++;
			k++;
			
			
			
		}
		if(d==n) {
			System.out.println(gold);
		}
		else {
			System.out.println("Lootwater is doomed");
		}
		
	}

}
