package com.LinkedList;
import java.util.*;
public class RemoveFromLinkedList {
    public static void main(String args[]){

        LinkedList<Integer> list=new LinkedList<Integer>();

        //Adding elements to the Linked list
        list.add(Integer.valueOf("1"));
        list.add(Integer.valueOf("2"));
        list.add(Integer.valueOf("3"));
        list.add(Integer.valueOf("4"));
        list.add(Integer.valueOf("5"));
        list.add(Integer.valueOf("6"));
        list.add(Integer.valueOf("7"));
        list.add(Integer.valueOf("8"));
        list.add(Integer.valueOf("9"));

        Iterator<Integer> iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        //Removing First element
        //Same as list.remove(0);
        list.removeFirst();

        //Removing Last element
        list.removeLast();

        System.out.print("\nRemove Last: ");
        //Iterating LinkedList
        Iterator<Integer> iterator3=list.iterator();
        while(iterator3.hasNext()){
            System.out.print(iterator3.next()+" ");
        }

        //removing 2nd element, index starts with 0
        list.remove(1);

        System.out.print("\nRemove second: ");
        //Iterating LinkedList again
        Iterator<Integer> iterator2=list.iterator();
        while(iterator2.hasNext()){
            System.out.print(iterator2.next()+" ");
        }
    }
}
