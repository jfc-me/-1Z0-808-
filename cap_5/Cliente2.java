package cap_5;

class Cliente2{
private String nome;

Cliente2(String nome){
  this.nome = nome;
  }

 public boolean equals(Object o){ 
  if (!(o instanceof Cliente2)){
  return true;
 }
 Cliente2 second = (Cliente2) o ;
 return this.nome.equals(second.nome);
    }
  }

