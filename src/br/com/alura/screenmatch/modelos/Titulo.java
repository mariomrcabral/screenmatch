package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    ///Getters
    public String getNome() {
        return nome;
    }
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    ///Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){ //VOID = Método
        System.out.println("Nomde do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos + " minutos");
        if (incluidoNoPlano == true)
            System.out.println("Incluido no plano");
        else
            System.out.println("Não ncluido no plano");
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
