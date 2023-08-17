
public class Apartamento
{  
   private int numero;
   private boolean desocupado;
   private String proprietario;
   private int adultos;
   private int criancas;
    public Apartamento(int numero, String proprietario, int adultos, int criancas){
      this.numero = numero;
      this.proprietario=proprietario;
      this.adultos=adultos;
      this.criancas=criancas;
      this.desocupado=desocupado;
   }
    public void setNumero(){
       this.numero=numero;
   }
   public int getNumero(){
       return numero;
   }
   public void setProprietario(){
       this.proprietario=proprietario;
   }
   public String getProprietario(){
       return proprietario;
   }
   public void setAdultos(){
       this.adultos=adultos;
   }
   public int getAdultos(){
       return adultos;
   }
   public void setCriancas(){
       this.criancas=criancas;
   }
   public int getCriancas(){
       return criancas;
   }
   public boolean verDesocupado(){
       if(adultos == 0 && criancas == 0){
           return true;
       }else{return false;
        }
   }
   public String toString(){
    return "Apartamento numero "+getNumero()+ " de " +getProprietario()+ " possui "+getAdultos()+" adultos e "+getCriancas()+" crianças"+"\nDesocupado: "+verDesocupado();
    }
}
