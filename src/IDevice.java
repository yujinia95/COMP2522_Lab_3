/**
 * Represents a device in the Apple ecosystem.
 * <p>
 * Its constructor sets up the device's purpose.
 * </p>
 * <p>
 * Provides getters for purpose, and overrides toString to print its instance variables.
 * </p>
 * <p>
 * Provides abstract methods for printing details, equals, and hashcode.
 * </p>
 *  * @author Neriyel Reyes
 *  * @author Yujin Jeong
 *  * @version 1.0
 */
public abstract class IDevice
{
    private final String purpose;

    /**
     * Constructor for IDevice, called when its subclass is instantiated.
     *
     * @param purpose is the device's purpose as a String.
     */
    public IDevice(final String purpose)
    {
        this.purpose = purpose;
    }

    /**
     * Getter method for the devices' purpose.
     *
     * @return purpose as a String
     */
    public final String getPurpose()
    {
        return this.purpose;
    }

    /**
     * Abstract method for printing the child classes' details.
     */
    public abstract void printDetails();

    /**
     * Override's the toString method; returns the IDevice's purpose as a String.
     *
     * @return the device's purpose as a String.
     */
    @Override
    public String toString()
    {
        final String purpose;

        purpose = this.purpose;

        return String.format("The purpose of this IDevice is %s.\n", purpose);
    }

    /**
     * Abstract method that compares equality of two IDevices.
     *
     * @param obj
     *
     * @return
     */
    @Override
    abstract public boolean equals(Object obj);

    /**
     * Abstract method that returns the hashcode of IDevices.
     *
     * @return
     */
    @Override
    abstract public int hashCode();

}
