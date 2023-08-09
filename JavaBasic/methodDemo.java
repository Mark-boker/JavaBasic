package JavaBasic;


public class methodDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 66, 44, 68, 77, 95, 12, 42};
        int[] copyArr = CopyRange(arr, 3, 7);//返回数组类型,需要直接赋值，直接调用是不行的CopyRange(arr,3,7)
        for (int i = 0; i < copyArr.length; i++) {
            System.out.println(copyArr[i]);
        }
    }


    public static int[] CopyRange(int arr[], int from, int to) {//返回数组类型

        int[] arr1 = new int[to - from];
        int index = 0;
        for (int n = from; n < to; n++) {
            arr1[index] = arr[n];
            index++;
        }

        return arr1;
    }

    public static void me1(int[] arr) {//数组shi引用数据类型是直接把地址传进来，形参改变影响实际参值
        arr[1] = 200;

    }

    public static int me2(int a) {//基本数据类型形参改变不影响实际参值，需要赋值int a =me2(a)样式
        a = 200;
        return a;
    }
}
