package Book;

/**
 * Created by Админ on 15.11.2016.
 */
public  class Book {
    String name;
    String author;
    int year;
    public Publisher publisher;

    public Book(String name, String author, int year, String publ){

        this.name = name;
        this.author = author;
        this.year = year;
        publisher = new Publisher(publ);
    }

    public String relativeBookAge(int year){
        if ((2016-year)<10){
            return "New book";
        }else {
            return "Old book";
        }
    }

    class Publisher{

        public String name;
        public Book book;

        public Publisher(String name){
            book=Book.this;
            this.name=name;
        }
        public String getPublName(){
            return (this.name);
        }
    }

}
