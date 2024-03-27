public class A
{
public void m1( int age){

System.out.println("m1---start");

if(age<0)

throw new ArithmeticException ("age problem");

System.out.println("m1--end");


}

public static void main(String args[]){

A  a=new  A();

try{

a.m1(-5);

}

catch(ArithmeticException e){

System.out.println("catch-block"+e.getMessage());


}
}



}