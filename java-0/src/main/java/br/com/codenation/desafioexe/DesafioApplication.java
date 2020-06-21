package br.com.codenation.desafioexe;

import java.util.List;
import java.util.ArrayList;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		List<Integer> fibonacciNumbers = new ArrayList<>();

		int currentNumber = 1;
		int lastNumber = 0;

        fibonacciNumbers.add(lastNumber);
        fibonacciNumbers.add(currentNumber);

        while(currentNumber < 350) {

            currentNumber = lastNumber + currentNumber;
            lastNumber = currentNumber - lastNumber;
			fibonacciNumbers.add(currentNumber);
			
        }
		return fibonacciNumbers;
	
	}



	public static Boolean isFibonacci(Integer a) {

		return fibonacci().contains(a);
	}

}