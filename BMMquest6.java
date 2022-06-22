public class BMMquest6 {
   /* Modifique o método “abreContaSimples” da classe “ContaBancariaSim-
plificada” de forma que o cliente só possa abrir uma conta com um valor

mínimo de R$ 100,00.*/
private String nomeDoCorrentista = new String();
private float saldo;
    public void abrecontaSimples(String nome, int deposito){
       
        if(deposito >=100){
            nomeDoCorrentista = nome;
            saldo = deposito;
        }else{
            System.out.println("para abrir uma conta simples eh necessario um deposito minimo de R$ 100,00");
        }
        
    }
}
