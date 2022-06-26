package calculadora_imc.calculadora_imc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class AppTest {
	
	static CalculadoraImc calc;
	
	
	@BeforeAll
	public static void setup() {
		calc = new CalculadoraImc();
	}
    
	//ADULTOS (20 A 65 ANOS)
	//Baixo peso muito grave
    @Test
    public void testBaixoPesoMuitoGraveAdultoMasculino20Anos() {
    	assertEquals("Baixo peso muito grave", calc.calcularImc(48.0,1.75,20,"masculino"));
    }
    @Test
    public void testPesoMuitoGraveAdultoMasculino65anos() {
    	assertEquals("Baixo peso muito grave", calc.calcularImc(48.0,1.75,65,"masculino"));
    }
    @Test
    public void testBaixoPesoMuitoGraveAdultoFeminino20Anos() {
    	assertEquals("Baixo peso muito grave", calc.calcularImc(48.0,1.75,20,"feminino"));
    }
    @Test
    public void testBaixoPesoMuitoGraveAdultoFeminino65anos() {
    	assertEquals("Baixo peso muito grave", calc.calcularImc(48.0,1.75,65,"feminino"));
    }
    
    
    
    
    
  //Baixo peso grave limite minimo
    @Test
    public void testBaixoPesoGraveLimiteMinimoAdultoMasculino20anos() {
    	assertEquals("Baixo peso grave", calc.calcularImc(49.0,1.75,20,"masculino"));
    }
    @Test
    public void testbaixoPesoGraveLimiteMinimoAdultoFeminino20anos() {
    	assertEquals("Baixo peso grave", calc.calcularImc(49.0,1.75,20,"feminino"));
    }
    @Test
    public void testBaixoPesoGraveLimiteMinimoAdultoMasculino65anos() {
    	assertEquals("Baixo peso grave", calc.calcularImc(49.0,1.75,65,"masculino"));
    }
    @Test
    public void testBaixoPesoGraveLimiteMinimoAdultoFeminino65anos() {
    	assertEquals("Baixo peso grave", calc.calcularImc(49.0,1.75,65,"feminino"));
    }
    
  //Baixo peso grave limite maximo
    @Test
    public void testBaixoPesoGraveLimiteMaximoAdultoMasculino20anos() {
    	assertEquals("Baixo peso grave", calc.calcularImc(52.0,1.75,20,"masculino"));
    }
    @Test
    public void testBaixoPesoGraveLimiteMaximoAdultoFeminino20anos() {
    	assertEquals("Baixo peso grave", calc.calcularImc(52.0,1.75,20,"feminino"));
    }
    @Test
    public void testBaixoPesoGraveLimiteMaximoAdultoMasculino65anos() {
    	assertEquals("Baixo peso grave", calc.calcularImc(52.0,1.75,65,"masculino"));
    }
    @Test
    public void testBaixoPesoGraveLimiteMaximoAdultoFeminino65anos() {
    	assertEquals("Baixo peso grave", calc.calcularImc(52.0,1.75,65,"feminino"));
    }
    
    
    
    
    
   //Baixo peso limite minimo
    @Test
    public void testBaixoPesoLimiteMinimoAdultoMasculino20anos() {
    	assertEquals("Baixo peso", calc.calcularImc(53.0,1.765,20,"masculino"));
    }
    @Test
    public void testBaixoPesoLimiteMinimoAdultoFeminino20anos() {
    	assertEquals("Baixo peso", calc.calcularImc(53.0,1.765,20,"feminino"));
    }
    @Test
    public void testBaixoPesoLimiteMinimoAdultoMasculino65anos() {
    	assertEquals("Baixo peso", calc.calcularImc(53.0,1.765,65,"masculino"));
    }
    @Test
    public void testBaixoPesoLimiteMinimoAdultoFeminino65anos() {
    	assertEquals("Baixo peso", calc.calcularImc(53.0,1.765,65,"feminino"));
    }
    
  //Baixo peso limite maximo
    @Test
    public void testBaixoPesoLimiteMaximoAdultoMasculino20anos() {
    	assertEquals("Baixo peso", calc.calcularImc(57.0,1.756,20,"masculino"));
    }
    @Test
    public void testBaixoPesoLimiteMaximoAdultoFeminino20anos() {
    	assertEquals("Baixo peso", calc.calcularImc(57.0,1.756,20,"feminino"));
    }
    @Test
    public void testBaixoPesoLimiteMaximoAdultoMasculino65anos() {
    	assertEquals("Baixo peso", calc.calcularImc(57.0,1.756,65,"masculino"));
    }
    @Test
    public void testBaixoPesoLimiteMaximoAdultoFeminino65anos() {
    	assertEquals("Baixo peso", calc.calcularImc(57.0,1.756,65,"feminino"));
    }
    
    
    
    
    
    //Peso normal limite minimo
    @Test
    public void testPesoNormalLimiteMinimoAdultoMasculino20anos() {
    	assertEquals("Peso normal", calc.calcularImc(57.0,1.755,20,"masculino"));
    }
    @Test
    public void testPesoNormalLimiteMinimoAdultoFeminino20anos() {
    	assertEquals("Peso normal", calc.calcularImc(57.0,1.755,20,"feminino"));
    }
    @Test
    public void testPesoNormalLimiteMinimoAdultoMasculino65anos() {
    	assertEquals("Peso normal", calc.calcularImc(57.0,1.755,65,"masculino"));
    }
    @Test
    public void testPesoNormalLimiteMinimoAdultoFeminino65anos() {
    	assertEquals("Peso normal", calc.calcularImc(57.0,1.755,65,"feminino"));
    }
    
  //Peso normal limite maximo
    @Test
    public void testPesoNormalLimiteMaximoAdultoMasculino20anos() {
    	assertEquals("Peso normal", calc.calcularImc(77.0,1.756,20,"masculino"));
    }
    @Test
    public void testPesoNormalLimiteMaximoAdultoFeminino20anos() {
    	assertEquals("Peso normal", calc.calcularImc(77.0,1.756,20,"feminino"));
    }
    @Test
    public void testPesoNormalLimiteMaximoAdultoMasculino65anos() {
    	assertEquals("Peso normal", calc.calcularImc(77.0,1.756,65,"masculino"));
    }
    @Test
    public void testPesoNormalLimiteMaximoAdultoFeminino65anos() {
    	assertEquals("Peso normal", calc.calcularImc(77.0,1.756,65,"feminino"));
    }
    
    
    

    
    //Sobrepeso limite minimo
    @Test
    public void testSobrepesoLimiteMinimoAdultoMasculino20anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(77.0,1.755,20,"masculino"));
    }
    @Test
    public void testSobrepesoLimiteMinimoAdultoFeminino20anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(77.0,1.755,20,"feminino"));
    }
    @Test
    public void testSobrepesoLimiteMinimoAdultoMasculino65anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(77.0,1.755,65,"masculino"));
    }
    @Test
    public void testSobrepesoLimiteMinimoAdultoFeminino65anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(77.0,1.755,65,"feminino"));
    }
    
    //Sobrepeso limite maximo
    @Test
    public void testSobrepesoLimiteMaximoAdultoMasculino20anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(92.0,1.752,20,"masculino"));
    }
    @Test
    public void testSobrepesoLimiteMaximoAdultoFeminino20anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(92.0,1.752,20,"feminino"));
    }
    @Test
    public void testSobrepesoLimiteMaximoAdultoMasculino65anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(92.0,1.752,65,"masculino"));
    }
    @Test
    public void testSobrepesoLimiteMaximoAdultoFeminino65anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(92.0,1.752,65,"feminino"));
    }
    
    
    
    
    
    //Obesidade grau 1 limite minimo
    @Test
    public void testObesidadeGrauUmLimiteMinimoAdultoMasculino20anos() {
    	assertEquals("Obesidade grau 1", calc.calcularImc(92.0,1.751,20,"masculino"));
    }
    @Test
    public void testObesidadeGrauUmLimiteMinimoAdultoFeminino20anos() {
    	assertEquals("Obesidade grau 1", calc.calcularImc(92.0,1.751,20,"feminino"));
    }
    @Test
    public void testObesidadeGrauUmLimiteMinimoAdultoMasculino65anos() {
    	assertEquals("Obesidade grau 1", calc.calcularImc(92.0,1.751,65,"masculino"));
    }
    @Test
    public void testObesidadeGrauUmLimiteMinimoAdultoFeminino65anos() {
    	assertEquals("Obesidade grau 1", calc.calcularImc(92.0,1.751,64,"feminino"));
    }
    
    //Obesidade grau 1 limite maximo
    @Test
    public void testObesidadeGrauUmLimiteMaximoAdultoMasculino20anos() {
    	assertEquals("Obesidade grau 1", calc.calcularImc(107.0,1.749,20,"masculino"));
    }
    @Test
    public void testObesidadeGrauUmLimiteMaximoAdultoFeminino20anos() {
    	assertEquals("Obesidade grau 1", calc.calcularImc(107.0,1.749,20,"feminino"));
    }
    @Test
    public void testObesidadeGrauUmLimiteMaximoAdultoMasculino65anos() {
    	assertEquals("Obesidade grau 1", calc.calcularImc(107.0,1.749,65,"masculino"));
    }
    @Test
    public void testObesidadeGrauUmLimiteMaximoAdultoFeminino65anos() {
    	assertEquals("Obesidade grau 1", calc.calcularImc(107.0,1.749,65,"feminino"));
    }
    
    
    
   
    
    //Obesidade grau 2 limite minimo
    @Test
    public void testObesidadeGrauDoisLimiteMinimoAdultoMasculino20anos() {
    	assertEquals("Obesidade grau 2", calc.calcularImc(107.0,1.748,20,"masculino"));
    }
    @Test
    public void testObesidadeGrauDoisLimiteMinimoAdultoFeminino20anos() {
    	assertEquals("Obesidade grau 2", calc.calcularImc(107.0,1.748,20,"feminino"));
    }
    @Test
    public void testObesidadeGrauDoisLimiteMinimoAdultoMasculino65anos() {
    	assertEquals("Obesidade grau 2", calc.calcularImc(107.0,1.748,65,"masculino"));
    }
    @Test
    public void testObesidadeGrauDoisLimiteMinimoAdultoFeminino65anos() {
    	assertEquals("Obesidade grau 2", calc.calcularImc(107.0,1.748,65,"feminino"));
    }
    
    //Obesidade grau 2 limite maximo
    @Test
    public void testObesidadeGrauDoisLimiteMaximoAdultoMasculino20anos() {
    	assertEquals("Obesidade grau 2", calc.calcularImc(122.0,1.747,20,"masculino"));
    }
    @Test
    public void testObesidadeGrauDoisLimiteMaximoAdultoFeminino20anos() {
    	assertEquals("Obesidade grau 2", calc.calcularImc(122.0,1.747,20,"feminino"));
    }
    @Test
    public void testObesidadeGrauDoisLimiteMaximoAdultoMasculino65anos() {
    	assertEquals("Obesidade grau 2", calc.calcularImc(122.0,1.747,65,"masculino"));
    }
    @Test
    public void testObesidadeGrauDoisLimiteMaximoAdultoFeminino65anos() {
    	assertEquals("Obesidade grau 2", calc.calcularImc(122.0,1.747,65,"feminino"));
    }
    
    
  //Obesidade grau 3
    @Test
    public void testObesidadeGrauTresAdultoMasculino20anos() {
    	assertEquals("Obesidade grau 3", calc.calcularImc(123.0,1.753,20,"masculino"));
    }
    @Test
    public void testObesidadeGrauTresAdultoFeminino20anos() {
    	assertEquals("Obesidade grau 3", calc.calcularImc(123.0,1.753,20,"feminino"));
    }
    @Test
    public void testObesidadeGrauTresAdultoMasculino65anos() {
    	assertEquals("Obesidade grau 3", calc.calcularImc(123.0,1.753,65,"masculino"));
    }
    @Test
    public void testObesidadeGrauTresAdultoFeminino65anos() {
    	assertEquals("Obesidade grau 3", calc.calcularImc(123.0,1.753,65,"feminino"));
    }
    
    
    
    
    
