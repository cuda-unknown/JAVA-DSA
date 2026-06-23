class day5 {

    public static int BS(int arr[], int key) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == key)
                return arr[mid];
            else if (arr[mid] < key)
                s = mid + 1;
            else
                e = mid - 1;
        }
        return -1;
    }

    public static int revArray(int arr2[]) {
        int s = 0;
        int e = arr2.length - 1;
        while (s <= e) {
            int temp = arr2[s];
            arr2[s] = arr2[e];
            arr2[e] = temp;
            s++;
            e--;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        return 0;
    }

    public static void pairs(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print(("[" + arr[i] + "," + arr[j] + "]") + " ");
            }
            System.out.println(" ");
        }
    }

    public static Boolean palindrome(String name) {
        int n = name.length();
        for (int i = 0; i < n - 1 - i; i++) {
            if (name.charAt(i) != name.charAt(n - 1 - i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("hi ");
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 77;
        System.out.println(BS(arr, key));
        int arr2[] = { 1, 3, 5, 7, 45, 55, 67, 89, 90 };

        System.out.println(revArray(arr2));

        pairs(arr);

        String name = "dag";
        System.out.println(palindrome(name));

    }
}