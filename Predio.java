
public class Predio
{  
   private String nome;
   private String endereco;
   private int disponiveis;
   private Apartamento[] apartamentos;
   public Predio(String nome, String endereco,int disponiveis){
    this.nome=nome;
    this.endereco=endereco;
    this.disponiveis=disponiveis;
    this.apartamentos = new Apartamento[disponiveis];
    }
   public void setNome(){
       this.nome=nome;
   }
   public String getNome(){
       return nome;
   }
   public void setEndereco(){
       this.endereco=endereco;
   }
   public String getEndereco(){
       return endereco;
   }
   public void setDisponiveis(){
       this.disponiveis=disponiveis;
   }
   public int getDisponiveis(){
       return disponiveis;
   }
   public Apartamento[] getApartamentos(){
       return apartamentos;
   }
   public String pesquisarNome(String nome){
       for(int i =0; i< apartamentos.length; i++){
         if(apartamentos[i].getProprietario().equalsIgnoreCase(nome)){
            return apartamentos[i].toString();
         }
        }
        return "Nenhum apartamento vinculado a esse nome";
   }
   public String pesquisarNumero(int numero){
       for(int i =0; i< apartamentos.length; i++){
         if(apartamentos[i].getNumero()== numero){
            return apartamentos[i].toString();
         }
        }
        return "Nenhum apartamento vinculado a esse numero";
   }
   public double numeroDesocupado(){
        int cont = 0;
        for(int i =0; i< apartamentos.length; i++){
            if(apartamentos[i].verDesocupado() == true){
                cont++;
            }
        }
        return cont;
    }
   public String toString(){
       return "Predio "+getNome()+ " localizado em: "+getEndereco()+ " possui " +getDisponiveis()+ " apartamentos totais.";
   }
}
