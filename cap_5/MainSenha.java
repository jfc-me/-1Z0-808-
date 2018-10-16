package cap_5;
import static cap_5.Senha.USER;
class MainSenha{
 public static void main(String...run){


 USER = "jfc_me";
 Senha verif = new Senha("123");
 boolean senha  = verif.pass();
 String user = verif.user();
 
 System.out.println("[ > ] "+ USER + " : " + user);
 System.out.println("[ * ] "+ senha + " senha");
  }
}
