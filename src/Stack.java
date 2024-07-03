/**
 * The Receipt class represents a receipt entry with an action and corresponding information detail.
 * It provides methods to initialize a receipt entry and retrieve its action and information.
 *
 * @author DT
 * Created on 07/02/2024
 */
class Receipt {
    private String action;
    private String info;

    /**
     * Constructs a Receipt object with the specified action and detail information.
     *
     * @param action The action description for the receipt entry
     * @param detail The detailed information related to the action
     */
    public Receipt(String action, String detail) {
        this.action = action;
        this.info = detail;
    }

/**
 * Retrieves the action description from the receipt entry.
 *
 * @return The action description
 */
 public String getAction() {
        return action;
    }

    /**
     * Retrieves the detailed information from the receipt entry.
     *
     * @return The detailed information
     */
    public String getinfo() {
        return info;
    }

    /**
     * Returns a string representation of the Receipt object.
     *
     * @return A string containing the action and information of the receipt entry
     */
    @Override
    public String toString() {
        return action + ": " + info;
    }
}