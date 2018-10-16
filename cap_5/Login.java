package cap_5;

class Login{
 public static String USER;
 private String pass ;
 public Login(String pass){
 this.pass = pass;
}
 public boolean equals(Object o){
 if (! (o instanceof Login){
 System.out.print("[ + ] Verificando \n");
 return false;

 }

Login comp = (Login) o;
 return this.pass == comp.pass;
    }
 }
