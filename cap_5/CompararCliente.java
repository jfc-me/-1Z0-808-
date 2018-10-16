package cap_5 ;

class CompararCliente{
private Integer  senha = 123;
private String usuario = "jfc";
private String sistema = "linux" ;


public boolean senha(Integer senha){
   
    if (this.senha ==  null){
        System.out.println("Senha não pode estar em branco, Diferente");
     } else if ( this.senha.equals(senha)){
      System.out.println("Logado");
     } else {
        System.out.println("Senha  "+ senha + " Incorreta");
    }
    return true;
   }

public String info(String user,String sistem){
    String comp = user != this.usuario ? "Usuarios Diferentes" : "okay = "+user;
    if (sistem == this.sistema){
    System.out.println("Verificado : " + this.sistema);
    }  else{
       System.out.println("Sistema bug :  " + sistem + " = [ ");
     }
     return comp;  
 }


   }   
