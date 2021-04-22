package com.example.inlupp3;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
class BookStore{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String name;
    private String address;
    private String bookId;
   
    

    public BookStore(){}

    public BookStore(String name, String address, String bookId){
        this.name = name;
        this.address = address;
        this.bookId = bookId;
    }

    /**
     * Calculate how many bookshelves are needed.
     * 
     * One Shelf fits 50 books.
     * @param nrOfBooks the number of books
     * @return number of bookshelves needed
     */
    public int calculateShelves(int nrOfBooks){
        int shelves = 0;

        if(nrOfBooks <=50){
            shelves = 1;
        }
        else{
            shelves = nrOfBooks/50;
        }
        return shelves;

    } 

    public Integer getId() {
        return id;
    }

    public String getAddress() {
       return address;
    }

    public String getName() {
       return name;
    }

    public String getBookId() {
      return bookId;
    }
   public void setId(Integer id) {
       this.id = id;
   }

   public void setAddress(String address) {
       this.address = address;
   }

   public void setName(String name) {
       this.name = name;
   }

   public void setBookId(String bookId) {
       this.bookId = bookId;
   }


}