package cap_6;
 class AEarray{
 public static void main(String[] args){
 int aa [ ] ;

 for (int i = 1; i < 10 ; i++){
   aa = new int [ i ] ; //compila 
   System.out.println(i+ " array malucos ===> "+ aa[0]);//Exception... "0"
     }
   
   aa = new int [ 13  ] ; //compila 
   System.out.println(aa[0]); //
   }
}
