package apploja;

/*
.------------------.
| made by: < N / > |
'------------------'
*/

public class Venda {

    private Cliente cliente;
    private int codigo;

    public Venda(int codigo, Cliente cliente) {
        this.cliente = cliente;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public String toString() {
        return "Codigo: " + this.cliente.getCodigo() + 
                "\nNome: " + this.cliente.getNome() + 
                "\nCpf: " + this.cliente.getCpf()+
                "\nCódigo da venda: " + this.codigo;
    }
}
