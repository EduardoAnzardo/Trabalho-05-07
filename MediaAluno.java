import java.util.Scanner;

public class MediaAluno{

    Scanner media = new Scanner(System.in);

    float NotaTrabalho;
    float NotaProva;
    float Nota3;
    float MediaFinal;
    float PesoTrabalho;
    float PesoProva;
    float PesoNota3;
    String Disciplina = "Matematica";

    float Status(){
        System.out.println("Média do Aluno da matéria de: " +this.Disciplina);
        System.out.println("Nota do Trabalho: " +this.NotaTrabalho);
        System.out.println("Nota da Prova: " +this.NotaProva);
        System.out.println("Terceira Nota: " +this.Nota3);
        System.out.println("Média final: " +this.MediaFinal);
        System.out.println("=======");

      if (MediaFinal > 0){
        System.exit(0);
      }
      
    if (NotaTrabalho == 0){
      System.out.println("Deseja atualizar a primeira nota do aluno? Caso sim, digite 1, caso não, digite 2");
      int Alterar1 = media.nextInt();

      if (Alterar1 == 1){
        System.out.println("Digite a nova nota");
        float NovaNota1 = media.nextFloat();
        NotaTrabalho = NovaNota1;
      }
      else 
        if (Alterar1 == 2){
          System.out.println("A nota não foi alterada");
        }
    }
    if (NotaProva == 0){
      System.out.println("Deseja atualizar a segunda nota do aluno? Caso sim, digite 1, caso não, digite 2");
      int Alterar2 = media.nextInt();

      if (Alterar2 == 1){
        System.out.println("Digite a nova nota");
        float NovaNota2 = media.nextFloat();
        NotaProva = NovaNota2 ;
      }
      else 
        if (Alterar2 == 2){
          System.out.println("A nota não foi alterada");
        }
    }
    if (Nota3 == 0){
      System.out.println("Deseja atualizar a terceira nota do aluno? Caso sim, digite 1, caso não, digite 2");
      int Alterar3 = media.nextInt();

      if (Alterar3 == 1){
        System.out.println("Digite a nova nota");
        float NovaNota3 = media.nextFloat();
        Nota3 = NovaNota3;
      }
      else 
        if (Alterar3 == 2){
          System.out.println("A nota não foi alterada");
        }
    }

    System.out.println("Informe o peso de cada nota");

    System.out.println("Peso 1 :");
    float NovoPesoTrabalho = media.nextFloat();
    System.out.println("Peso 2 :");
    float NovoPesoProva = media.nextFloat();
    System.out.println("Peso 3  :");
    float NovoPesoNota3 = media.nextFloat();

    PesoTrabalho = NovoPesoTrabalho;
    PesoProva = NovoPesoProva;
    PesoNota3 = NovoPesoNota3;

    NotaTrabalho = NotaTrabalho * PesoTrabalho;
    NotaProva = NotaProva * PesoProva;
    Nota3 = Nota3 * PesoNota3;
      
      
      MediaFinal = (NotaTrabalho + NotaProva + Nota3);
      
      return Status();
      
    }
}
