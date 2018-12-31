package com.第4章.数组;


import java.util.Random;
import java.util.Scanner;

public class MoreArray {

    /*璇惧爞缁冧範*/
    // 涓�缁存暟缁勯殢鏈虹敓鎴�?(10浠ュ�?)
    public static int[] getRandomOneArray(int length) {
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }

    // 浜岀淮鏁扮粍闅忔�?鐢熸�?(10浠ュ�?)
    public static int[][] getRandomTwoArray(int length1, int length2) {
        Random random = new Random();
        int[][] array = new int[length1][length2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
        return array;
    }

    // 灞曠ず浜�?淮鏁扮粍
    public static void showTwoArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // 浜岀淮鏁扮粍杞竴缁存暟缁�
    public static int[] twoArrayToOneArray(int array[][]) {
        int arrayResult[] = new int[array.length * array[0].length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arrayResult[index++] = array[i][j];
            }
        }
        return arrayResult;
    }

    // 鐭╅�?涔樻�?
    public static int[][] multiplyArray(int array1[][], int array2[][]) {
        if (array1.length != array2[0].length)
            return null;
        int arrayResult[][] = new int[array1.length][array1[0].length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                for (int k = 0; k < array1.length; k++) {
                    arrayResult[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }
        return arrayResult;
    }

    // 鐭╅�?缈昏�?
    public static int[][] reverseArray(int[][] array) {
        int[][] arrayResult = new int[array.length][array[0].length];
        int dst = array.length - 1;
        for (int i = 0; i < array.length; i++, dst--) {
            for (int j = 0; j < array[0].length; j++) {
                arrayResult[j][dst] = array[i][j];
            }
        }
        return arrayResult;
    }

    /*涔︽湰涔犻*/
    // p70.no5
    public static void question5() {
        boolean isFull = false;
        Random random = new Random();
        // 鍒濆鍖�?
        boolean[][] airPlaneChair = new boolean[13][6];
        for (int i = 0; i < airPlaneChair.length; i++) {
            for (int j = 0; j < airPlaneChair[0].length; j++) {
                airPlaneChair[i][j] = false;
            }
        }
        // 鎻愮ず杈撳叆
        Scanner keyboard = new Scanner(System.in);
        int userChoice = 0;
        while (!isFull) {
            // 杈撳嚭搴т綅淇℃伅
            isFull = true;
            for (int i = 0; i < airPlaneChair.length; i++) {
                System.out.print("绗�" + (i + 1) + "鎺�:\t");
                for (int j = 0; j < airPlaneChair[0].length; j++) {
                    if (airPlaneChair[i][j]) {
                        System.out.print("#\t");
                    } else {
                        System.out.print("*\t");
                        isFull = false;
                    }
                }
                System.out.println();
            }
            if (isFull) {
                System.out.println("寰堟姳姝夛紝璇ラ鏈哄凡缁忔病鏈夊骇浣嶄�?");
                break;
            }
            // 杈撳叆閫夋嫨淇℃�?
            System.out.println("椋炴�?鍏辨�?13鎺掑骇浣嶏紝姣忔�?6涓骇浣嶏紝绗竴浜屾帓鏄ご绛夎埍锛屽叾浣欐槸缁忔祹鑸�?");
            System.out.println("鎸�1琛ㄧず璐拱澶寸瓑鑸憋紝鎸�2琛ㄧず璐拱缁忔祹鑸憋紝鎸夊叾浣欐暟瀛椾唬琛ㄩ��鍑鸿喘绁ㄧ郴缁燂紒");
            userChoice = keyboard.nextInt();
            int rows, cols;
            if (userChoice == 1) { // 澶寸瓑鑸�?
                boolean isOrdered1 = false;
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < airPlaneChair[0].length; j++) {
                        if (!airPlaneChair[i][j])
                            isOrdered1 = true;
                    }
                }
                if (!isOrdered1) {
                    System.out.println("鎶辨瓑锛屽ご绛夎埍宸叉弧锛�");
                    break;
                } else {
                    rows = random.nextInt(2);
                    cols = random.nextInt(6);
                    while (airPlaneChair[rows][cols]) {
                        rows = random.nextInt(2);
                        cols = random.nextInt(6);
                    }
                    System.out.println("鎭枩锛岃璐垚鍔燂紒鎮ㄧ殑鏈虹エ搴т綅鍙蜂负锛�?" + (rows + 1) + "鎺�" + (cols + 1) + "鍒�");
                    System.out.println("绁濇偍鏃呴��?剦蹇紒");
                    airPlaneChair[rows][cols] = true;
                    isOrdered1 = false;
                }
            } else if (userChoice == 2) { // 缁忔祹鑸�?
                boolean isOrdered2 = false;
                for (int i = 2; i < airPlaneChair.length; i++) {
                    for (int j = 0; j < airPlaneChair[0].length; j++) {
                        if (!airPlaneChair[i][j])
                            isOrdered2 = true;
                    }
                }
                if (!isOrdered2) {
                    System.out.println("鎶辨瓑锛�?粡娴庤埍宸叉弧锛�?");
                    break;
                } else {
                    rows = random.nextInt(5) + 2;
                    cols = random.nextInt(6);
                    while (airPlaneChair[rows][cols]) {
                        rows = random.nextInt(2) + 2;
                        cols = random.nextInt(6);
                    }
                    System.out.println("鎭枩锛岃璐垚鍔燂紒鎮ㄧ殑鏈虹エ搴т綅鍙蜂负锛�?" + (rows + 1) + "鎺�" + (cols + 1) + "鍒�");
                    System.out.println("绁濇偍鏃呴��?剦蹇紒");
                    airPlaneChair[rows][cols] = true;
                    isOrdered2 = false;
                }
            } else {
                System.out.println("娆㈣繋涓嬫浣跨敤璐エ绯荤粺锛�?");
                break;
            }
            keyboard.close();
        }
    }

