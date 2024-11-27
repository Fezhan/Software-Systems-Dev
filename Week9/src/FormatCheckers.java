
public class FormatCheckers {
	public String checkStringFormat(Object string) {
        if (string instanceof String) {
            return string.toString();
        }
        return "Fail";
    }

    public int checkIntegerFormat(Object value) {
        try {
            if (value instanceof String) {
                int valid = Integer.parseInt((String) value);
                if (valid > 0) {
                    return valid;
                }
            }
        } catch (NumberFormatException e) {
            return -1; // Invalid integer format
        }
        return -1;
    }

}