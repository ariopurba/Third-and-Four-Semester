/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entity.Todolist;
/**
 *
 * @author old
 */
public class TodoListRepositoryImpl implements TodoListRepository {
    public Todolist[] data = new Todolist[10];

    @Override
    public Todolist[] getAll() {
        return data;
    }
    
    public boolean isFull(){
        var isFull = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                //Model atau data masih kosong
                isFull = false;
                break;
            }
        }return isFull;
    }
    public void resizeFull(){
        //Jika penuh, kita resize ukuran array 2x lipat
        if (isFull()) {
            var temp = data;
            data = new Todolist[data.length * 2];
            for (int i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
        }
    }

    @Override
    public void add(Todolist todolist) {
        resizeFull();
        //tambahkan ke posisi yang data array null
        for (var i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = todolist;
                break;
            }
        }
    }

    @Override
    public boolean remove(Integer number) {
        if ((number -1)>= data.length) {
            return false;
        }else if (data[number -1]== null){
            return false;
        }else{
            for (int i = (number -1); i < data.length; i++) {
                if (i == (data.length -1)) {
                    data[i] = null;
                }else{
                    data[i] = data[i + 1];
                }
            }
        }return true;
    }
    
    
}
