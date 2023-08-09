package test5;

/**
 * Description:
 * Param:
 * return:
 * Author:boker
 * Date:
 */
public class test {//可以看出实参并没有任何变化，其实直接传递引用和直接传递一个指针是一样的，
    // 传递进去的只是实参的一个拷贝值，赋值运算符只是让引用指向了一个新对象，其本身是没有任何影响的。
    // 其实也就是num1此时指向的是一个新的地址（这块地址存的是10），而num指向的还是原来那块地址（还是1）。
    // （如果想要传进去后有改变的话，就得提供一个改变自身的方法，
    // 例如上例中可以在Number类里设置一个Setter的方法）
    public static void main(String[] args) {
        Number num = new Number(1);
        System.out.println(num.getNum());
        change(num);
//        num.setNum(10);
        System.out.println(num.getNum());
    }
    public static void change(Number num1) {
        num1 = new Number(10);
    }
}

