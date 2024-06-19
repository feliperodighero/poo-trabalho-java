package model;

import java.io.Serializable;

public abstract class Pessoa implements Serializable {

    private String nome;
    private int idade;
    private String endereco;
    private char sexo;
    private float altura;
    private String telefone;

    public Pessoa(String nome, int idade, String endereco, char sexo, float altura, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.sexo = sexo;
        this.altura = altura;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
