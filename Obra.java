public abstract class Obra {
    private static int codGerador = 0;
    private int codigo;
    private String titulo;
    private String autor;
    private int anoPublicacao;
    
    public Obra(String titulo, String autor, int anoPublicacao){
        if(!titulo.equals(null) && !autor.equals(null)){
            this.titulo = titulo;
            this.autor = autor;
            this.anoPublicacao = anoPublicacao;
            codGerador++;
            this.codigo = codGerador;
        }
    }
    
    public int getCodigo(){
        return codigo;        
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    @Override
    public String toString(){
        return "Código: " +getCodigo() + "; Titulo: " + getTitulo() + "; Autor: " + getAutor() + "; Ano de Publicacão: " + getAnoPublicacao();
    }
}
