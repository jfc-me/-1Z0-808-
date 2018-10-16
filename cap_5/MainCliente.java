package cap_5;
//import Cliente;
class MainCliente{
 public static void main(String...runx){
  Cliente cl = new Cliente("fernandes");
  Cliente dl = new Cliente("Jeferson");
  Cliente ux = new Cliente("Linux");
  Cliente ur = new Cliente("Windows");

 System.out.println(cl == dl);//false
 System.out.println(cl == cl);//true
 System.out.println(ux.equals(ur));//false
 System.out.println(ux.equals(ux));//true

 String aA = new String("jfc-me");
 String aB = new String("jfc-me");

 System.out.println("--------------_");
 System.out.println(aA == aB);
 System.out.println("-----------------");
 System.out.println(aB.equals(aB));
System.out.println("==============");
 
 System.out.println(new Integer(10) == new Integer(10));
 System.out.println(new Integer(10).equals(new Integer(10)));
  
}
}
