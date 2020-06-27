package br.com.codenation.calculadora;


public class CalculadoraSalario {
	public double minimumWage = 1039.00;
	public long calcularSalarioLiquido(double salarioBase) {
		//Use o Math.round apenas no final do método para arredondar o valor final.
		//Documentação do método: https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#round-double-

		double newBasePay =  calcularInss(salarioBase);

		if (newBasePay < 3000.01){
			return Math.round(newBasePay);
		}
		if (newBasePay > 3000.00 && newBasePay < 6000.01){
			double irpf = newBasePay * 7.5/100;
			return Math.round(newBasePay - irpf);
		}
		double irpf = newBasePay * 15/100;
		return Math.round(newBasePay - irpf);
	}
	
	
	//Exemplo de método que pode ser criado para separar melhor as responsábilidades de seu algorítmo
	private double calcularInss(double salarioBase) {
		if (salarioBase < minimumWage){
			return 0.0;
		}
		if(salarioBase >= minimumWage && salarioBase< 1500.01){
			double inss = salarioBase * 8/100;
			return salarioBase-inss;
		}
		if(salarioBase > 1500.00 && salarioBase< 4000.01){
			double inss = salarioBase* 9/100;
			return salarioBase-inss;
		}
		double inss = salarioBase * 11/100;
		return salarioBase-inss;
	}

}
/*Dúvidas ou Problemas?
Manda e-mail para o meajuda@codenation.dev que iremos te ajudar! 
*/