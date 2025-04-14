public class Livro extends Obra{
    
    public enum GeneroLiterario { ROMANCE, TERROR, FICCAO, FANTASIA, DISTOPIA, HISTORICO};
    
    private int numPaginas;
    private GeneroLiterario generoLiterario;

    public Livro(String titulo, String autor, int anoPublicacao, int numPaginas, GeneroLiterario generoLiterario){
        super(titulo, autor, anoPublicacao);
        if(numPaginas > 10){
            this.numPaginas = numPaginas;
            this.generoLiterario = generoLiterario;
        }
    }

    public int getNumPaginas(){
        return numPaginas;

    }

    public GeneroLiterario getGeneroLiterario(){
        return generoLiterario;
    }

    @Override
    public String toString(){
        return super.toString() + "; Número de Paginas: " + getNumPaginas() + "; Gênero Literario: " + getGeneroLiterario();
    }
}