
package cap_4r;

class GetSet{
private String nome;


public void setNome(String nome){
this.nome = nome;
 }

public String getNome(){
 return nome;
  }
  
}


class Principal{
 public static void main(String...chmd){
 GetSet md = new GetSet();
 for ( int i =0 ; 10 > i ; i++){
     md.setNome(" fulado ");
    
     String apresenta = md.getNome();
     System.out.println(i + " :=: "+apresenta);
     }
  }

}
 
