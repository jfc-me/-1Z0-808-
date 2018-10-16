package cap_5;

class Senha{

private String password ;
private String passP = "123";
private String user = "jfc_me";
public static String USER;

public Senha(String password){
 this.password = password;
}

 public boolean pass(){
 System.out.println("{ + } Verificando ");
 return this.password.equals(passP);

 }
 public String user(){
 String vr = this.user == USER ? "logado.." : "Erro User";
 return vr;
}

}
