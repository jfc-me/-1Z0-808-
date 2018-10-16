package cap_3;

class Estatico{

public static String STATUS ;

public static String my(String status){
System.out.println("Fui Chamado 1..");
return status;
}
 public static void myTest(){
 
  System.out.println("Fui Chamado 2.. " + STATUS);
}
}
