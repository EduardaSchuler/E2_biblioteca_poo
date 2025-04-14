import java.util.Scanner;

public class TerminalConsulta{
    private Biblioteca biblioteca;

    public TerminalConsulta(){
        biblioteca = new Biblioteca();
    }

    public void novaRevista(){

    }

    public void saida(){
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.println("Digite o nome do autor que deseja encontrar: (0=sair)");
            String autorPesquisa = in.nextLine();
            if(autorPesquisa.equals("0")){
                break;
            }
            Obra obra = biblioteca.buscaPorAutor(autorPesquisa);
            if(obra == null){
                System.out.println("Não foi encontrada nenhuma obra para este autor!");
            } else {
                System.out.println(obra.toString());
            }
            System.out.println("---------------------------------------");
            System.out.println("listagem de obras cadatradas: \n" + biblioteca.ListaTodasObras());
            System.out.println("---------------------------------------");
        }
    }
}
