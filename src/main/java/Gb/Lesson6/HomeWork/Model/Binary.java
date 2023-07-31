package Gb.Lesson6.HomeWork.Model;

public class Binary<E> {

    public Binary() {
    }

    public StringBuilder conversion (String number) {
        StringBuilder binary = new StringBuilder();
        if (!number.matches("(-?\\d*\\.\\d*)")) {
            binary.append(Integer.toBinaryString(Integer.parseInt(number)));
        } else {
            Integer left = ((int) Math.floor(Double.parseDouble(number)));
            binary.append(Integer.toBinaryString(left) + ".");
            String num = number.replace(".", "");
            Integer right = Integer.valueOf(num);
            Integer afterDot = num.length() - left.toString().length();
            Double pow = Math.pow(10, afterDot);
            right = right - left * pow.intValue();
            for (int i = 0; i < 16; i++) {
                right *= 2;
                if (right == pow.intValue()) {
                    binary.append(1);
                    break;
                } else if (right < pow.intValue()) {
                    binary.append(0);
                } else if (right > pow.intValue()) {
                    binary.append(1);
                    right -= pow.intValue();
                }
            }

        }
        return binary;
    }
}
