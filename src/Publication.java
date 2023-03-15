
/**
 * Write a description of class Publication here.
 *
 * @author (Max Baldock)
 * @version ()
 */
public class Publication
{
    //title of the publication
    private String title;
    //year of the publication
    private int year;

    /**
     * Constructor for objects of class Publication
     *
     * @Param title and year
     */
    public Publication(String title, int year) {
        this.title = title;
        this.year = year;
    }

    /**
     * Get the title of the journal
     *
     * @return  The title of the journal
     */
    public String getTitle() {
        return title;
    }

    /**
     * Get the year when the journal was published
     *
     * @return  The year when the journal was published
     */
    public int getYear() {
        return year;
    }

    /**
     * Get the details of the journal
     *
     * @return  The details of the journal, i.e. the title, year and month
     */
    public String toString()
    {
        return title + ", " + year;
    }
}

    
