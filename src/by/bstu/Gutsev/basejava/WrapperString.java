package by.bstu.Gutsev.basejava;

public class WrapperString {

    private String mString;

    public WrapperString(String string) {

        mString = string;
    }

    public String getString() {
        return mString;
    }

    public void setString(String string) {
        mString = string;
    }

    @Override
    public String toString() {
        return "WrapperString{" +
                "mString='" + mString + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WrapperString that = (WrapperString) o;

        return mString != null ? mString.equals(that.mString) : that.mString == null;
    }

    @Override
    public int hashCode() {
        return mString != null ? mString.hashCode() : 0;
    }

    public void replace(char oldchar, char newchar) {
        mString.replace(oldchar, newchar);
    }

    public void delete(char newchar)
    {

    }

}
