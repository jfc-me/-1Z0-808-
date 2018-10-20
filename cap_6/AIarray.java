package cap_6;

class AIarray{
int time ;
 }




class TestAIarray{

 public static void main(String[ ] args){
 AIarray ab [ ]  = new AIarray[ 10 ];
// AIarray aA [ ]  = new AIarray[ 3 ];
// aA[ 0 ].time = 10;//Compila porem não executa.
 
for ( int i = 0 ; i < ab.length; i++){
         ab[i] = new  AIarray();
         ab[ i ].time =400;
               }

      }   
}


