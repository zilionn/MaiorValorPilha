package view;

import model.PilhaInt;

public class Principal {
	
	public static void main(String[] args) throws Exception {
		int num = 0;
		PilhaInt p = new PilhaInt();
		
		int[] vet = {14, 26, 38, 15, 5, 39, 11, 25, 22, 20, 17, 1};
		
		for(int i = 0 ; i < vet.length ; i ++) {
			p.push(vet[i]);
		}
		
		int maior = p.pop();
		
		while(!p.isEmpty()) {
			num = p.pop();
			if(num > maior) {
				maior = num;
			}
		}
		System.out.println(maior);
 

	}

}
