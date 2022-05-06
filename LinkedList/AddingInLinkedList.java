package com.LinkedList;
import java.util.*;
public class AddingInLinkedList {
    public static void main(String args[]){

        LinkedList<String> list=new LinkedList<String>();

        //Adding elements to the Linked list
        list.add("Raju");
        list.add("Amit");
        list.add("Biswajit");

        //Adding an element to the first position
        list.addFirst("Sachin");

        //Adding an element to the last position
        list.addLast("Smruti");

        //Adding an element to the 3rd position
        list.add(2, "Satya");

        //Iterating LinkedList
        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
