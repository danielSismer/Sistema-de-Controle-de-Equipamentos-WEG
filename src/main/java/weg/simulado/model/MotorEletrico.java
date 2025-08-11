package weg.simulado.model;

public class MotorEletrico extends Equipamento{

    private double potencia;

    public MotorEletrico(String codigo, String nome, int quantidade, double preco, double potencia){
        super(codigo, nome, quantidade, preco);
        this.potencia = potencia;
    }

    public MotorEletrico(){
        super();
        this.potencia = 0;
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }
    @Override
    public void setPreco(double preco) {
        super.setPreco(preco);
    }


    @Override
    public int getQuantidade() {
        return super.getQuantidade();
    }
    @Override
    public void setQuantidade(int quantidade) {
        super.setQuantidade(quantidade);
    }


    @Override
    public String getCodigo() {
        return super.getCodigo();
    }
    @Override
    public void setCodigo(String codigo) {
        super.setCodigo(codigo);
    }


    @Override
    public String getNome() {
        return super.getNome();
    }
    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }


    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPotência: " + potencia;
    }
}

