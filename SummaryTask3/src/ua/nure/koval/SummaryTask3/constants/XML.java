package ua.nure.koval.SummaryTask3.constants;

/**
 * Holds entities declared in XSD document.
 *
 * @author M.Koval
 */
public enum XML {

    /* element names */
    MEDICINES("medicines"),
    MEDICINE("medicine"),
    NAME("name"),
    PHARM("pharm"),
    GROUP("group"),
    ANALOGS("analogs"),
    ANALOG_NAME("analogName"),
    VERSIONS("versions"),
    VERSION("version"),
    CERTIFICATE("certificate"),
    NUMBER("number"),
    START_DATE("startDate"),
    EXPIRATION_DATE("expirationDate"),
    REGISTERED_BY("registeredBy"),
    PACKAGE("package"),
    PACKAGE_TYPE("packageType"),
    AMOUNT("amount"),
    PRICE("price"),
    DOSAGE("dosage"),
    VALUE("value"),
    PERIOD("period");

    private final String value;

    XML(String value) {
        this.value = value;
    }

    /**
     * Determines if a name is equal to the string value wrapped by this enum element.<br/>
     * If a SAX/StAX parser make all names of elements and attributes interned you can use
     * <pre>return value == name;</pre> instead <pre>return value.equals(name);</pre>
     *
     * @param name string to compare with value.
     * @return value.equals(name)
     */
    public boolean equalsTo(String name) {
        return value.equals(name);
    }

    public String value() {
        return value;
    }
}

