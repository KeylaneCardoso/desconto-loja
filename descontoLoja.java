/* Desafio: PROMOÇÃO EM SITE DE COMPRAS ONLINE

O usuário digita o valor total da compra, e o progama mostra os novos valores a
serem pagos caso o cliente receba algum desconto;

Descontos:
- 10% caso o valor da compra seja igual ou superior a R$ 200,00;
- 35% para clientes fidelizados; 

OBS: Os descontos podem ser acumulativos.
*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);
		
		String entrada;
		double valorCompra;
		double resposta;
		double novoValor;
		double valorFidelizado;
		double valorFidelizado2;
		
		System.out.println("Bem-vindo a nossa loja!\n");
		System.out.print("Digite aqui o valor da sua compra: ");
		entrada = lerTeclado.next();
		valorCompra = Double.parseDouble(entrada.replace(',', '.'));
		
		do {
            System.out.print("\nVocê é um cliente fidelizado?(sim-1|não-2): ");
            resposta = lerTeclado.nextDouble();
            
		} while (resposta != 1 && resposta != 2);
		
		
		if (valorCompra >= 200){
            novoValor = valorCompra - (valorCompra * 0.10);
            if(resposta == 1){
                valorFidelizado = novoValor - (novoValor * 0.35);
                System.out.printf("\nO valor da compra foi: %.2f", valorFidelizado);
            } else if (resposta == 2){
                    System.out.printf("\nO valor da compra foi: %.2f", novoValor);    
                }
		}
		if (valorCompra < 200){
		    if(resposta == 1){
		        valorFidelizado2 = valorCompra - (valorCompra * 0.35);
		        System.out.printf("\nO valor da compra foi: %.2f", valorFidelizado2);
            } else if(resposta == 2){
                    System.out.printf("\nO valor da compra foi: %.2f", valorCompra);
                }
		}
	}
}