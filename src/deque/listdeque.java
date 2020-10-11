/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deque;

import usedoublylinkedlist00580.DList;

/**
 *
 * @author Henz Montera
 * @param <E>
 */
public class listdeque<E> implements dequee<E> {
    
    private final DList<E> list;

    public listdeque(){
        list = new DList<>();
    }
    
    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isempty() {
        return list.isEmpty();
    }

    @Override
    public E first() throws EmptyDequeException {
        if (isempty()){
            throw new EmptyDequeException("The Deque is Empty!");
        }
       return list.first();
    }
    
    @Override
    public E removed() throws EmptyDequeException{
        if (isempty()){
            throw new EmptyDequeException("The Deque is Empty!");
        }
        return list.removed();
    }

    @Override
    public E last() throws EmptyDequeException {
        if (isempty()){
            throw new EmptyDequeException("The Deque is Empty!");
        }
        return list.last();
    }

    @Override
    public void addlast(E element) {
       list.addLast(element);
    }

    @Override
    public void addfirst(E element) {
       list.addFirst(element);
    }

    @Override
    public E removefirst() throws EmptyDequeException {
        if(isempty()){
            throw new EmptyDequeException("There's nothing to be removed!");    
        }
         return list.removeFirst();
    }

    @Override
    public E removelast() throws EmptyDequeException {
        if(isempty()){
            throw new EmptyDequeException("There's nothing to be removed!");   
        }
        return list.removeLast();
    }
    
}
