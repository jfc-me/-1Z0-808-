package cap_acess;
import cap_model.Model;

public class Acesso{ 

public String adm;
public static String acs = "Autorizado";

Model mod = new Model();


public String registro(String user ,String pass){
     mod.nome = user;
     mod.senha = pass;
  return user + " { " + adm + " } " + "\n" + pass + " { " + acs + " } "; 
  }

}
