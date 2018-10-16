package cap_4r;


class RevGet{
 
 private String nome;

public RevGet(){
 nome = "fernandes";
}

public String getNome(){
 return nome;
   }
 } 

class Main{
 public static void main(String...run){
  String tpa = new RevGet().getNome();
  System.out.println(" - " + tpa);
   }
}

