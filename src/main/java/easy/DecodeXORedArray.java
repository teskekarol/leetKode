package easy;

public class DecodeXORedArray {

    public int[] decode(int[] encoded, int first) {
        var arr = new int[encoded.length + 1];
        arr[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            arr[i + 1] = arr[i] ^ encoded[i];
        }
        return arr;
    }

}
