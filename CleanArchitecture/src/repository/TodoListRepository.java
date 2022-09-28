/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;
import entity.Todolist;

/**
 *
 * @author old
 */
public interface TodoListRepository {
    Todolist[] getAll();
    void add(Todolist todolist);
    
    boolean remove(Integer number);
}
