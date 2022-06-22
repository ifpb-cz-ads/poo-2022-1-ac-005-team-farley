public class BMMquest5 {
    private String nomeTime = new String();
    private int qtdJogadores;
    private int qtdReservas;
    private int vitorias;
    private int derrotas;

    public void setNomeTime(String nome){
        nomeTime = nome;
    }
    public String getNomeTime() {
        return nomeTime;
    }
    public void setQtdJogadores(int qtdJogadores) {
        this.qtdJogadores = qtdJogadores;
    }
    public int getQtdJogadores() {
        return qtdJogadores;
    }
    public void setQtdReservas(int qtdReservas) {
        this.qtdReservas = qtdReservas;
    }
    public int getQtdReservas() {
        return qtdReservas;
    }
    public void venceu() {
        this.vitorias++;
    }
    public void perdeu() {
        this.derrotas++;
    }
    public int getVitorias() {
        return vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
}
