package br.com.alura.principal;

import br.com.alura.screenmatch.calculos.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1972);
        //meuFilme.setNome("O poderoso chefão");
       //                                                                      meuFilme.setAnoDeLancamento(1972);
        meuFilme.setDuracaoEmMinutos(120);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());
        meuFilme.setIncluidoNoPlano(false);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2004);
       // lost.setNome("Lost");
        //lost.setAnoDeLancamento(2004);
        lost.exibeFichaTecnica();
        lost.setTemporadas(7);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodop(50);
        System.out.println("Duração para maratonar LOST: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);
        //outroFilme.setNome("Avatar");
        //outroFilme.setAnoDeLancamento(2010);
        outroFilme.setDuracaoEmMinutos(190);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme("Dogville", 2023);
        //filmeDoPaulo.setNome("Dogville");
        filmeDoPaulo.setDuracaoEmMinutos(200);
       // filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista de filmes " + listaDeFilmes.size());
        System.out.println("Primeiro Filme da lista " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do Filme " + listaDeFilmes.get(0).toString());


    }
}