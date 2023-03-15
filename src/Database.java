import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * A database for a collection of publications,
 * e.g. books, journals, etc.
 *
 * @author (Max Baldock)
 * @version ()
 */
public class Database {
    // private ArrayList<Book> bookList;         // A collection of books
    // private ArrayList<Journal> journalList;   // A collection of journals

    //A collection of publications
    private ArrayList<Publication> publicationList;

    /**
     * Create a new database
     */
    public Database() {
        //create new arraylist of type publication.
        publicationList = new ArrayList<Publication>();

        // bookList = new ArrayList<Book>();
        // journalList = new ArrayList<Journal>();
    }

    /**
     * Add a non-null publication
     *
     * @param newPublication The publication to be added
     */
    public void addPublication(Publication newPublication) {
        //check that the publication isn't already in.
        if (publicationList.contains(newPublication)) {
            System.out.println("The publication " + newPublication + " has already been added!");
        } else {
            publicationList.add(newPublication);
        }
    }

    /**
     * Get the total number of publications
     *
     * @return The total number of publications
     */
    public int getTotal() {
        return publicationList.size();
    }

    /**
     * Return a list of books that match the param.
     *
     * @param author the author to search up.
     */
    public ArrayList<Book> byAuthor(String author) {
        ArrayList<Book> bookList = new ArrayList<>();
        //if a publication is type Book assign to temp variable, then if it's author matches the param add it to the
        //new arraylist.
        for (Publication publication : publicationList) {
            if (publication instanceof Book) {
                Book i = (Book) publication;
                if(i.getAuthor().equals(author)) {
                    bookList.add(i);
                }
            }
        }
        return bookList;
    }

    /**
     * Return the number of journals that match the given month and year.
     *
     * @param int month, year the month and year to look up.
     */
    public int getNumberOfJournals(int month, int year) {
        int count = 0;
        //if the publication is a journal assign to temp variable and then if if that journal's month matches params increase
        //the count.
        for (Publication publication : publicationList) {
            if (publication instanceof Journal) {
                Journal i = (Journal) publication;
                if (month == i.getMonth() && year == i.getYear()) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Print the details of all publications
     */
    public void printList() {
        //print all journals
        for (Publication publication : publicationList) {
            if (publication instanceof Journal) {
                System.out.println(publication);
            }
        }
        //print all books
        for (Publication publication : publicationList) {
            if (publication instanceof Book) {
                System.out.println(publication);
            }
        }
        //print the rest
        for (Publication publication : publicationList) {
            if (publication instanceof Publication) {
                System.out.println(publication);
            }
        }

        System.out.println("Total number of publications: " + getTotal());
    }
}
