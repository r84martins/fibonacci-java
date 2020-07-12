package entities;

public class fibonacci {
	
	private String result = "";
	private Integer aux;
	
	public fibonacci() {
	}

	public String getResult() {
		return result;
	}
			
	public void gerarSeqFibonacci(int lenght) {
		
		int x = 0;
		int y = 1;
		int z[] = new int[lenght];
					
		for(int i = 0; i <= lenght - 1; i++) {
			
			if(i == 0) {
				z[0] = 0;
			}
			else if (i == 1){
				z[1] = 1;
			}
			else {				
				z[i] = x + y;
				x = y;
				y = z[i];
			}
			aux = z[i];
			result = result + aux.toString() + ", " ;  			
		}	
		result =  result.substring(0, result.length() - 2);
	}	
}
