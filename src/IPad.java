import java.util.Objects;

/**
 * IPad is a child of IDevice.
 * <p>
 * Its purpose is "learning".
 * </p>
 * <p>
 * Provides getters for whether it has a case, and its current operating system version. Overrides the toString method to print additional information (contains a case and OS version).
 * </p>
 * <p>
 * Overrides the equals and hashcode methods. IPads are equal if they have the same OS version.
 * </p>
 */
public class IPad extends IDevice
{
    private boolean hasCase;
    private String  opSystemVersion;

    final static String IPAD_PURPOSE = "learning";

    /**
     * Constructor for IPad.
     *
     * @param hasCase is a boolean; true if IPod has a case, otherwise false.
     * @param os is the current operating system version as a String.
     */
    public IPad(final boolean hasCase, final String os)
    {
        super(IPAD_PURPOSE);

        this.hasCase         = hasCase;
        this.opSystemVersion = os;
    }

    /**
     * Getter for whether the IPad has a case.
     * @return a boolean; true if has a case, otherwise false.
     */
    final public boolean getHasCase()
    {
        return this.hasCase;
    }

    /**
     * Getter for operating system version.
     * @return the operating system version as a String.
     */
    final public String getOpSystemVersion()
    {
        return this.opSystemVersion;
    }

    /**
     * Setter for whether the IPad has a case or not.
     * @param x is a boolean.
     */
    final public void setHasCase(final boolean x)
    {
        this.hasCase = x;
    }

    /**
     * Setter for the operating software version.
     * @param os is the operating software version as a String.
     */
    final public void setOpSystemVersion(final String os)
    {
        this.opSystemVersion = os;
    }

    /**
     * Prints the IPad's details as a String.
     */
    final public void printDetails()
    {
        final String  purpose;
        final boolean hasCase;
        final String  os;

        purpose = this.getPurpose();
        hasCase = this.hasCase;
        os      = this.opSystemVersion;

        System.out.println(String.format("The purpose of this IDevice is %s.\nThis device has a case: %b.\nThe current operating system version is %s.\n", purpose, hasCase, os));
    }

    /**
     * Returns the IPad's details as a String.
     * @return the IPad's details as a String.
     */
    @Override
    public String toString()
    {
        final boolean hasCase;
        final String  os;

        hasCase = this.hasCase;
        os      = this.opSystemVersion;

        return super.toString() + String.format("This device has a case: %b.\nThe current operating system version is %s.\n", hasCase, os);
    }

    /**
     * IPads are equal if they have some operating system version.
     * @param o is the IPad object to be compared to.
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
        if(!(o instanceof IPad))
        {
            return false;
        }

        // cast only AFTER validating Object o is of class IPod
        final IPad that;
        that = (IPad) o;

        return this.opSystemVersion.equalsIgnoreCase(that.opSystemVersion);
    }

    /**
     * Returns a hashcode.
     *
     * @return a hashcode as an int.
     */
    @Override
    public int hashCode()
    {
        // FYI: for equal IPad objects, returns identical hashcode
        return Objects.hashCode(opSystemVersion);
    }

}
