
public class App
{
    public static void main(String []args){
        Predio p1 = new Predio("Carlos Fontura","Av. Ipiranga,1021",5);
        Apartamento [] apartamentos = p1.getApartamentos();
        apartamentos[0] = new Apartamento(10,"João",1,2);
        apartamentos[1] = new Apartamento(11,"Cleber",0,0);
        apartamentos[2] = new Apartamento(12,"Maria",3,1);
        apartamentos[3] = new Apartamento(13,"Julio",1,2);
        apartamentos[4] = new Apartamento(14,"Isadora",1,0);
        
        System.out.println("Apartamentos totais: "+ p1.toString());
        
        System.out.println(p1.pesquisarNome("João"));
        
        System.out.println(p1.pesquisarNumero(11));
        
        int totalAdultos = 0;
        int totalCriancas = 0;
        for(int i =0; i< apartamentos.length; i++){
          totalAdultos += apartamentos[i].getAdultos();
          totalCriancas += apartamentos[i].getCriancas();  
        }
        System.out.println("Total de adultos: "+totalAdultos);
        System.out.println("Total de crianças: "+totalCriancas);
        
        double percentual = (p1.numeroDesocupado()/p1.getDisponiveis())*100;
        System.out.println("Percentual de apartamentos livres: "+percentual+"%");
    }   
}

