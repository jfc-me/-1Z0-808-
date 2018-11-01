package cap_6;
import java.util.ArrayList;
class RefArrayListB{

 public static void main(String[] args){
 RefArrayListA jf = new RefArrayListA();
 jf.setEstado("Mt");

 ArrayList<RefArrayListA> adx = new ArrayList<RefArrayListA>();
 adx.add(jf);

 System.out.println(adx.get(0).getEstado());


  }
}
