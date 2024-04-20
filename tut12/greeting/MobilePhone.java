package PR2.tut12.greeting;

/**
 * A phone being characterized by attributes such as
 * manName, model, color, year, and guaranteed
 */
public class MobilePhone {
    // Attributes
    private String manName;
    private String model;
    private Color color;
    private int year;
    private boolean guaranteed;
    private String colorcode;

    // Operations

    public MobilePhone(String n, String m, Color c, int y, boolean g) throws NotPossibleException {
        if (!validateManName(n)) {
            throw new NotPossibleException("MobilePhone initialization: invalid manName: " + n);
        }
        if (!validateModel(m)) {
            throw new NotPossibleException("MobilePhone initialization: invalid model: " + m);
        }
        if (!validateColor(c)) {
            throw new NotPossibleException("MobilePhone initialization: invalid color: " + c);
        }
        if (!validateYear(y)) {
            throw new NotPossibleException("MobilePhone initialization: invalid year: " + y);
        }
        this.manName = n;
        this.model = m;
        this.color = c;
        setcolorCode(c);
        this.year = y;
        this.guaranteed = g;
    }

    public MobilePhone(String n, String m, char c, int y, boolean g) throws NotPossibleException {
        this(n, m, charToColor(c), y, g); // re-use a method overloading
    }

    private static Color charToColor(char c) {
        Color newColor;
        switch (c) {
            case 'R':
                newColor = Color.Red;
                break;
            case 'O':
                newColor = Color.Orange;
                break;
            case 'Y':
                newColor = Color.Yellow;
                break;
            case 'B':
                newColor = Color.Blue;
                break;
            case 'P':
                newColor = Color.Purple;
                break;
            default:
                newColor = null;
        }
        return newColor;
    }

    // Mutators
    public boolean setManName(String n) {
        if (validateManName(n)) {
            this.manName = n;
            return true;
        } else {
            return false;
        }
    }

    public boolean setColor(Color c) {
        if (validateColor(c)) {
            this.color = c;
            return true;
        } else {
            return false;
        }
    }

    public boolean setGuarantee(boolean g) {
        this.guaranteed = g;
        return true;
    }

    // Observers
    public String getManName() {
        return this.manName;
    }

    public String getModel() {
        return this.model;
    }

    public Color getColor() {
        return this.color;
    }

    public int getYear() {
        return this.year;
    }

    public boolean isGuaranteed() {
        return this.guaranteed;
    }

    // Helpers
    private boolean validateManName(String n) {
        // optional(manName) = false
        if (n == null || n.length() == 0) return false;
        // length(manName) = 30
        return n.length() <= 30;
    }

    private boolean validateModel(String m) {
        // optional(model) = false
        if (m == null || m.length() == 0) return false;
        // length(model) = 30
        if (m.length() > 30) return false;
        // model.match(/^M-[A-Z]{3}-[0-9]{3}$/)
        return m.matches("^M-[A-Z]{3}-[0-9]{3}$");
    }

    private boolean validateColor(Color c) {
        return c != null;
    }

    private boolean validateYear(int y) {
        return y >= 1970;
    }

    // Default methods
    // Example toString: "MobilePhone: <Samsung, S20, P, 2019, true>"
    @Override
    public String toString() {
        return "MobilePhone: <" + manName +
                ", " + model + ", " + color +
                ", " + year + ", " + guaranteed + '>';
    }

    @Override
    public boolean equals(Object obj) {
        // TODO: implement this
        return super.equals(obj);
    }

    @Override
    public Object clone() {
        return new MobilePhone(manName, model, color, year, guaranteed);
    }

    public boolean repOK() {
        return validateColor(color) && validateManName(manName)
                && validateModel(model) && validateYear(year);
    }


    public void  setcolorCode(Color color) {

        switch (color) {
            case Red:
                colorcode = "#FF0000";
                break;
            case Blue:
                colorcode = "#0000FF";
                break;
            case Orange:
                colorcode = "#FF8000";
                break;
            case Yellow:
                colorcode = "#FFFF00";
                break;
            case Purple:
                colorcode = "#FF00FF";
                break;
            default:
                colorcode = null;
        }


    }

    public String getColorCode() {
        return colorcode;
    }


}