package cap_4r;
/*

Objetos só são consideradosiguais quanto apontam para o mesmo objeto

*/

class MainVarsA{
 public static void main(String[ ] args){
 VarsA a = new VarsA();// 1
 //a -> var1
VarsA b = a; //b -> a -> var1.
b.var1 = 3;
 
 VarsA c = new VarsA(); //2
 //c -> var1....: obj diferente

  c.var1 = 2;
// System.out.println(c.var1);//1
// System.out.println(b.var1);//2

 Object d = c; //3

 System.out.println(c == a);//ponta para um obj diferente :... FALSE
 System.out.println(a == b); // aponta para o mesmo obj :... TRUE
  
 System.out.println(d == a );//ponta para um obj diferente :... FALSE
 }
}
