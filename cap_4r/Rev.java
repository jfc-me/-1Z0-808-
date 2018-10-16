package cap_4r;

class Rev{
 private String a;
 private int b;


public String getA(){
 return a ;
}

public int getB(){
  return b;
}

public void setA(String a){
this.a = a;
//a = this.a ; <- null
// a  = a ; <- null
 }

public void setB(int b){
this.b = b;
 }
}

class Main{
 public static void main(String...exo){
 Rev adx = new Rev();

 adx.setA("- 0L4");
 String ra = adx.getA();
 System.out.println(ra);

 adx.setB(13);
 int rb = adx.getB();
 System.out.println(rb);
   }
}
