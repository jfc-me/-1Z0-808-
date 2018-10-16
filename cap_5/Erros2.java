package cap_5;

class Erros2{
 
public boolean  entrada(String ent){
  if(ent.equals("test")){
 return false;
  }  
 throw new  IllegalArgumentException();
}
}

