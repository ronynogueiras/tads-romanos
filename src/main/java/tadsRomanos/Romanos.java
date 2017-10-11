package tadsRomanos;

public class Romanos {
	/**
	 * Realiza a conversão de um número informado em algarismos romanos para um número inteiro
	 * @param numero
	 * @return
	 */
	public int romanoParaInteiro(String numero){
        int numeroNaoRomano = 0;
        if (!numero.contains("MMMMM") && !numero.equalsIgnoreCase("")){
	        for(int i =0;i< numero.length();i++){
	        	String numeroRomano =  Character.toString(numero.charAt(i));
	        	if(numeroRomano.equals("I")){
	        		numeroNaoRomano += 1;
	        	} else if (numeroRomano.equalsIgnoreCase("V")){
	        		numeroNaoRomano += 5;
	        	} else if (numeroRomano.equalsIgnoreCase("X")){
	        		numeroNaoRomano += 10;
	        	} else if (numeroRomano.equalsIgnoreCase("L")){
	        		numeroNaoRomano += 50;
	        	} else if (numeroRomano.equalsIgnoreCase("C")){
	        		numeroNaoRomano += 100;
	        	} else if (numeroRomano.equalsIgnoreCase("D")){
	        		numeroNaoRomano += 500;
	        	} else if (numeroRomano.equalsIgnoreCase("M")){
	        		numeroNaoRomano += 1000;
	        	} else {
	        		numeroNaoRomano += 0;
	        	}
	        }
        }
        return numeroNaoRomano;
    }
}
