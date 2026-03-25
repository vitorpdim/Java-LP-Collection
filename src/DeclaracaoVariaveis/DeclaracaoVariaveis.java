/* Crie a classe DeclaracaoVariaveis.java e dentro do método main declare, inicialize e
utilize as variáveis como definido abaixo:
	- Declare uma variável do tipo String para armazenar o nome de uma pessoa;
	- Declare uma variável do tipo String para armazenar a data de nascimento de uma pessoa;
	- Declare uma variável do tipo String para armazenar o rg de uma pessoa;
	- Declare uma variável do tipo String para armazenar o sexo da pessoa utilizando a seguinte regra: MASCULINO (M) e FEMININO (F)
	- Declare uma variável do tipo double para armazenar o salário da pessoa;
	- Imprima todos os valores de maneira a obter a seguinte saída:

O Senhor(a) <nome da pessoa> portador(a) do RG número <rg>, nascido em <data nascimento>,
do sexo <sexo>, está registrado com o salário de R$ <salario>

 */
 
  public class DeclaracaoVariaveis{
	public static void main (String[] args){
		
		String nome = "Vitor";
		String idade = "18/08/2006";
		String rg = "559.997.999-9";
		String sexo = "MASCULINO (M)";
		
		double salario = 99999999999.999;
	
	System.out.printf("O Senhor(a) %s portador(a) do RG numero %s, nascido em %s, do sexo %s, esta registrado com o salario de R$ %f", nome, rg, idade, sexo, salario);
	}
 
  
}
