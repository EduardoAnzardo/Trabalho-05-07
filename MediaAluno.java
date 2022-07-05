import java.util.Scanner;

public class MediaAluno{

    Scanner media = new Scanner(System.in);

    float Nota1;
    float Nota2;
    float Nota3;
    float MediaFinal;

    float Status(){
        System.out.println("Média do Aluno: ");
        System.out.println("Primeira Nota: " +this.Nota1);
        System.out.println("Segunda Nota: " +this.Nota2);
        System.out.println("Terceira Nota: " +this.Nota3);
        System.out.println("Média final: " +this.MediaFinal);
        System.out.println("=======");

      if (MediaFinal > 0){
        System.exit(0);
      }
      
    if (Nota1 == 0){
      System.out.println("Deseja atualizar a primeira nota do aluno? Caso sim, digite 1, caso não, digite 2");
      int Alterar1 = media.nextInt();

      if (Alterar1 == 1){
        System.out.println("Digite a nova nota");
        int NovaNota1 = media.nextInt();
        Nota1 = NovaNota1;
      }
      else 
        if (Alterar1 == 2){
          System.out.println("A nota não foi alterada");
        }
    }
    if (Nota2 == 0){
      System.out.println("Deseja atualizar a segunda nota do aluno? Caso sim, digite 1, caso não, digite 2");
      int Alterar2 = media.nextInt();

      if (Alterar2 == 1){
        System.out.println("Digite a nova nota");
        int NovaNota2 = media.nextInt();
        Nota2 = NovaNota2 ;
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
        int NovaNota3 = media.nextInt();
        Nota3 = NovaNota3;
      }
      else 
        if (Alterar3 == 2){
          System.out.println("A nota não foi alterada");
        }
    }
      MediaFinal = (Nota1 + Nota2 + Nota3) / 3;
      
      return Status();
      
    }
}
