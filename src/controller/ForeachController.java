package controller;

public class ForeachController {

	public ForeachController() {
		super();
	}

	public void parImpar(int arr[]) {
		int i=0;
		
		for(int value : arr) {
			if(value % 2 != 0) {
				System.out.println("O valor " + value + " da " + (i+1) +  "º posição é IMPAR");
			} else {
				if(value % 10 == 0) {
					System.out.println("O valor " + value + " da " + (i+1) +  "º posição é PAR e MULTIPLO de 10");
				}
			}
			
			i++;
		}
	}
	
}
