package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> total = new LinkedHashMap<String, Integer>();
		
		System.out.print("Enter file full path: ");
		String strPath = sc.nextLine();
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				String nome = fields[0];
				Integer quantidadeVotos = Integer.parseInt(fields[1]);
				
				if(total.containsKey(nome)) {					
					Integer somatoriaVotos = total.get(nome);
					total.put(nome, quantidadeVotos + somatoriaVotos);
					
				} else {
					total.put(nome, quantidadeVotos);
					
				}				
				line = br.readLine();				
			}
			
			for(String key : total.keySet()) {
				System.out.println( key + " " + total.get(key));
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
