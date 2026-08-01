package Arrays;

public class merge3Sorted {
    public static void main(String[] args) {
        int a[] = { 12, 56, 33, 10 };
        int b[] = { 56, 90, 34, 12 };
        int c[] = { 23, 9, 31, 67 };

        int d[] = new int[a.length + b.length + c.length];

        for (int ele : d) {
            System.out.print(ele + " ");
        }
        System.out.println();

        merge(d, a, b, c);

        for (int ele : d) {
            System.out.print(ele + " ");
        }
    }

    private static void merge(int[] d, int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0, l = 0;

        // Step 1: merge all 3
        while (i < a.length && j < b.length && k < c.length) {
            if (a[i] <= b[j] && a[i] <= c[k]) {
                d[l++] = a[i++];
            } else if (b[j] <= a[i] && b[j] <= c[k]) {
                d[l++] = b[j++];
            } else {
                d[l++] = c[k++];
            }
        }

        // Step 2: merge any 2 remaining arrays

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                d[l++] = a[i++];
            } else {
                d[l++] = b[j++];
            }
        }

        while (j < b.length && k < c.length) {
            if (b[j] <= c[k]) {
                d[l++] = b[j++];
            } else {
                d[l++] = c[k++];
            }
        }

        while (i < a.length && k < c.length) {
            if (a[i] <= c[k]) {
                d[l++] = a[i++];
            } else {
                d[l++] = c[k++];
            }
        }

        // Step 3: copy remaining 1 array

        while (i < a.length) {
            d[l++] = a[i++];
        }

        while (j < b.length) {
            d[l++] = b[j++];
        }

        while (k < c.length) {
            d[l++] = c[k++];
        }
    }
}
