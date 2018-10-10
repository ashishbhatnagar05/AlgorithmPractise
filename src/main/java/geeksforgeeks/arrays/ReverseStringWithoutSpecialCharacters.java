package geeksforgeeks.arrays;

class ReverseStringWithoutSpecialCharacters {

    private static char[] process(char[] arr) {

        int first = 0, last = arr.length - 1;

        while (first < last) {
            if (!Character.isAlphabetic(arr[first])) {
                first++;
            } else if (!Character.isAlphabetic(arr[last])) {
                last--;
            }

            else {
                char ch = arr[first];
                arr[first] = arr[last];
                arr[last] = ch;
                first++;
                last--;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        String str = "A4%asd()sdasd";
        char[] arr = process(str.toCharArray());
        StringBuilder sb = new StringBuilder();
        for (char ch : arr) {
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}