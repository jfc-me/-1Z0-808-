package cap_4;

class MainModelo1{
 public static void main(String...zumm){
 Modelo1 md1 = new Modelo1();
 int a = md1.serial = 13;
 Modelo1 md2 = new Modelo1();
 int b = md2.serial = 13;
 
 Modelo1 md3 = new Modelo1();
 int c = md3.serial = 13; 
 
//objetos só são iquais quando esta aopontando para a mesma referencia.
System.out.println( a == b);
System.out.println( b == c);
System.out.println( a == a);

//só possuem o mesmo tipo 
System.out.println( md1 == md2);
System.out.println( md3 == md2);
System.out.println( md1 == md1);
  }
}
