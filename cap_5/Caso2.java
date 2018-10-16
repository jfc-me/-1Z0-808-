package cap_5;

class Caso2{

int casos = 1;
public void add(int numA){
   switch ( casos){
   case 1 :
    if( numA >= 10){
     System.out.println("Maior - Iqual ");
     }   
   // default: não permitido 2 default
    // System.out.println("Default..2");
    case 2:
     if( numA < 120){
      System.out.println("nenor ");
     }
   default:
      System.out.println("Default..1");  
 }
 }
}
