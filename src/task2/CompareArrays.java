package task2;

public class CompareArrays {
    public static <T1, T2> boolean compareArrays(T1[] arr1, T2[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].getClass() != arr2[i].getClass()) {
                return false;
            }

        }
        return true;
    }
}
