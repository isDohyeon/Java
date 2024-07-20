package level4.list;

public class MyListPerformanceMain {
    public static void main(String[] args) {

        int size = 50_000;

        System.out.println("ArrayList - 데이터 추가");
        addFirst(new MyArrayList<>(), size);
        addMid(new MyArrayList<>(), size);
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        addLast(arrayList, size);
        System.out.println();

        System.out.println("LinkedList - 데이터 추가");
        addFirst(new MyLinkedList<>(), size);
        addMid(new MyLinkedList<>(), size);
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        addLast(linkedList, size);
        System.out.println();
        int loop = 10_000;

        System.out.println("ArrayList - 데이터 검색");
        search(arrayList, loop, 0);
        search(arrayList, loop, size / 2);
        search(arrayList, loop, size - 1);
        System.out.println();
        System.out.println("LinkedList - 데이터 검색");
        search(linkedList, loop, 0);
        search(linkedList, loop, size / 2);
        search(linkedList, loop, size - 1);
        System.out.println();

        System.out.println("ArrayList - 데이터 조회");
        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, size / 2);
        getIndex(arrayList, loop, size - 1);
        System.out.println();
        System.out.println("LinkedList - 데이터 조회");
        getIndex(linkedList, loop, 0);
        getIndex(linkedList, loop, size / 2);
        getIndex(linkedList, loop, size - 1);
    }

    private static void search(MyList<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("검색 값 : " + findValue + ", 반복 : " + loop + ", 걸린 시간 : " + (endTime -startTime) + "ms");
    }

    private static void getIndex(MyList<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("조회 index : " + index + ", 반복 : " + loop + ", 걸린 시간 : " + (endTime - startTime) + "ms");
    }

    private static void addFirst(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 데이터 양 : " + size + ", 걸린 시간 : " + (endTime - startTime) + "ms");
    }

    private static void addMid(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i / 2, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("중간에 추가 - 데이터 양 : " + size + ", 걸린 시간 : " + (endTime - startTime) + "ms");
    }

    private static void addLast(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("마지막에 추가 - 데이터 양 : " + size + ", 걸린 시간 : " + (endTime - startTime) + "ms");
    }


}
