package cap_6;

class PercorrendoA{

 public static void main(String...x){
  int []aa = new int[ 3 ];
  aa[ 0 ] = 11;
  aa[ 1 ] = 12;
  aa[ 2 ] = 13;
 for( int i = 0 ; i < aa.length ;i++){
   System.out.println(aa[ i ]);
 }

  String ab [ ] =  {"1.0 Unix ", "2.0 GNU ", "3.0 Linux" };
  String abc [ ] = {"1.1 Unix ", "2.1 GNU ", "3.1 Linux" };
  String abd [ ] = {"1.2 Unix ", "2.2 GNU ", "3.2 Linux" };
  String abe [ ] = {"1.3 Unix ", "2.3 GNU ", "3.3 Linux" };
  
 // String add [ ] = { ab, abc, abd, abe}; // not,
 
  for(String atv : ab){
   System.out.println(atv);
   }
   for ( int ia = 0 ; ia < abc.length ; ia++)
     System.out.println(ia +" =:> " + abc[ia]);
       

     System.out.println("\n\n...........................................\n\n");

int ac [ ] = {1,2,3,4,5,6,7,8,9,10,11,12,13};

 for(int atv : ac){
  System.out.println(ac +" =:> " + atv);//end mem
    }
 for( int ib = 0 ; ib < ac.length ; ib++ ){
   System.out.println(ib + "   =:> "+ ac[ib]);
     } 

     System.out.println("\n\n...........................................\n\n");





}
}

