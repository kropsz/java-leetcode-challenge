package entities;

public class PessoaFisica extends Pessoa{
    private Double gastosComSaude;

    public PessoaFisica(String nome, Double rendaMensal, Double gastosComSaude){
        super(nome, rendaMensal);
        this.gastosComSaude = gastosComSaude;
    }

    public PessoaFisica() {
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public Double calculaImposto(){
        if (getRendaMensal() < 20000.00) {
            if ( gastosComSaude != 0.0) 
                return (getRendaMensal() * 0.15) - (gastosComSaude / 2);

            return getRendaMensal() * 0.15;
        }
        else{
            if ( gastosComSaude != 0.0) 
                return (getRendaMensal() * 0.25) - (gastosComSaude / 2);
            
            return getRendaMensal() * 0.25;

        }
    }
    
}
