package cap_6;

class AJarray{
 
//Sem casting  =(


public static void main(String[ ] args ){


 String inf [ ] = new String[ 10 ] ;
 inf[ 0 ] = " Unix - Like ";
 inf[ 1 ] = " Linux ";
 inf[ 2 ] = " GNU ";
 inf[ 3 ] = " Python ";
 inf[ 4 ] = " Java ";
 inf[ 5 ] = " Elementary Loki ";
 inf[ 6 ] = " OpenSource ";
 inf[ 7 ] = " Cervejas Pagas ";
 inf[ 8 ] = " Café Pagos ";
 inf[ 9 ] = " Liberdade ";
  for ( int i = 0 ; i < inf.length ; i ++){
      System.out.println(inf[ i ]);
          }
 System.out.println(".....................................................................");    
 //_________Casting OBJ
  Object [ ]  myCasting = inf ;
  for ( Object i : myCasting ){
  System.out.println(i);
 }
 System.out.println(".....................................................................");
 Object infB [ ] = new Object [ 4 ] ;
 infB[ 0 ] =  " Kernel - Linux";
 infB[ 1 ] =  " GNU ";
 infB[ 2 ] =  " FREE ";
 infB[ 3 ] =  " Cervejas a negociar " ;
  for( double i = 0.0 ; i < infB.length ; i ++){
     int rev = (int ) i ;   
      System.out.println(infB[ rev ] ) ;
         }
//Casting
 //String infC = infB = (String [ ] ) infB; //Herd
 //for(Object p : infC ){
 // System.out.println(p);
System.out.println(".....................................................................");
Object aaB [  ] = new Object [ 13 ] ;
String aaC [  ] = new String [ 12 ] ;
System.out.println(" 12  " + aaC.getClass().getName());
System.out.println(" 13  "+  aaB.getClass().getName());
          }

   }