//MULHER IDOSA
    //Baixo peso = abaixo de 21,9 kg/m².
    @Test
    public void testBaixoPesoIdosa() {
    	assertEquals("Baixo peso", calc.calcularImc(67.0,1.75,66,"feminino"));
    }
    
    
    
    
    
	//Peso normal = entre 22 e 27 kg/m².
    //Peso normal limite minimo
    public void testPesoNormalLimiteMinimoIdosa() {
    	assertEquals("Peso normal", calc.calcularImc(67.0,1.745,66,"feminino"));
    }
    
    //Peso normal limite maximo
    public void testPesoNormalLimiteMaximoIdosa() {
    	assertEquals("Peso normal", calc.calcularImc(82.0,1.743,66,"feminino"));
    }
    
    
    
    
   
	//Sobrepeso = entre 27,1 e 32 kg/m².
    //Sobrepeso limite minimo
    public void testSobrepesolLimiteMinimoIdosa() {
    	assertEquals("Sobrepeso", calc.calcularImc(82.0,1.739,66,"feminino"));
    }
    //Sobrepeso limite maximo
    public void testSobrepesolLimiteMaximoIdosa() {
    	assertEquals("Sobrepeso", calc.calcularImc(88.0,1.659,66,"feminino"));
    }
    
    
    
    
    
	//Obesidade grau I =  entre 32,1 e 37 kg/m².
    //Obesidade grau I limite minimo
    public void testObesidadeGrauUmlLimiteMinimoIdosa() {
    	assertEquals("Obesidade grau 1", calc.calcularImc(95.0,1.72,66,"feminino"));
    }
    
    //Obesidade grau I limite maximo
    public void testObesidadeGrauUmlLimiteMaximoIdosa() {
    	assertEquals("Obesidade grau 1", calc.calcularImc(95.0,1.603,66,"feminino"));
    }
    
    
    
    
    
	//Obesidade grau II = entre 37,1 e 41,9 kg/m².
    //Obesidade grau II limite minimo
    public void testObesidadeGrauDoislLimiteMinimoIdosa() {
    	assertEquals("Obesidade grau 2", calc.calcularImc(95.0,1.60,66,"feminino"));
    }
    
    //Obesidade grau II limite maximo
    public void testObesidadeGrauDoislLimiteMaximoIdosa() {
    	assertEquals("Obesidade grau 2", calc.calcularImc(107.0,1.599,66,"feminino"));
    }
    
    
    
    
    
	//Obesidade grau III (obesidade mórbida) = maior que 42 kg/m².
    public void testObesidadeGrauTreslLimiteMinimoIdosa() {
    	assertEquals("Obesidade grau 3", calc.calcularImc(108.0,1.603,66,"feminino"));
    }
   
    
    
    
   
