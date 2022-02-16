
public class Code {

    public String code, name;

    public Code(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (!(obj instanceof Code))
            return false;

        Code tempObj = (Code) obj;

        return ( this.code.equals(tempObj.code) );
    }

    public String getName() {
        return this.name;
    }

    public String getCode() {
        return this.code;
    }


}