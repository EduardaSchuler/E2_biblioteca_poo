public class MateriaisEspeciais extends Obra{
    private String descricao;

    public MateriaisEspeciais(String titulo, String autor, int anoPublicacao, String descricao) {
        super(titulo, autor, anoPublicacao);
        if(!descricao.equals(null)){
            this.descricao = descricao;
        }
    }
    
    public String getDescricao(){
        return descricao;
    }

    @Override
    public String toString(){
        return super.toString() + "; Descricão: " + getDescricao();
    }
}