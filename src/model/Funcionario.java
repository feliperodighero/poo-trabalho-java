package model;

public class Funcionario extends Pessoa {

    private String registro;
    private float salario;

    public Funcionario(String nome, int idade, String endereco, char sexo, float altura, String telefone) {
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
