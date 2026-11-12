import java.io.Serializable;

public class Pessoa implements Serializable {
    // Atributos privados
    private String nome;
    private String sexo;
    private int idade;
    private float altura;

    // Métodos Getter e Setter para 'nome'
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos Getter e Setter para 'idade'
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Métodos Getter e Setter para 'altura'
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    // Métodos Getter e Setter para 'sexo'
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}

