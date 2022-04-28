package br.com.dio;

import br.com.dio.model.Gato;

public class ProximeProgram {
    public static void main(String[] args) {
            Gato gato = new Gato();
        System.out.println(gato);

        Livro livro22 = new Livro("A cabana", 500);
        System.out.println(livro22);

    }
    }

    class Livro{
    private String nome;
    private Integer numPagina;

        public Livro(String nome, Integer numPagina) {
            this.nome = nome;
            this.numPagina = numPagina;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getNumPagina() {
            return numPagina;
        }

        public void setNumPagina(Integer numPagina) {
            this.numPagina = numPagina;
        }

        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", numPagina=" + numPagina +
                    '}';
        }
    }

