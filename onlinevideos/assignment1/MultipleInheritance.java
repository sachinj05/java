package com.java.assignment1;

class A
{
public void methodAClassA()
{
System.out.println("In ClassA MethodA");
}
}
class B extends A{
public void methodAClassA(){
System.out.print("in Class B Method ClassA");
}
}
class C extends A,B {
/*
* Which is not possible bcoz
* if u use the above code the compiler does not
* know which instace method could be used in the class C
* So they made it as error it will show the compilation error
*
*/
}


