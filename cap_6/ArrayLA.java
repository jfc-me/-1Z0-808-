package cap_6;
import java.util.ArrayList;
class ArrayLA{
public static void main(String[ ] args){
ArrayList<String> na = new ArrayList<String>();
na.add("- Linux");
na.add("- Windows");
na.add("- Unix");

System.out.println(na.contains("- Linux")); //true
System.out.println(na.contains("Windows"));//false

boolean verificar = na.remove("- Windows");
System.out.println(na.contains("- Windows"));//false
System.out.println(na.contains("- Mac Os"));//fals

ArrayList<Integer> nb = new ArrayList<Integer>();
nb.add(1);
nb.add(2);
nb.add(3);
//tamanho
System.out.println(na.size());

//convert
ArrayList<Double> nc;
nc = new ArrayList<Double>();
nc.add(1.13);
nc.add(13.1);
nc.add(12.00);

Object[ ] adnc = nc.toArray();
//array Integer
//Integer[ ] adnc1 = nc.toArray(new Integer[ 0 ]); excp
//String[ ]  adnc2 = nc.toArray(new String[ 0 ]); excp

ArrayList<String> nd ;
nd = new ArrayList<String>();
nd.add("Linux");
nd.add("Unix");
nd.add("Java");
nd.add("Python");

ArrayList<String> ne = new ArrayList<String>();
ne.add("Korea");
ne.add("Kpop");

ArrayList<String> todos = new ArrayList<String>();
todos.addAll(nd);
todos.addAll(ne);

//posição

ArrayList<String> nf = new ArrayList<String>();
nf.add("linux");
nf.add("Cerveja");

ArrayList<String> ng1 = new ArrayList<String>();
ng1.add("xx1");
ng1.add("xx2");
ng1.add("xx3");
ng1.add("xx4");
ng1.add("xx5");
ng1.add("xx6");
ng1.set(0,"linux");
System.out.println(ng1.get(1));
//Remover
System.out.println(nf.remove(1));
//alterar
System.out.println(ng1.size());

//Posições.

ArrayList<String> nh = new ArrayList<String>();
nh.add("a11");
nh.add("b12");
nh.add("c13");
nh.add("d14");
nh.add("e15");
nh.add("11a");
nh.add("12b");
nh.add("13c");
nh.add("1a1");
nh.add("2b2");
nh.add("3c3");
System.out.println(" 1 =:> "+ nh.indexOf("c13"));
System.out.println(" 2 =:> "+ nh.indexOf("d14"));
System.out.println(" 3 =:> "+ nh.indexOf("linux"));
System.out.println(" 4 =:> "+ nh.lastIndexOf("a11"));
// 
              }
 }