//HOMEM IDOSO
    //Baixo peso = abaixo de 21,9 kg/m².
    @Test
    public void testBaixoPesoIdoso() {
    	assertEquals("Baixo peso", calc.calcularImc(67.0,1.75,66,"masculino"));
    }
    
    
    
    
    
    //Peso normal =  entre 22 e 27 kg/m².
    //Peso normal limite minimo
    public void testPesoNormalLimiteMinimoIdoso() {
    	assertEquals("Peso normal", calc.calcularImc(67.0,1.745,66,"masculino"));
    }
    
    //Peso normal limite maximo
    public void testPesoNormalLimiteMaximoIdoso() {
    	assertEquals("Peso normal", calc.calcularImc(82.0,1.743,66,"masculino"));
    }
    
    
    
    
    
    //Sobrepeso = entre 27,1 e 30 kg/m².
    //Sobrepeso limite minimo
    public void testSobrepesolLimiteMinimoIdoso() {
    	assertEquals("Sobrepeso", calc.calcularImc(82.0,1.739,66,"masculino"));
    }
    //Sobrepeso limite maximo
    public void testSobrepesolLimiteMaximoIdoso() {
    	assertEquals("Sobrepeso", calc.calcularImc(88.0,1.72,66,"masculino"));
    }
    
    
    
    
    
    //Obesidade grau I = entre 30,1 e 35 kg/m².
    //Obesidade grau I limite minimo
    public void testObesidadeGrauUmlLimiteMinimoIdoso() {
    	assertEquals("Obesidade grau 1", calc.calcularImc(89.0,1.716,66,"masculino"));
    }
    //Obesidade grau I limite maximo
    public void testObesidadeGrauUmlLimiteMaximoIdoso() {
    	assertEquals("Obesidade grau 1", calc.calcularImc(109.0,1.765,66,"masculino"));
    }
    
    
    
    
    //Obesidade grau II = entre 35,1 e 39,9 kg/m².
    //Obesidade grau II limite minimo
    public void testObesidadeGrauDoislLimiteMinimoIdoso() {
    	assertEquals("Obesidade grau 2", calc.calcularImc(109.0,1.76,66,"masculino"));
    }
    
    //Obesidade grau II limite maximo
    public void testObesidadeGrauDoislLimiteMaximoIdoso() {
    	assertEquals("Obesidade grau 2", calc.calcularImc(123.0,1.759,66,"masculino"));
    }
    
    
    
    
    
    //Obesidade grau III (obesidade mórbida) = maior que 40 kg/m².
    public void testObesidadeGrauTreslLimiteMinimoIdoso() {
    	assertEquals("Obesidade grau 3", calc.calcularImc(116.0,1.703,66,"masculino"));
    }
    
   
    
    
    ///AULA 07/06
    
    
