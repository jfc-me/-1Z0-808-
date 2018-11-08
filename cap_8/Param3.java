package cap_8;

class Param3{

 void ind(final int a){ 
  //não  a =122;
  System.out.println(a);
  }
}

class ParamMain{
 public static void main(String[] ar){
  new Param3().ind(12);
     }
}
