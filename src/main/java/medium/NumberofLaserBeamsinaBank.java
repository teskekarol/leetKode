package medium;

public class NumberofLaserBeamsinaBank {

    public int numberOfBeams(String[] bank) {
        var sum = 0;

        for (int i = 0; i < bank.length; i++) {
            var row = countOnes(bank[i]);

            if (row == 0) continue;

            for (int j = i + 1; j < bank.length; j++) {
                if (countOnes(bank[j]) != 0) {
                    sum += row * countOnes(bank[j]);
                    break;
                }
            }
        }
        return sum;
    }

    private int countOnes(String s) {
        return s.replace("0", "").length();
    }

}
