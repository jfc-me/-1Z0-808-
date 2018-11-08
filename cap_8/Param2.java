package cap_8;
 
class Param2{
 
void test(){
//err print("oi");
//err  print(122);
 print("jfc-me",13);
}
 void print(String a, int b){
System.out.println(a + " == " + b);
   }
 }

class mainP{
 public static void main(String[] args){
  Param2 a = new Param2();
   a.test();
}
}
