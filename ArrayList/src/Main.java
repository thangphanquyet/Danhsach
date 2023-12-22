import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
                // khởi tạo có phần tử
        ArrayList<Integer> lst1 = new ArrayList<>(5);
                    // khởi tạo với các phần tử sẵn có
        ArrayList<Integer> lst2 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
                    // add thêm phần tử
        ArrayList<Integer> lst3 = new ArrayList<>();
        lst3.add(4);
        lst3.add(5);
        lst3.add(6);
                // add vào vị trí chỉ định
        lst3.add(1,2);
        System.out.println(lst3);
                    //size trả về số phần tử
        System.out.println("Số phần tử l3 là: "+lst3.size());
                    // trả về giá trị tại vị trí chỉ định
        System.out.println("Chỉ số của phần tử thứ 0 là: "+lst3.get(0));
                    // xoá phần tủ tại vị ttris chỉ đinh
        lst3.remove(2);
        System.out.println("Chỉ số của phần tử 2 sau xoá là: "+lst3);
                    // xoá giá trị
        ArrayList<Integer> lst4 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        lst4.remove(Integer.valueOf(8));
        System.out.println("mảng sau xoá là: "+lst4);
                     //thay đổi thông tin tại vị trí chỉ định
        ArrayList<Integer> lst5 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        lst5.set(3,69);
        System.out.println("số phần tử sau thay đổi là: "+ lst5);
        boolean kiemtra = lst5.contains(4);
        System.out.println("mảng có chứ phần tử số 4: "+kiemtra);
                    //sắm sếp tăng dần
        MyList a = new MyList("a",4,"Cơm");
        MyList b = new MyList("b",2,"Lá ngón");
        MyList c = new MyList("c",7,"Ăn cứt");
        MyList d = new MyList("d",6,"nhịn");
        ArrayList<MyList> ll1 = new ArrayList<>();
        ll1.add(a);
        ll1.add(b);
        ll1.add(c);
        ll1.add(d);
        System.out.println("số phần tử của ll1 là: "+ ll1);
        Comparator<MyList> com = new Comparator<MyList>() {
            @Override
            public int compare(MyList o1, MyList o2) {
                return (o1.tuoi-o2.tuoi);
            }
        };
        Collections.sort(ll1, com);
        System.out.println("số phần tử của ll1 sau sx là: " + ll1);
        // tìm vị trí của mảng vị trí đầu tiên
        System.out.println("Vị chí của mảng l4 là: "+ll1.indexOf(d));
        for (int i = 0; i < ll1.size(); i++) {
//            if (ll1[i].getTen().){
            System.out.println("phần tử "+ i +" của ll1 có chứa a: " + ll1.get(i).getTen().equals("a"));
        }
        System.out.println("--------------------------------");
        for (int i = 0; i <ll1.size() ; i++) {
            int vl = ll1.get(i).getTuoi();
            System.out.println("phần tử tuổi thứ "+i+" là: "+ vl);

        }
    }
}
