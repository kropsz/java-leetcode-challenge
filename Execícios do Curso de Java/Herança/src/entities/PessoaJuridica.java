package entities;

public class PessoaJuridica extends Pessoa{
    private int numFuncionarios;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, Double rendaMensal, int numFuncionarios ) {
        super(nome, rendaMensal);
        this.numFuncionarios = numFuncionarios;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    @Override
    public Double calculaImposto(){
        return numFuncionarios > 10 ? getRendaMensal() * 0.14 : getRendaMensal() * 0.16;

    }
    
}
