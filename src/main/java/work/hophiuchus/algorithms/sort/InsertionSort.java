package work.hophiuchus.algorithms.sort;


public class InsertionSort implements SortStrategy {

    public int[] sort(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        int[] sortedArr = new int[arr.length];
        int tmp;
        sortedArr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] < sortedArr[j]) {
                    sortedArr[j + 1] = sortedArr[j];
                } else {

                    sortedArr[j + 1] = arr[i];
                    break;
                }
                if (j == 0) {
                    sortedArr[0] = arr[i];
                }

            }
        }

        return sortedArr;
    }

    public int[] sort2(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (tmp < arr[j]) {
                    arr[j + 1] = arr[j];
                } else {
                    arr[j + 1] = tmp;
                    break;
                }
                if (j == 0) {
                    arr[0] = tmp;
                }

            }
        }

        return arr;
    }
}
