package com.stackroute;

public class ConsecutiveDigits {

    boolean checkStatus(String numArr[]) {
        int startNum = Integer.parseInt(numArr[0]) - Integer.parseInt(numArr[1]);
        if (startNum > 0)
            return true;
        return false;
    }

    String checkConsecutive(String numSeries, String numArr[]) {
        if (numArr.length == 7) {

            int flag = 0, current, prev = Integer.parseInt(numArr[0]);

            if (checkStatus(numArr)) {
                for (int i = 1; i < numArr.length; i++) {
                    if (numArr[i].matches("[0-9]+")) {
                        current = Integer.parseInt(numArr[i]);
                        if (prev > current) {
                            prev = current;
                        } else {
                            System.out.println (numSeries + " non consecutive order");
                            flag = 1;
                            break;
                        }
                    }
                }
                if (flag == 0) {
                    return (numSeries + " in consecutive order");
                }
            } else if (!checkStatus(numArr)) {
                for (int i = 1; i < numArr.length; i++) {
                    if (numArr[i].matches("[0-9]+")) {
                        current = Integer.parseInt(numArr[i]);
                        if (prev < current) {
                            prev = current;
                        } else {
                            System.out.println (numSeries + " non consecutive order");
                            flag = 1;
                            break;
                        }
                    }
                }
                if (flag == 0) {
                    return (numSeries + " in consecutive order");
                }
            }
        } else {
            return (numSeries + " non consecutive order");
        }return "Error";
    }
}
