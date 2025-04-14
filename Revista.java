public class Revista extends Obra{
    public enum Periodicidade { DIARIO, SEMANAL, MENSAL, TRIMESTRAL, ANUAL};

    private String issn;
    private Periodicidade periodicidade;
    
    public Revista (String issn, Periodicidade periodicidade, String titulo, String autor, int anoPublicacao){
        super(titulo, autor, anoPublicacao);
        if(!issn.equals(null) && !periodicidade.equals(null)){
            this.issn = issn;
            this.periodicidade = periodicidade;
        }
    }
    
    public String getIssn(){
        return issn;
    }
    
    public Periodicidade getPeriodicidade(){
        return periodicidade;
    }

    @Override
    public String toString(){
        return super.toString() + "; código ISSN: " + getIssn() + "; Periodicidade: " + getPeriodicidade();
    }
}
