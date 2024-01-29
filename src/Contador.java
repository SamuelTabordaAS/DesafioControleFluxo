import java.util.Scanner; 


public class Contador {
    public static void main(String[] args) {
    

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o Primeiro Parametro: ");
        int parametroUm = in.nextInt(); 
        System.out.println("Digite o Segundo Parametro: ");
        int parametroDois = in.nextInt(); 

        try {

            contar(parametroUm, parametroDois);

        } catch ( ParametrosInvalidosException e ) {
            System.out.println("O primeiro parametro nunca podera ser maior que o segundo ! ");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException { 
        if(parametroUm > parametroDois){ 
            throw new ParametrosInvalidosException();
        }else { 
           int  contador = parametroDois - parametroUm ; 

           for (int i = 1; i < contador; i++){ 
                System.out.println("Imprimindo o numero: " + i );
           }
        }
    }

  
}
    

