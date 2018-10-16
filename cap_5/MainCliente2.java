package cap_5;

class MainCliente2{
 public static void main(String...runx){
   Cliente2 cl2 = new Cliente2("linux");
   Cliente2 cl3 = new Cliente2("windows");

 System.out.println(cl2.equals(cl3));
 System.out.println(cl2.equals(cl2));
}
}
