package geeksforgeeks.arrays.TheNew;

public class ArrayRotation {

    public int[] rotateArray(int[] inputArray, int rotations) {
        int numberOfElements = inputArray.length;
        int[] rotatedArray = new int[numberOfElements];
        //1
        int j = 0;
        for (int i = numberOfElements - rotations; i < numberOfElements; i++) {
            rotatedArray[j] = inputArray[i];
            j++;
        }
        //2
        j = rotations;
        for (int i = 0; j < numberOfElements; i++) {
            rotatedArray[j] = inputArray[i];
            j++;
        }

        return rotatedArray;
    }

    //if working on just one array, we could only use one variable to do our work
    public void rotateByOne(int[] inputArray) {
        int temp = inputArray[0];
        for (int i = 0; i < inputArray.length - 1; i++) {
            inputArray[i] = inputArray[i + 1];
        }
        inputArray[inputArray.length - 1] = temp;
    }

}
