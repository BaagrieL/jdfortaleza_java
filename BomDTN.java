import java.util.Scanner;
/*Faça um Programa que pergunte em que turno você estuda. 
 * Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. 
 * Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" 
 * ou "Valor Inválido!", conforme o caso.
 */
 class FM{
   public static Scanner ler=new Scanner(System.in);
   public static void main(String args[]){ 
    String turno;
    System.out.println("digite em que turno vc estuda(M-manhã,T-tarde,N-noite:");
    turno=ler.next();
    //ainda não sei identar direito :/
    if(turno.equalsIgnoreCase("M")){
      System.out.print("bom dia");
      
    }else if(turno.equalsIgnoreCase("T")){
      System.out.print("boa tarde");
      
    }else if(turno.equalsIgnoreCase("N")){
      System.out.print("boa noite");
      
    }else{
      System.out.print("Turno inválido, tente novamente");
    }
      
   }
 }