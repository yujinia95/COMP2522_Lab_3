import java.util.Objects;

/**
 * IPod is a child of IDevice.
 * <p>
 * Its purpose is "music".
 * </p>
 * <p>
 * Provides getters for the number of songs currently stored, and its max volume in decibels. Overrides the toString method to print additional information (songs stored and max volume).
 * </p>
 * <p>
 * Overrides the equals and hashcode methods. IPods are equal if they have the same number of songs stored.
 * </p>
 */
public class IPod extends IDevice
{
    private       int    numSongsStored;
    private final double maxVolDecibels;

    final static String IPOD_PURPOSE = "music";

    /**
     * Constructor for IPod.
     *
     * @param songs  is the number of songs currently stored as an int.
     * @param maxVol is the maximum volume in decibels.
     */
    public IPod(final int songs, final double maxVol)
    {
        super(IPOD_PURPOSE);

        this.numSongsStored = songs;
        this.maxVolDecibels = maxVol;
    }

    /**
     * Getter for number of songs stored.
     *
     * @return number of songs stored as an int.
     */
    final public int getNumSongsStored()
    {
        return this.numSongsStored;
    }

    /**
     * Getter for maximum volume in decibels.
     *
     * @return max volume in decibels.
     */
    final public double getMaxVolDecibels()
    {
        return this.maxVolDecibels;
    }

    /**
     * Sets the number of songs currently stored.
     *
     * @param num the number of songs stored as an int.
     */
    final public void setNumSongsStored(final int num)
    {
        this.numSongsStored = num;
    }

    /**
     * Prints the IPod object's details.
     */
    final public void printDetails()
    {
        final String purpose;
        final int    songsStored;
        final double maxVol;

        purpose     = this.getPurpose();
        songsStored = this.numSongsStored;
        maxVol      = this.maxVolDecibels;

        System.out.println(String.format("The purpose of this IDevice is %s.\nThe number of songs stored is %d.\nThe maximum volume in decibels is %f.\n", purpose, songsStored, maxVol));
    }

    /**
     * Returns the IPod object's details in a single String.
     *
     * @return the IPod's details as a String.
     */
    @Override
    public String toString()
    {
        final int    songsStored;
        final double maxVol;

        songsStored = this.numSongsStored;
        maxVol      = this.maxVolDecibels;

        return super.toString() + String.format("The number of songs stored is %d.\nThe maximum volume in decibels is %f.\n", songsStored, maxVol);
    }

    /**
     * IPods are equal if they have some number of songs currently stored.
     * @param o is the IPod object to be compared to.
     * @return a boolean; true if equal otherwise false.
     */
    @Override
    public boolean equals(Object o)
    {
        // if null object return false
        if(o == null)
        {
            return false;
        }

        // if comparing to self, return true
        if(o == this)
        {
            return true;
        }

        // if object of wrong type, return false
        if(!(o instanceof IPod))
        {
            return false;
        }

        // cast only AFTER validating Object o is of class IPod
        final IPod that;
        that = (IPod) o;

        // Ok to use == because numSongsStored is an int (primitive data type)
        return this.numSongsStored == that.numSongsStored;
    }

    /**
     * Returns a hashcode.
     *
     * @return a hashcode as an int.
     */
    @Override
    public int hashCode()
    {
        // FYI: for equal IPod objects, returns identical hashcode
        return Integer.hashCode(numSongsStored);
    }
}
