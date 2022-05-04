package Metodo_Instancia;

public class MetodoInstancia {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.primeiroNome = "Filipe";
        cliente.ultimoNome = "vaz";
        cliente.telefone= "27 99999-9999";
        cliente.email = "filipe@filipe.com";

        Cliente cliente2 = new Cliente();
        cliente2.primeiroNome = "João";
        cliente2.ultimoNome = "Silva";
        cliente2.telefone = "27 99999-9999";
        cliente2.email = "joao@joao.com";

        System.out.println("Nome Completo do cliente é: " + cliente.obterNomeCompleto() + ", DDD:" + cliente.obterDDD());
        System.out.println("Nome Completo do cliente é: " + cliente2.obterNomeCompleto() + ", DDD:" + cliente2.obterDDD());
    }
}