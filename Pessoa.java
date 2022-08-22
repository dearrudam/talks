import java.util.List;

class Pessoa {
    
    private final String nome;
    private final int idade;
    private final List<Pessoa> primos;


    public Pessoa(String nome, int idade, List<Pessoa> primos) {
        this.nome = nome;
        this.idade = idade;
        this.primos = primos;
    }


    public String getNome() {
        return nome;
    }


    public int getIdade() {
        return idade;
    }


    public List<Pessoa> getPrimos() {
        return primos;
    }


}
