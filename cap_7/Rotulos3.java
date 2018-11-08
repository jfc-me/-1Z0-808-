package cap_7;
 
class Rotulos3{
 public static void main(String[ ] args){
 for(int i = 0 ; i < 10 ; i++){
   System.out.println("iniciar");
   test1:
   test2: switch(i){
    case 0: case 1:
        System.out.println(" Case" + i);
        for( int e = 0; e < 10 ; e++){
           System.out.println(e);
            if (e == 2) break test1;
          }
         case 2:
              System.out.println(" case 2 "+ i);
         continue;
        case 3:
          System.out.println("case 3 " + i );
         break;
         default:
         System.out.println("ultimo ");
         break;
             }
         System.out.println(" ul1 ");
           }
      }
}
