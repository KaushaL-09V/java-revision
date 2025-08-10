/*
Collection:List
Iterable Interface:
Superinterface: Iterable is the root interface for all collection types in Java. It defines the ability of a collection to return an iterator.
Method:
iterator(): Returns an iterator over elements of type T.

Collection Interface:
Description: Extends Iterable. It's the root interface for most collections and includes basic operations like adding and removing elements.
Subinterfaces: List, Set, Queue, Deque

List Interface:
Description: Represents an ordered collection (sequence) that allows duplicates. It defines methods for positional access and searching.
Common Implementations: ArrayList, LinkedList, Vector, Stack

Set Interface:
Description: A collection that does not allow duplicate elements. It represents a mathematical set.
Common Implementations: HashSet, LinkedHashSet, TreeSet, SortedSet

Queue Interface:
Description: Represents a collection used to hold multiple elements before processing, typically following FIFO (First In, First Out) order.
Common Implementations: PriorityQueue, ArrayDeque, LinkedList, Deque

Deque Interface:
Description: A linear collection that supports element insertion and removal at both ends (double-ended queue).
Common Implementations: ArrayDeque, LinkedList
*/


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class L19_ArrayList {
    public static void main(String[] args) {
        List<Integer> numb=new ArrayList();
        //<Integer>:Object type integer,Remove the bugs (if i don't )
        numb.add(10);
        numb.add(5);
        numb.add(8);
        numb.add(12);

        for(int n:numb){
            System.out.println(n);
        }
        System.out.println(numb);
    }
}
