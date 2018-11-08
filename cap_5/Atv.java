package cap_5;

class Atv{
 public static void main(String[] args){
//Executanat a frase Stand.


/*
1 a 8.. hi
9 a 11 double
15... 16 Surrender
14 passa pra ult, 18 ultima

resp:
C E D
*/
 int cardVal = 14;


 switch (cardVal) {
 case 4: case 5: case 6:
 case 7: case 8:
 System.out.println("Hit");
 break;
 case 9: case 10: case 11:
 System.out.println("Double");
 break;
 case 15: case 16:
 System.out.println("Surrender");
 break;
 default:
 System.out.println("Stand");

    }
  }

}
