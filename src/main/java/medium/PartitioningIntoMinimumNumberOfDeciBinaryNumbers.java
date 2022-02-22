package medium;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {

    public int minPartitions(String n) {
        char maxChar = '0';
        for (char elem : n.toCharArray()) {
            if (elem > maxChar) {
                maxChar = elem;
            }
        }
        return Integer.parseInt(String.valueOf(maxChar));
    }
}