    // p70.no6
    static double wrongResult = -9999;
    static int wrongIndex = -1;

    public static void question6() {
        // 鍒濆鍖�?
        double[][] temArray = new double[12][3];
        for (int i = 0; i < temArray.length; i++) {
            for (int j = 0; j < temArray[i].length; j++) {
                temArray[i][j] = -1;
            }
        }
        // 鎿嶄綔娴佺▼
        Scanner keyboard = new Scanner(System.in);
        int opera;
        double month, temHigh, temLow;
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("=======================");
            System.out.println("鎸夌収浠ヤ笅杈撳叆鎸囦护杩涜鎿嶄綔锛�");
            System.out.println("[1]娣诲姞鏁版嵁\n[2]鏌ヨ涓�骞翠腑鏈�楂樻皵娓╃殑骞冲潎鍊糪n[3]鏌ヨ涓�骞翠腑鏈�浣庢皵娓╃殑骞冲潎鍊�?" +
                    "\n[4]鏁扮粍涓渶楂樻皵娓╃殑绱㈠紩\n[5]鏁扮粍涓渶浣庢皵娓╃殑绱㈠紩\n[6]鏌ヨ鏁扮粍涓坊鍔犳儏鍐�");
            System.out.println("鍏朵綑鏁板瓧浠ｈ〃閫�鍑�?");
            opera = keyboard.nextInt();
            switch (opera) {
                case 1:
                    System.out.println("璇疯緭鍏ヤ綘鎯虫坊鍔犵殑鏈堜唤锛�?");
                    month = keyboard.nextDouble();
                    while (month > 13 || month < 0) {
                        System.out.println("鏍煎紡鏈夎锛岃閲嶆柊杈撳�?");
                        month = keyboard.nextDouble();
                    }
                    System.out.println("璇疯緭鍏ヤ綘鎯虫坊鍔犺鏈堢殑鏈�楂樻皵娓╋�?");
                    temHigh = keyboard.nextDouble();
                    System.out.println("璇疯緭鍏ヤ綘鎯虫坊鍔犺鏈堢殑鏈�浣庢皵娓╋�?");
                    temLow = keyboard.nextDouble();
                    getData(temArray, month, temHigh, temLow);
                    break;
                case 2:
                    if (averageHeight(temArray) != wrongResult) {
                        System.out.println("涓�骞翠腑鏈�楂樻皵娓╃殑骞冲潎鍊间负锛�?" + averageHeight(temArray));
                    } else {
                        System.out.println("鎶辨瓑锛屾棤娉曡绠楋紝鍙兘鍥犱负鏈坊鍔犲畬姣�");
                    }
                    break;
                case 3:
                    if (averageLow(temArray) != wrongResult) {
                        System.out.println("涓�骞翠腑鏈�浣庢皵娓╃殑骞冲潎鍊间负锛�?" + averageLow(temArray));
                    } else {
                        System.out.println("鎶辨瓑锛屾棤娉曡绠楋紝鍙兘鍥犱负鏈坊鍔犲畬姣�");
                    }
                    break;
                case 4:
                    if (indexHighTemp(temArray) != wrongIndex) {
                        System.out.println("涓�骞翠腑鏈�楂樻皵娓╃殑绱㈠紩鍊间负锛�?" + indexHighTemp(temArray));
                    } else {
                        System.out.println("鎶辨瓑锛屾棤娉曡绠楋紝鍙兘鍥犱负鏈坊鍔犲畬姣�");
                    }
                    break;
                case 5:
                    if (indexLowTemp(temArray) != wrongIndex) {
                        System.out.println("涓�骞翠腑鏈�浣庢皵娓╃殑绱㈠紩鍊间负锛�?" + indexLowTemp(temArray));
                    } else {
                        System.out.println("鎶辨瓑锛屾棤娉曡绠楋紝鍙兘鍥犱负鏈坊鍔犲畬姣�");
                    }
                    break;
                case 6:
                    for (int i = 0; i < temArray.length; i++) {
                        System.out.println((int)temArray[i][0] + "鏈�, 鏈�楂樻皵娓�?: " + temArray[i][1] + "�?, 鏈�浣庢皵娓�?: "
                                + temArray[i][2] + "�?");
                    }
                    System.out.println("澶囨敞锛氭湀浠界殑鏁板�间负-1浠ｈ〃鏈坊鍔狅紝鏄垵濮嬪寲鐨勬暟鎹�");
                default:
                    if (opera > 6 || opera < 1)
                        isContinue = false;
                    break;
            }
        }
        System.out.println("绋嬪簭缁撴潫");
        keyboard.close();
    }

    /**
     * @Description: 璇诲彇鏁版嵁骞跺皢鏁版嵁瀛樺偍鍒颁簩缁存暟缁勪腑
     * @Param: [瀛樺偍鏁版嵁鐨勬暟缁�?, 鏈堜�?, 璇ユ�?鐨勬渶楂樻皵娓�, 璇ユ�?鐨勬渶浣庢皵娓
     * @return: void
     */
    public static void getData(double[][] array, double month, double temHigh, double temLow) {
        boolean isRepeat = false;
        boolean isSave = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] == month) {
                System.out.println("浜岀淮鏁扮粍宸茬粡�?�樺湪璇ユ湀鏁版嵁锛屽嵆灏嗚鐩栧師鏁版�?");
                array[i][1] = temHigh;
                array[i][2] = temLow;
                isRepeat = true;
                isSave = true;
            }
        }
        if (!isRepeat) {
            for (int i = 0; i < array.length; i++) {
                if (array[i][0] == -1) {
                    array[i][0] = month;
                    array[i][1] = temHigh;
                    array[i][2] = temLow;
                    isSave = true;
                    break;
                }
            }
        }
        if (isSave) {
            System.out.println("瀛樺偍鎴愬姛锛�");
        } else {
            System.out.println("鎶辨瓑锛屽瓨鍌ㄥけ璐�?");
        }
    }

    /**
     * @Description: 璁＄畻骞惰繑鍥炰竴骞翠腑鏈�楂樻皵娓╃殑骞冲潎鍊�?
     * @Param: [瀛樺偍鏁版嵁鐨勬暟缁�?
     * @return: 涓�骞翠腑鏈�楂樻皵娓╃殑骞冲潎鍊�
     */
    public static double averageHeight(double[][] array) {
        boolean isFull = true;
        double sum = 0;
        // 鍒ゆ柇鏁扮粍鏄惁宸叉弧
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] == -1)
                isFull = false;
        }
        // 鑻ュ凡婊★紝鍒欒绠�?
        if (isFull) {
            for (int i = 0; i < array.length; i++) {
                sum += array[i][1];
            }
            return sum / 12;
        } else {
            return wrongResult;
        }
    }

    /**
     * @Description: 璁＄畻骞惰繑鍥炰竴骞翠腑鏈�浣庢皵娓╃殑骞冲潎鍊�?
     * @Param: [瀛樺偍鏁版嵁鐨勬暟缁�?
     * @return: 涓�骞翠腑鏈�浣庢皵娓╃殑骞冲潎鍊�
     */
    public static double averageLow(double[][] array) {
        boolean isFull = true;
        double sum = 0;
        // 鍒ゆ柇鏁扮粍鏄惁宸叉弧
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] == -1)
                isFull = false;
        }
        // 鑻ュ凡婊★紝鍒欒绠�?
        if (isFull) {
            for (int i = 0; i < array.length; i++) {
                sum += array[i][2];
            }
            return sum / 12;
        } else {
            return wrongResult;
        }
    }

    /**
     * @Description: 杩斿洖鏁扮粍涓渶楂樻皵娓╃殑绱㈠紩
     * @Param: [瀛樺偍鏁版嵁鐨勬暟缁�?
     * @return: 鏁扮粍涓渶楂樻皵娓╃殑绱㈠�?
     */
    public static int indexHighTemp(double[][] array) {
        boolean isFull = true;
        double temHighest = 0;
        int index = 0;
        // 鍒ゆ柇鏁扮粍鏄惁宸叉弧
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] == -1)
                isFull = false;
        }
        // 鑻ュ凡婊★紝鍒欒绠�?
        if (isFull) {
            temHighest = array[0][1];
            for (int i = 0; i < array.length; i++) {
                if (array[i][1] > temHighest) {
                    temHighest = array[i][1];
                    index = i;
                }
            }
            return index;
        } else {
            return wrongIndex;
        }
    }

    /**
     * @Description: 杩斿洖鏁扮粍涓渶浣庢皵娓╃殑绱㈠紩
     * @Param: [瀛樺偍鏁版嵁鐨勬暟缁�?
     * @return: 鏁扮粍涓渶浣庢皵娓╃殑绱㈠�?
     */
    public static int indexLowTemp(double[][] array) {
        boolean isFull = true;
        double temLowest = 0;
        int index = 0;
        // 鍒ゆ柇鏁扮粍鏄惁宸叉弧
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] == -1)
                isFull = false;
        }
        // 鑻ュ凡婊★紝鍒欒绠�?
        if (isFull) {
            temLowest = array[0][2];
            for (int i = 0; i < array.length; i++) {
                if (array[i][1] < temLowest) {
                    temLowest = array[i][2];
                    index = i;
                }
            }
            return index;
        } else {
            return wrongIndex;
        }
    }

    public static void main(String[] args) {

        /*String separator = "-------------------------";
        int[][] twoArray = getRandomTwoArray(3, 3);
        System.out.println("鐢熸垚闅忔満浜岀淮鏁扮粍锛�");
        showTwoArray(twoArray);
        System.out.println("杞崲杩囩殑涓�缁存暟缁勶細" + Arrays.toString(twoArrayToOneArray(twoArray)));
        System.out.println("鐭╅�?缈昏浆涓猴細");
        showTwoArray(reverseArray(twoArray));

        System.out.println(separator);

        int[][] twoArray1 = getRandomTwoArray(3, 3);
        int[][] twoArray2 = getRandomTwoArray(3, 3);
        System.out.println("闅忔�?浜岀淮鏁扮粍1锛�");
        showTwoArray(twoArray1);
        System.out.println("闅忔�?浜岀淮鏁扮粍2锛�");
        showTwoArray(twoArray2);
        System.out.println("鐩镐箻缁撴灉锛�");
        showTwoArray(multiplyArray(twoArray1, twoArray2));*/
        // 浜岀淮鏁扮粍杞寲涓�缁存暟缁�
        // 澶氳竟褰㈤潰绉�
        // 鐭╅�?涔樻�?
        // 鐭╅�?鍙嶈�?
        // p70 No.5
        // question5();
        // p71 No.6
        question6();
    }


}
