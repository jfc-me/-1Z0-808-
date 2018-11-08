package cap_7;
public class Rotulos{
 public static void main(String[ ] args){
  
  ext: for(int i = 1; i < 10; i++){
    inter:  for (int ii = 1; ii < 10; ii++){
         if(ii *i == 25){
            break ext;
             }
          if ( i * ii == 16){
             break inter;
             }
           }
          }
      
  
  }  
}
