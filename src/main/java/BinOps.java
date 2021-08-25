public class BinOps {

    public String sum(String a, String b) {
    int intA = getInt(a);
    int intB = getInt(b);
    return Integer.toBinaryString(intA + intB);
    }

    public String mult(String a, String b) {
        int intA = getInt(a);
        int intB = getInt(b);
        return Integer.toBinaryString(intA * intB);
    }

    private int getInt(String a) {
        return Integer.parseInt(a, 2);
    }

}
