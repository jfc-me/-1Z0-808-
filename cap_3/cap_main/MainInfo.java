package cap_main;
import cap_acess.Acesso;

public class MainInfo{
 public static void main(String[] args){
 Acesso  acessos = new Acesso();
 acessos.adm = "root";
 String apresentar = acessos.registro("jfc_me","137");
 System.out.println(apresentar);
    }
}
