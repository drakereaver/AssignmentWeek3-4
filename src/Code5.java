class Code5 {
    int linearFirst(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) if (arr[i].equals(target)) return i;
        return -1;
    }
    int linearLast(String[] arr, String target) {
        for (int i = arr.length - 1; i >= 0; i--) if (arr[i].equals(target)) return i;
        return -1;
    }
    int binarySearch(String[] arr, String target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = arr[mid].compareTo(target);
            if (cmp == 0) return mid;
            if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    int countOccurrences(String[] arr, String target) {
        int count = 0;
        for (String s : arr) if (s.equals(target)) count++;
        return count;
    }
}
