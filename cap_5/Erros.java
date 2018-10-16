package cap_5;

class Erros{
//Erro a compilar.
//Para resolver envolva um excep 
public int entrada(int x ){
 if(x > 200){
 return 5;
  }
throw new RuntimeException();//Captura a possibilidade , não resolve
  }

}
 
