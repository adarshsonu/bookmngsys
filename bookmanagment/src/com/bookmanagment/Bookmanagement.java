package com.bookmanagment;
import java.util.LinkedList;
import java.util.Scanner;
 

public class Bookmanagement {
 
    
    LinkedList<Record> list;
 
 
    public Bookmanagement()
    {
        list = new LinkedList<>();
    }
 
  
    public void add(Record record)
    {
 
     
        if (!find(record.getIdNumber())) {
            list.add(record);
        }
        else {
 
          
            System.out.println(
                "Record already exists in the Record list");
        }
    }
 
   
    public boolean find(int idNimber)
    {
 
    
        for (Record l : list) {
 
         
            if (l.getIdNumber() == idNimber) {
 
                System.out.println(l);
                return true;
            }
        }
        return false;
    }
 
   
    public void delete(int recIdNumber)
    {
        Record recordDel = null;
 
  
        for (Record ll : list) {
 
         
            if (ll.getIdNumber() == recIdNumber) {
                recordDel = ll;
            }
        }
 
        if (recordDel == null) {
 
    
            System.out.println("Invalid record Id");
        }
        else {
 
            list.remove(recordDel);
 
       
            System.out.println(
                "Successfully removed record from the list");
        }
    }
 
 
    public Record findRecord(int idNumber)
    {
 
   
        for (Record l : list) {
 
     
            if (l.getIdNumber() == idNumber) {
                return l;
            }
        }
 
        return null;
    }

    public void update(int id, Scanner input)
    {
 
        if (find(id)) {
            Record rec = findRecord(id);
 
         
            System.out.print(
                "What is the new Book id? ");
            int idNumber = input.nextInt();
 
           
            System.out.print(
                "What is the new BookCost ");
            int BookCost = input.nextInt();
            input.nextLine();
 
        
            System.out.print(
                "What is the new Book Name ? ");
            String name = input.nextLine();
 
            rec.setIdNumber(idNumber);
            rec.setName(name);
            rec.setBookCost(BookCost);
            System.out.println(
                "Record Updated Successfully");
        }
        else {
 
            
            System.out.println(
                "Record Not Found in the Student list");
        }
    }
 
  
    public void display()
    {
 
        if (list.isEmpty()) {
 
     
            System.out.println("The list has no records\n");
        }
      
        for (Record record : list) {
 
          
            System.out.println(record.toString());
        }
    }
}