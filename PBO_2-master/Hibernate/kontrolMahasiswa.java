/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import Hibernate.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Rafael Mahesa
 */
public class kontrolMahasiswa {
    // List data mahasiswa
    private List mahasiswaItems = new ArrayList();
    private Mahasiswa selectedMahasiswa = new Mahasiswa();
    
    public kontrolMahasiswa() {
       init();
    }
    
    private synchronized void init(){
        if(mahasiswaItems.size() >=1){
            mahasiswaItems.clear();
        }
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        mahasiswaItems = session.createQuery("from Mahasiswa as s").list();
        session.getTransaction().commit();
        selectedMahasiswa = (Mahasiswa) mahasiswaItems.get(0);
    }
    
    public List getMahasiswaItems(){
        return mahasiswaItems;
    }
    
    public Mahasiswa getSelectedMahasiswa(){
        return selectedMahasiswa;
    }
    
    public void setSelectedMahasiswa(int indeks){
        this.selectedMahasiswa = (Mahasiswa) mahasiswaItems.get(indeks);
    }

    public void addMahasiswa(Mahasiswa newMahasiswa){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Mahasiswa s = newMahasiswa;
        session.save(s);
        session.getTransaction().commit();
        s.clear();
        init();
    }
    
    public void deleteMahasiswa(String nimdel){
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            Query q = session.createQuery("delete from Mahasiswa as s where s.nim =:NIM");
            q.setParameter("NIM",nimdel);
            int rowCount = q.executeUpdate();
            session.getTransaction().commit();
            init();
    }
    
    public void updateMahasiswa(Mahasiswa updateMahasiswa, String oldnim){
        String fnim = updateMahasiswa.getnim();
        String fnama = updateMahasiswa.getnama();
        String fipk = updateMahasiswa.getipk();
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query q = session.createQuery("update Mahasiswa set nim=:NIM, nama=:Nama, ipk=:IPK where nim=:ONIM");
        q.setParameter("NIM", fnim);
        q.setParameter("Nama", fnama);
        q.setParameter("IPK", fipk);
        q.setParameter("ONIM", oldnim);
        int rowCount = q.executeUpdate();
        session.getTransaction().commit();
        init();
    } 
}
