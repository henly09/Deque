/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deque;

/**
 *
 * @author Henz Montera
 * @param <E>
 */
public interface dequee<E> {
    
    int size();
    boolean isempty();
    
    E first() throws EmptyDequeException;
    E last()throws EmptyDequeException;
    E removed() throws EmptyDequeException;
    
    void addlast(E element);
    void addfirst(E element);
    E removefirst()throws EmptyDequeException;
    E removelast()throws EmptyDequeException;
    
}
