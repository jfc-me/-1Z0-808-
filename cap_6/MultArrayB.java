package cap_6;


class MultArrayB{

  public static void main(String...chamando){
   int etx1  [ ] [ ] =  { {1,2,3,4,5}, {12,15,13,12,12}} ;
       for( int a = 0 ; a < etx1.length ; a++){
         for ( int b = 0 ; b < etx1[a].length ; b++){
              System.out.println(etx1[a][b]+"\t");
               }
        }
   

   String etx2 [ ] [ ] =  {
                          { " - Unix ", " - Python " ," -MySQL " },
                          { " - Linux ", " - Java ", " - PrimeFaces "}
                          } ;          
                         for ( int ax = 0 ; ax < etx2.length ; ax++){
                         for ( int abx = 0 ; abx < etx2[ax].length ; abx++){
                               System.out.print(etx2[ax][abx]);
                                      }
                               System.out.println();  
                                      }

 System.out.println("...............................................................");
  for (String [ ]  ax1  : etx2){
  for ( String ax : ax1){
  System.out.print(ax);
                      }
                  System.out.println();
                      }
System.out.println("...............................................................");
  
                    int etx3 [ ] [ ]   = {
                                          {550, 551, 552, 553, 554, 555},
                                          {440, 441, 442, 443, 444, 445},
                                          {330, 331, 332, 333, 334, 13}
                                       };  
                                   for(int a [ ]  : etx3){
                                   for (int b : a){
                                       System.out.print(b); 
                                                     }  
                                       System.out.println(); 
                                                    }
                             

 }


}

