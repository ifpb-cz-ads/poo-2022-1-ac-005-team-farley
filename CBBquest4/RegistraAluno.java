package CBBquest4;

public class RegistraAluno {
    private String nome;
    private String endereco;
    private int idade;
    private double notaMatematica;
    private double notaPortugues;
    private double notaGeografia;

    private static int contadorEstudante;
    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }
    public void setNotaPortugues(double notaPortugues) {
        this.notaPortugues = notaPortugues;
    }
    public void setNotaGeografia(double notaGeografia) {
        this.notaGeografia = notaGeografia;
    }
    public double getMedia(){
        double resultado = 0;
        resultado = (notaMatematica+notaPortugues+notaGeografia)/3;
        return resultado;
    }
    public static int getQuantidadeAlunos(){
        return contadorEstudante;
    }
}
