package model;

public class Estagiario extends Funcionario {

    private float bolsa;
    private float horasServico;

    public Estagiario(String nome, int idade, String endereco, char sexo, float altura, String telefone) {
        super(nome, idade, endereco, sexo, altura, telefone);
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    public float getHorasServico() {
        return horasServico;
    }

    public void setHorasServico(float horasServico) {
        this.horasServico = horasServico;
    }

}
