package Lesson8;

public class ACopy {
    public static void main(String[] args) {

        int i;
        int nums1[] = {3, 9, 4, -2, -2, -6, -5, -2, 5, -1 };
//        int nums2[] = new int[10];
//
//        for (i = 0; i < nums1.length; i++) {
//            nums1[i] = i;
//        }

//        ArrayUtils.randomArray(nums1, -10, 10);

     // DO NOT DO THAT:
//        for (int element: nums2) {
//            element = 5;
//        }

//        System.out.println("num1: ");
//        ArrayUtils.showArray(nums1);
//        System.out.println("\nnum2 before copying: ");
//        ArrayUtils.showArray(nums2);
//        ArrayUtils.copyArray(nums1, nums2);
//        System.out.println("\nnum2 after copying: ");
//        ArrayUtils.showArray(nums2);
//
//        System.out.println("\nFOR EACH RESULT: ");
//
        ArrayUtils.showArray(nums1);

        System.out.println("\nSUM: ");

        System.out.println(ArrayUtils.sumElements(nums1, 2));
        System.out.println(ArrayUtils.sumElements(nums1));

        ArrayUtils.searchElement(nums1, -2);
    }
}
