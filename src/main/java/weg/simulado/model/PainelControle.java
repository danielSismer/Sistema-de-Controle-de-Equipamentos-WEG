package weg.simulado.model;

public class PainelControle extends Equipamento {

    private String tensao;

    public PainelControle(String codigo, String nome, int quantidade, double preco, String tensao) {
        super(codigo, nome, quantidade, preco);
        this.tensao = tensao;
    }

    public PainelControle() {

        super();
        this.tensao = null;
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

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTensão: " + tensao;
    }
}
