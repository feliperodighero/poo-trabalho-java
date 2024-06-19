package model;

import java.io.Serializable;

public class Funcionario extends Pessoa implements Serializable {

    String registro;
    float salario;

    public Funcionario(String nome, int idade, String endereco, char sexo, float altura, String telefone, String registro, float salario) {
        super(nome, idade, endereco, sexo, altura, telefone);
        this.registro = registro;
        this.salario = salario;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
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