//CRIANÇAS
    
    //MENINOS
    //2 anos
    @Test
    public void testeBaixoPesoCriancaMenino2Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(12.0,0.9,2,"masculino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenino2Anos() {
    	assertEquals("Peso normal", calc.calcularImc(14.0,0.9,2,"masculino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenino2Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(15.0,0.9,2,"masculino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenino2Anos() {
    	assertEquals("Obesidade", calc.calcularImc(18.0,0.96,2,"masculino"));
    }
    
  //4 anos
    @Test
    public void testeBaixoPesoCriancaMenino4Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(15.0,1.03,4,"masculino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenino4Anos() {
    	assertEquals("Peso normal", calc.calcularImc(17.0,1.03,4,"masculino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenino4Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(19.0,1.04,4,"masculino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenino4Anos() {
    	assertEquals("Obesidade", calc.calcularImc(20.0,1.05,4,"masculino"));
    }
    
  //6 anos
    @Test
    public void testeBaixoPesoCriancaMenino6Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(16.0,1.07,6,"masculino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenino6Anos() {
    	assertEquals("Peso normal", calc.calcularImc(19.0,1.07,6,"masculino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenino6Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(21.0,1.08,6,"masculino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenino6Anos() {
    	assertEquals("Obesidade", calc.calcularImc(22.0,1.08,6,"masculino"));
    }
    
    //8 anos
    @Test
    public void testeBaixoPesoCriancaMenino8Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(20.0,1.20,8,"masculino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenino8Anos() {
    	assertEquals("Peso normal", calc.calcularImc(23.0,1.20,8,"masculino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenino8Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(28.0,1.21,8,"masculino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenino8Anos() {
    	assertEquals("Obesidade", calc.calcularImc(30.0,1.21,8,"masculino"));
    }
    
  //10 anos
    @Test
    public void testeBaixoPesoCriancaMenino10Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(24.0,1.299,10,"masculino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenino10Anos() {
    	assertEquals("Peso normal", calc.calcularImc(27.0,1.29,10,"masculino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenino10Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(34.0,1.29,10,"masculino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenino10Anos() {
    	assertEquals("Obesidade", calc.calcularImc(38.0,1.29,10,"masculino"));
    }
    
  //12 anos
    @Test
    public void testeBaixoPesoCriancaMenino12Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(29.0,1.38,12,"masculino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenino12Anos() {
    	assertEquals("Peso normal", calc.calcularImc(33.0,1.38,12,"masculino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenino12Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(42.0,1.38,12,"masculino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenino12Anos() {
    	assertEquals("Obesidade", calc.calcularImc(47.0,1.38,12,"masculino"));
    }
    
  //14 anos
    @Test
    public void testeBaixoPesoCriancaMenino14Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(37.0,1.51,14,"masculino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenino14Anos() {
    	assertEquals("Peso normal", calc.calcularImc(42.0,1.51,14,"masculino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenino14Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(54.0,1.50,14,"masculino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenino14Anos() {
    	assertEquals("Obesidade", calc.calcularImc(61.0,1.50,14,"masculino"));
    }
    
  //16 anos
    @Test
    public void testeBaixoPesoCriancaMenino16Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(45.0,1.62,16,"masculino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenino16Anos() {
    	assertEquals("Peso normal", calc.calcularImc(52.0,1.62,16,"masculino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenino16Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(65.0,1.62,16,"masculino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenino16Anos() {
    	assertEquals("Obesidade", calc.calcularImc(74.0,1.62,16,"masculino"));
    }
    
    //18 anos
    @Test
    public void testeBaixoPesoCriancaMenino18Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(53.0,1.7,18,"masculino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenino18Anos() {
    	assertEquals("Peso normal", calc.calcularImc(60.0,1.7,18,"masculino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenino18Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(78.0,1.7,18,"masculino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenino18Anos() {
    	assertEquals("Obesidade", calc.calcularImc(90.0,1.7,18,"masculino"));
    }
    
    
    
    
    
    
    //MENINAS
    //2 anos
    @Test
    public void testeBaixoPesoCriancaMenina2Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(12.0,0.9,2,"feminino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenina2Anos() {
    	assertEquals("Peso normal", calc.calcularImc(14.0,0.9,2,"feminino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenina2Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(15.0,0.9,2,"feminino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenina2Anos() {
    	assertEquals("Obesidade", calc.calcularImc(18.0,0.96,2,"feminino"));
    }
    
  //4 anos
    @Test
    public void testeBaixoPesoCriancaMenina4Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(14.0,1.03,4,"feminino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenina4Anos() {
    	assertEquals("Peso normal", calc.calcularImc(17.0,1.03,4,"feminino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenina4Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(19.0,1.04,4,"feminino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenina4Anos() {
    	assertEquals("Obesidade", calc.calcularImc(20.0,1.05,4,"feminino"));
    }
    
  //6 anos
    @Test
    public void testeBaixoPesoCriancaMenina6Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(16.0,1.07,6,"feminino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenina6Anos() {
    	assertEquals("Peso normal", calc.calcularImc(19.0,1.07,6,"feminino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenina6Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(21.0,1.08,6,"feminino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenina6Anos() {
    	assertEquals("Obesidade", calc.calcularImc(22.0,1.08,6,"feminino"));
    }
    
    //8 anos
    @Test
    public void testeBaixoPesoCriancaMenina8Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(20.0,1.20,8,"feminino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenina8Anos() {
    	assertEquals("Peso normal", calc.calcularImc(23.0,1.20,8,"feminino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenina8Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(28.0,1.21,8,"feminino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenina8Anos() {
    	assertEquals("Obesidade", calc.calcularImc(32.0,1.21,8,"feminino"));
    }
    
  //10 anos
    @Test
    public void testeBaixoPesoCriancaMenina10Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(24.0,1.299,10,"feminino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenina10Anos() {
    	assertEquals("Peso normal", calc.calcularImc(27.0,1.29,10,"feminino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenina10Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(34.0,1.29,10,"feminino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenina10Anos() {
    	assertEquals("Obesidade", calc.calcularImc(39.0,1.29,10,"feminino"));
    }
    
  //12 anos
    @Test
    public void testeBaixoPesoCriancaMenina12Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(29.0,1.38,12,"feminino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenina12Anos() {
    	assertEquals("Peso normal", calc.calcularImc(33.0,1.38,12,"feminino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenina12Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(42.0,1.38,12,"feminino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenina12Anos() {
    	assertEquals("Obesidade", calc.calcularImc(48.0,1.38,12,"feminino"));
    }
    
  //14 anos
    @Test
    public void testeBaixoPesoCriancaMenina14Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(37.0,1.51,14,"feminino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenina14Anos() {
    	assertEquals("Peso normal", calc.calcularImc(42.0,1.51,14,"feminino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenina14Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(54.0,1.50,14,"feminino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenina14Anos() {
    	assertEquals("Obesidade", calc.calcularImc(61.0,1.50,14,"feminino"));
    }
    
  //16 anos
    @Test
    public void testeBaixoPesoCriancaMenina16Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(45.0,1.62,16,"feminino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenina16Anos() {
    	assertEquals("Peso normal", calc.calcularImc(52.0,1.62,16,"feminino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenina16Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(65.0,1.62,16,"feminino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenina16Anos() {
    	assertEquals("Obesidade", calc.calcularImc(77.0,1.62,16,"feminino"));
    }
    
    //18 anos
    @Test
    public void testeBaixoPesoCriancaMenina18Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(50.0,1.7,18,"feminino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenina18Anos() {
    	assertEquals("Peso normal", calc.calcularImc(60.0,1.7,18,"feminino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenina18Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(78.0,1.7,18,"feminino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenina18Anos() {
    	assertEquals("Obesidade", calc.calcularImc(90.0,1.7,18,"feminino"));
    }
    
   
}
