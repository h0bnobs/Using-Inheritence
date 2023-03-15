/**
 * A simple model of books
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Book extends Publication
{
    // The author of the book
    private String author;

    /**
     * Create a book.
     *
     * @param title     The title of the book.
     * @param author    The author of the book.
     * @param year      The year when the book was published.
     */
    public Book(String title, String author, int year)
    {
        super(title, year);
        this.author = author;
    }

    /**
     * Get the author of the book
     *
     * @return  The author of the book
     */
    public String getAuthor()
    {
        return author;
    }

    /**
     * Get the details of the book
     *
     * @return  The details of the book, i.e. the title, year and author
     */
    public String toString ()
    {
        return super.toString() + ", by " + author;
        //super.getTitle() + ", " + super.getYear() + ", by " + author;
    }

    /**
     * Check if the book is the same as the given one.
     *
     * @param obj The given object.
     *
     * @return true  if the book and the given object have
     *               the same title, author and year
     *         false otherwise
     */
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if ( !(obj instanceof Book) )  return false;

        var another = (Book) obj;
        return this.getTitle().equals(another.getTitle()) &&
                this.author.equals(another.author) &&
                this.getYear() == another.getYear();
    }
}
