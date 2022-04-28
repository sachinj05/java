package com.java.assignment1;

class Bank{  
int getRateOfInterest(){return 0;}  
}  
//Creating child classes.  
class SBI extends Bank{  
int getRateOfInterest(){return 8;}  
}  
  
class ICICI extends Bank{  
int getRateOfInterest(){return 7;}  
}  
class AXIS extends Bank{  
int getRateOfInterest(){return 9;}  
}  
//Test class to create objects and call the methods  
class Test2{  
public static void main(String args[]){  
SBI s=new SBI();           		//SBI=class; s=reference; new= key word to locate memory; SBI()=constructor
ICICI i=new ICICI();  
AXIS a=new AXIS();  
System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());     //getRateOfInterest=method
System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
}  
}  