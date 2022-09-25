import java.util.Scanner;
/*Programa que peça as 2 notas de um aluno e diga a média
 *condicionais:
 *a)Se a média for maior ou igual a sete dizer "Apeovado"
 *b)Se a média for menor que 7 dizer "Reprovado"
 *c)Se a média for 10 dizer "Aprovado com distinção"
 */
 class Media{
   public static Scanner ler=new Scanner(System.in);
   public static void main(String args[]){ 
    float n1,n2,media;
    System.out.print("digite a primeira nota:");
    n1=ler.nextFloat();
    System.out.print("digite a segunda nota:");
    n2=ler.nextFloat();
    media=(n1+n2)/2;
    System.out.println("Média:"+media);
    if(media==10){
      System.out.println("Aprovado com distinção");
    }else  if(media>=7){
      System.out.printf("Aprovado");
    }else{
      System.out.println("Reprovado");
      }
      
   }
 }
