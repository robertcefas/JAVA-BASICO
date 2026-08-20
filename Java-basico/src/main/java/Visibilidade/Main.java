package Visibilidade;

public class Main {
    static void main() {
//        String nome = "Robert";
//        int idade = 22

//        Clientes cliente1 = new Clientes();
//        cliente1.nome ="Robert";
//        cliente1.idade=(22)

//        Clientes cliente1 =new Clientes();
//
//        cliente1.nome="Robert";
//        cliente1.idade= 22;

        Clientes cliente1 = new Clientes();
        System.out.println("CLIENTES");
        cliente1.setNome("\nMarta");
        cliente1.setIdade(25);

        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());
        System.out.println("====================================================");


        //Funcionarios

        Funcionario funcionario1 = new Funcionario("Robert",22,"robert@email.com");
//        funcionario1.setNome("Robert");
//        funcionario1.setIdade(22);
//        funcionario1.setEmail("robert@email.com");

        System.out.println("FÚNCIONARIOS: ");
        System.out.println("\nNome: " + funcionario1.getNome());
        System.out.println("Idade: " + funcionario1.getIdade());
        System.out.println("E-mail: " + funcionario1.getEmail());
        System.out.println("====================================================");


        //Produtos
        Produtos produtos1= new Produtos("Salgadinho",1,2.5);

//        produtos1.setNomeproduto("Salgadinho");
//        produtos1.setPreco(2.5);
//        produtos1.setQuantidade(1);

        System.out.println("PRODUTO");
        System.out.println("\nNome do Produto: " + produtos1.getNomeproduto());
        System.out.println("Preço: R$" + produtos1.getPreco());
        System.out.println("Quantidade: " + produtos1.getQuantidade());


    }
}
