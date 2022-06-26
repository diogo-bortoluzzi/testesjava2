package calculadora_imc.calculadora_imc;

public class CalculadoraImc {
	
	public String calcularImc(double peso, double altura, int idade, String sexo) {
		
		double imc = peso / (altura * altura);
		
		//Verificação idoso
		if(idade > 65) {
			if(sexo == "feminino") {
				if(imc <= 21.9) {
					return "Baixo peso";
				}
				
				if(imc <= 27) {
					return "Peso normal";
				}
				
				if(imc <= 32) {
					return "Sobrepeso";
				}
				
				if(imc <= 37) {
					return "Obesidade grau 1";
				}
				
				if(imc <= 41.9) {
					return "Obesidade grau 2";
				}
				
				if(imc > 41.9) {
					return "Obesidade grau 3";
				}
				
				return "Fora da faixa";
			}
			
			if(sexo == "masculino") {
				
				if(imc <= 21.9) {
					return "Baixo peso";
				}
				
				if(imc <= 27) {
					return "Peso normal";
				}
				
				if(imc <= 30) {
					return "Sobrepeso";
				}
				
				if(imc <= 35) {
					return "Obesidade grau 1";
				}
				
				if(imc <= 39.9) {
					return "Obesidade grau 2";
				}
				
				if(imc > 39.9) {
					return "Obesidade grau 3";
				}
				
				return "Fora da faixa";
			}	
		}
		
		//Verificação adulto
		else if (idade >= 20 && idade <= 65){
			if(imc < 16) {
				return "Baixo peso muito grave";
			} 
			
			if(imc <= 16.99) {
				return "Baixo peso grave";
			} 
			
			if(imc <= 18.49) {
				return "Baixo peso";
			}
			
			if(imc <= 24.99) {
				return "Peso normal";
			}
			
			if(imc <= 29.99) {
				return "Sobrepeso";
			}
			
			if(imc <= 34.99) {
				return "Obesidade grau 1";
			}
			
			if(imc <= 39.99) {
				return "Obesidade grau 2";
			}
			
			if(imc > 39.99) {
				return "Obesidade grau 3";
			}
			
			return "Fora da faixa";
		}
		
		//Verificação crianças e adolescentes
		else {
			if(sexo == "feminino") {
				
				if(idade == 2) {
				
					if(imc > 14.2 && imc < 16) {
						return "Baixo peso";
					}
					
					if(imc >= 16 && imc < 18) {
						return "Peso normal";
					}
					
					if(imc >= 18 && imc < 19) {
						return "Sobrepeso";
					}
					
					if(imc >= 19) {
						return "Obesidade";
					}
				}
				
				if(idade == 4) {
					
					if(imc < 14) {
						return "Baixo peso";
					}
					
					if(imc > 14 && imc <= 16.9) {
						return "Peso normal";
					}
					
					if(imc > 16.9 && imc < 18) {
						return "Sobrepeso";
					}
					
					if(imc >= 18) {
						return "Obesidade";
					}
				}
				
				if(idade == 6) {
					
					if(imc < 14.9) {
						return "Baixo peso";
					}
					
					if(imc >= 14.9 && imc <= 17) {
						return "Peso normal";
					}
					
					if(imc > 17 && imc <= 18.8) {
						return "Sobrepeso";
					}
					
					if(imc > 18.8) {
						return "Obesidade";
					}
				}
				
				if(idade == 8) {
					
					if(imc < 14) {
						return "Baixo peso";
					}
					
					if(imc >= 14 && imc <= 18.2) {
						return "Peso normal";
					}
					
					if(imc > 18.2 && imc <= 20.6) {
						return "Sobrepeso";
					}
					
					if(imc > 20.6) {
						return "Obesidade";
					}
				}
				
				if(idade == 10) {
					
					if(imc < 14.5) {
						return "Baixo peso";
					}
					
					if(imc >= 14.5 && imc <= 20) {
						return "Peso normal";
					}
					
					if(imc > 20 && imc <= 23) {
						return "Sobrepeso";
					}
					
					if(imc > 23) {
						return "Obesidade";
					}
				}
				
				if(idade == 12) {
					
					if(imc < 16.4) {
						return "Baixo peso";
					}
					
					if(imc >= 16.4 && imc <= 21.7) {
						return "Peso normal";
					}
					
					if(imc > 21.7 && imc <= 25) {
						return "Sobrepeso";
					}
					
					if(imc > 25) {
						return "Obesidade";
					}
				}
				
				if(idade == 14) {
		
					if(imc < 16.3) {
						return "Baixo peso";
					}
					
					if(imc >= 16.3 && imc <= 23.1) {
						return "Peso normal";
					}
					
					if(imc > 23.1 && imc <= 27.1) {
						return "Sobrepeso";
					}
					
					if(imc > 27.1) {
						return "Obesidade";
					}
				}
				
				if(idade == 16) {
					
					if(imc < 17.3) {
						return "Baixo peso";
					}
					
					if(imc >= 17.3 && imc <= 24.6) {
						return "Peso normal";
					}
					
					if(imc > 24.6 && imc <= 28.9) {
						return "Sobrepeso";
					}
					
					if(imc > 28.9) {
						return "Obesidade";
					}
				}
				
				if(idade == 18) {
					
					if(imc < 18.1) {
						return "Baixo peso";
					}
					
					if(imc >= 18.1 && imc <= 25.7) {
						return "Peso normal";
					}
					
					if(imc > 25.7 && imc <= 30.1) {
						return "Sobrepeso";
					}
					
					if(imc > 30.1) {
						return "Obesidade";
					}
				}
				
			}
			if(sexo == "masculino") {
				
				if(idade == 2) {
					
					if(imc < 15) {
						return "Baixo peso";
					}
					
					if(imc >= 15 && imc <= 18) {
						return "Peso normal";
					}
					
					if(imc > 18 && imc <= 19.1) {
						return "Sobrepeso";
					}
					
					if(imc > 19.1) {
						return "Obesidade";
					}
				}
				
				if(idade == 4) {
					
					if(imc < 14.2) {
						return "Baixo peso";
					}
					
					if(imc >= 14.2 && imc <= 16.98) {
						return "Peso normal";
					}
					
					if(imc > 16.98 && imc <= 17.9) {
						return "Sobrepeso";
					}
					
					if(imc > 17.9) {
						return "Obesidade";
					}
				}
				
				if(idade == 6) {
					
					if(imc < 14) {
						return "Baixo peso";
					}
					
					if(imc >= 14 && imc <= 17) {
						return "Peso normal";
					}
					
					if(imc > 17 && imc <= 18.2) {
						return "Sobrepeso";
					}
					
					if(imc > 18.2) {
						return "Obesidade";
					}
				}
				
				if(idade == 8) {
					
					if(imc < 14.1) {
						return "Baixo peso";
					}
					
					if(imc >= 14.1 && imc <= 17.95) {
						return "Peso normal";
					}
					
					if(imc > 17.95 && imc <= 20) {
						return "Sobrepeso";
					}
					
					if(imc > 20) {
						return "Obesidade";
					}
				}
				
				if(idade == 10) {
					
					if(imc < 14.6) {
						return "Baixo peso";
					}
					
					if(imc >= 14.6 && imc <= 19.3) {
						return "Peso normal";
					}
					
					if(imc > 19.3 && imc <= 22) {
						return "Sobrepeso";
					}
					
					if(imc > 22) {
						return "Obesidade";
					}
				}
				
				if(idade == 12) {
					
					if(imc < 15.4) {
						return "Baixo peso";
					}
					
					if(imc >= 15.4 && imc <= 21) {
						return "Peso normal";
					}
					
					if(imc > 21 && imc <= 24) {
						return "Sobrepeso";
					}
					
					if(imc > 24) {
						return "Obesidade";
					}
				}
				
				if(idade == 14) {
					
					if(imc < 16.5) {
						return "Baixo peso";
					}
					
					if(imc >= 16.5 && imc <= 22.7) {
						return "Peso normal";
					}
					
					if(imc > 22.7 && imc <= 26) {
						return "Sobrepeso";
					}
					
					if(imc > 26) {
						return "Obesidade";
					}
				}
				
				if(idade == 16) {
					
					if(imc < 17.8) {
						return "Baixo peso";
					}
					
					if(imc >= 17.8 && imc <= 24.1) {
						return "Peso normal";
					}
					
					if(imc > 24.1 && imc <= 27.5) {
						return "Sobrepeso";
					}
					
					if(imc > 27.5) {
						return "Obesidade";
					}
				}
				
				if(idade == 18) {
					
					if(imc < 18.9) {
						return "Baixo peso";
					}
					
					if(imc >= 18.9 && imc <= 25.6) {
						return "Peso normal";
					}
					
					if(imc > 25.6 && imc <= 28.9) {
						return "Sobrepeso";
					}
					
					if(imc > 28.9) {
						return "Obesidade";
					}
				}
			}
			
			
			return "nao foi possivel classificar";
		}
		return "nao foi possivel classificar";
	}	
}
