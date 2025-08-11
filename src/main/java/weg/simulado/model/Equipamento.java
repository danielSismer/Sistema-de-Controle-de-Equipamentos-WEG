package weg.simulado.model;

public class Equipamento {

    protected String codigo;
    protected String nome;
    protected int quantidade;
    protected double preco;

    public Equipamento (String codigo, String nome, int quantidade, double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Equipamento (){
        this.codigo = null;
        this.nome = null;
        this.preco = 0;
        this.quantidade = 0;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String toString(){
        return "Nome: "  + nome + "\nCódigo: " + codigo + "\nQuantidade: " + quantidade + "\nPreço: " + preco;
    }
}
