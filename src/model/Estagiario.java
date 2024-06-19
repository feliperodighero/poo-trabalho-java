package model;

import java.io.Serializable;

public class Estagiario extends Funcionario implements Serializable {

    private float bolsa;
    private float horasServico;

    public Estagiario(float bolsa, float horasServico, String nome, int idade, String endereco, char sexo, float altura, String telefone, String registro, float salario) {
        super(nome, idade, endereco, sexo, altura, telefone, registro, salario);
        this.bolsa = bolsa;
        this.horasServico = horasServico;
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
    
    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", endereco='" + getEndereco() + '\'' +
                ", sexo=" + getSexo() +
                ", altura=" + getAltura() +
                ", telefone='" + getTelefone() + '\'' +
                ", registro='" + registro + '\'' +
                ", salario=" + salario +
                '}';
    }


}
