public class BMMquest4{
  
    private String marcaDaLampada = new String();
    private int potencia;
    private float preco;
    Boolean estadoDaLampada;

    public void setPreco(float valor){
        preco=valor;
    }
    public void getPreco(){
        System.out.println("O preco eh: "+preco);
    }
    public void setPotencia(int valor){
        potencia=valor;
    }
    public void getPotencia(){
        System.out.println("O preco eh: "+potencia);
    }
    public void setMarca(String nome){
        marcaDaLampada=nome;
    }
    public void getMarca(){
        System.out.println("O preco eh: "+marcaDaLampada);
    }
    public void acende(){
        estadoDaLampada = true;
    }
    public void apaga(){
        estadoDaLampada = false;
    }
    public void getEstadoDaLampada() {
       if(estadoDaLampada == true){
        System.out.println("A lampada esta acesa");
       }else{
        System.out.println("A lampada esta apagada");
       }
    }


}