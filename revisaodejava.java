package somadoisnumeros;

public class SomaDoisNumeros{
    public static void main(String[] args){
        //args recebe os argumentos passando para linha de comando
       int n1 = Integer.parseInt(args[0]); //converte string para inteiro
       int n2 = Integer.parseInt(args[1]);
       
       System.out.println(n1 + n2);
    }
}