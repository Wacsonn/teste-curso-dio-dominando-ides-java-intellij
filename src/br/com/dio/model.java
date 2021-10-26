package br.com.dio;public class model {
}

    Livro livro1 = new Livro( nome: "O problema dos 3 corpos", numpaginas: 300);
    System.out.println(livro1);

class Livro {

    private String nome;
    private integer numPaginas;

    public Livro(String nome, integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}