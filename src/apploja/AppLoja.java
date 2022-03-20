package apploja;

/*
.------------------.
| made by: < N / > |
'------------------'
*/

public class AppLoja {

    public static void main(String[] args) {

        //Cllientes
        Cliente cliente1 = new Cliente(1, "Elizabeth", "00045618954");
        
        //Vendas
        Venda venda1 = new Venda(1, cliente1);
    }

}

