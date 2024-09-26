import java.util.Objects;

/**
 * IPod is a child of IPhone.
 * <p>
 * Its purpose is "talking".
 * </p>
 * <p>
 * Provides getters for whether it has a high resolution camera, and its memory storage in GB. Overrides the toString method to print additional information (high res camera and memory space).
 * </p>
 * <p>
 * Overrides the equals and hashcode methods. IPods are equal if they have the same camera resolution and same number of minutes remaining.
 * @author Neriyel Reyes
 * @author Yujin Jeong
 * @version 1.0
 * </p>
 */
public class IPhone16 extends IPhone
{
    private final boolean highResCamera;
    private final int     memoryGB;

    /**
     * Constructor for IPhone16.
     *
     * @param mins      is the number of minutes remaining as a double.
     * @param carrier   is the carrier as a String.
     * @param cameraRes is a boolean; true if high resolution camera, otherwise false.
     * @param memoryGB  is the memory storage in GB as an int.
     */
    public IPhone16(final double mins, final String carrier, final boolean cameraRes, final int memoryGB)
    {
        super(mins, carrier);

        this.highResCamera = cameraRes;
        this.memoryGB      = memoryGB;
    }

    /**
     * Getter for the high resolution camera feature.
     *
     * @return true if the device has a high resolution camera, false otherwise.
     */
    public boolean hasHighResCamera()
    {
        return highResCamera;
    }

    /**
     * Getter for the memory storage of the device.
     *
     * @return the memory storage of the device in GB.
     */
    public int getMemoryGB()
    {
        return memoryGB;
    }

    /**
     * Returns the IPhone16's details as a String.
     *
     * @return the IPhone16's details as a String.
     */
    @Override
    public String toString()
    {
        final boolean cameraReso;
        final int     memoryGB;

        cameraReso = this.highResCamera;
        memoryGB   = this.memoryGB;

        return super.toString() + String.format("This device has a high resolution camera: %b\nThis device has %d GB of memory.", cameraReso, memoryGB);
    }

    /**
     * IPhone16s are equal if they have the same camera resolution and some number of remaining minutes.
     *
     * @param o is the IPhone16 object to be compared to.
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

        if(!(o instanceof IPhone16))
        {
            return false;
        }

        final IPhone16 that;
        that = (IPhone16) o;

        // First check if camera resolutions match
        if(that.highResCamera != this.highResCamera)
        {
            return false;
        }

        return Math.abs(this.getMinutesRemaining() - that.getMinutesRemaining()) < EPSILON;
    }

    /**
     * Returns a hashcode.
     *
     * @return a hashcode as an int.
     */
    @Override
    public int hashCode()
    {
        return Objects.hashCode(this.getMinutesRemaining());
    }
}
