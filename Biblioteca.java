import java.util.ArrayList;

public class Biblioteca{
    private ArrayList<Obra> obras;

    public Biblioteca(){
        obras = new ArrayList<Obra>();
        carregaObras();
    }

    public void carregaObras(){
        obras.add(new Revista("1252", Revista.Periodicidade.SEMANAL, "PUCRS - semana", "Joana Darc", 2023));
        obras.add(new Revista("1263", Revista.Periodicidade.MENSAL, "PUCRS - mês", "Carlos", 2022));
        obras.add(new Livro("A ultima parada", "casey mcquiston", 2021, 360, Livro.GeneroLiterario.FICCAO));
        obras.add(new Livro("A Hipotese do Amor", "Ali Hazelwood", 2019, 420, Livro.GeneroLiterario.ROMANCE));
        obras.add(new MateriaisEspeciais("Manual gestao das Órteses", "Joao Gabriel", 2014, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc rutrum enim nunc, eget condimentum quam laoreet vel."));
        obras.add(new MateriaisEspeciais("Algoritmos em java", "Goodrich", 2004, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc rutrum enim nunc, eget condimentum quam laoreet vel."));
    }

    public String ListaTodasObras(){
        String saida = "";
        for (Obra obra:obras){
            saida += obra.toString() + "\n";
        }
        return saida;
    }

    public void cadastraNovaObra(Obra obra){
        obras.add(obra);
    }

    public Obra buscaPorAutor(String autor){
        for(Obra obra:obras){
            if (obra.getAutor().equals(autor)){
                return obra;
            }
        }
        return null;
    }

}
