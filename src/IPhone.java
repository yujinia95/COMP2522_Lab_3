import java.util.Objects;

/**
 * IPhone is a child of IDevice.
 * <p>
 * Its purpose is "talking".
 * </p>
 * <p>
 * Provides getters for the minutes remaining on its plan, and its carrier. Overrides the toString method to print additional information (minutes remaining and carrier).
 * </p>
 * <p>
 * Overrides the equals and hashcode methods. IPods are equal if they have the same number of minutes remaining.
 * </p>
 */
public class IPhone extends IDevice
{
    private double minutesRemaining;
    private String carrier;

    static final String IPHONE_PURPOSE = "talking";
    static final double EPSILON        = 0.000001;

    /**
     * Constructor for IPhone.
     *
     * @param mins    is the number of minutes remaining as a double.
     * @param carrier is the carrier as a String.
     */
    public IPhone(final double mins, final String carrier)
    {
        super(IPHONE_PURPOSE);

        this.minutesRemaining = mins;
        this.carrier          = carrier;
    }

    /**
     * Getter for the number of minutes remaining.
     *
     * @return the number of minutes remaining as a double.
     */
    public final double getMinutesRemaining()
    {
        return this.minutesRemaining;
    }

    /**
     * Getter for the carrier.
     *
     * @return the carrier as a String.
     */
    public final String getCarrier()
    {
        return this.carrier;
    }

    /**
     * Sets the number of remaining minutes.
     *
     * @param min is the remaining minutes as a double.
     */
    public final void setMinutesRemaining(final double min)
    {
        this.minutesRemaining = min;
    }

    /**
     * Setts the carrier.
     *
     * @param carrier is the carrier as a String.
     */
    public final void setCarrier(final String carrier)
    {
        this.carrier = carrier;
    }

    /**
     * Prints the IPhone's details as a String.
     */
    final public void printDetails()
    {
        final String purpose;
        final double minsRemain;
        final String carrier;

        purpose    = this.getPurpose();
        minsRemain = this.minutesRemaining;
        carrier    = this.carrier;

        System.out.println(String.format("The purpose of this IDevice is %s.\nThis device has %f minutes remaining.\nThe carrier is %s.\n", purpose, minsRemain, carrier));
    }

    /**
     * Returns the IPhone's details as a String.
     *
     * @return the IPhone's details as a String.
     */
    @Override
    public String toString()
    {
        final double minsRemain;
        final String carrier;

        minsRemain = this.minutesRemaining;
        carrier    = this.carrier;

        return super.toString() + String.format("This device has %f minutes remaining.\nThe carrier is %s.\n", minsRemain, carrier);
    }

    /**
     * IPhones are equal if they have some number of remaining minutes.
     *
     * @param o is the IPhone object to be compared to.
     *
     * @return a boolean; true if equal otherwise false.
     */
    @Override
    public boolean equals(Object o)
    {

        if(o == null)
        {
            return false;
        }

        if(o == this)
        {
            return true;
        }

        if(!(o instanceof IPhone))
        {
            return false;
        }

        final IPhone that;
        that = (IPhone) o;

        return Math.abs((this.minutesRemaining - that.minutesRemaining)) < EPSILON;
    }

    /**
     * Returns a hashcode.
     *
     * @return a hashcode as an int.
     */
    @Override
    public int hashCode()
    {
        return Double.hashCode(minutesRemaining);
    }
}



