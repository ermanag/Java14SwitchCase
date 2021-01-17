package ermanetwork.switchcase;

public class SwitchCaseExample {

    public static void main(String[] args) {
        SwitchCaseExample switchCaseExample = new SwitchCaseExample();
        int result1 = switchCaseExample.swtichCase1("A");
        int result2 = switchCaseExample.swtichCase2("B");
        int result3 = switchCaseExample.swtichCase3("C");

        System.out.println("result1 :" + result1);
        System.out.println("result2 :" + result2);
        System.out.println("result3 :" + result3);
    }

    public int swtichCase1(String str) {
        var result = switch (str) {
            case "A" -> 1;
            case "B" -> 2;
            case "C" -> 3;
            case "D" -> 4;
            default -> throw new IllegalStateException("Unexpected value: " + str);
        };

        return result;
    }

    public int swtichCase2(String str) {
        int result;
        switch (str) {
            case "A" -> result = 1;
            case "B" -> result = 2;
            case "C" -> {
                result = 3;
                System.out.println("3!");
            }
            default -> {
                System.err.println("Unexpected value: " + str);
                result = -1;
            }
        }

        return result;
    }

    public int swtichCase3(String str) {
        var result = switch (str) {
            case "A" -> 1;
            case "B" -> 2;
            case "C" -> 3;
            case "D", "E", "F" -> 4;
            default -> 5;
        };

        return result;
    }
}
