public class Book extends Item {
    // subclass.
   // we make the constructor her, beacuse we can not acces "id, type and title" from Book class.
    public Book(int id, String type, String title) {
        super(id, type, title);
    }



}
