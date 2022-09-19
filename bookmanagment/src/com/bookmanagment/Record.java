package com.bookmanagment;
 
public class Record {
 

    private String name;
    private int idNumber;
    private int BookCost;
 

    public Record() {}
 
 
    public Record(String name, int idNumber,
                  int BookCost)
    {
 

        this.name = name;
        this.idNumber = idNumber;
        this.BookCost = BookCost;
    }
 
 
    public int getBookCost() { return BookCost; }
 
  
    public void setBookCost(int BookCost)
    {
 
        this.BookCost = BookCost;
    }
 
 
    public int getIdNumber() { return idNumber; }
 
   
    public void setIdNumber(int idNumber)
    {
        this.idNumber = idNumber;
    }
 
 
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
 
    @Override public String toString()
    {
 
        return "Records{"
            + "name=" + name + ", idNumber=" + idNumber
            + ", Book cost=" + BookCost + '}';
    }
}