public class Array {
    private int[] data;
    private int size;

    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    public Array() {
        this(10);
    }

    //获取数组当前使用大小
    public int getSize() {
        return size;
    }

    //获取数组的容量
    public int getCapacity(){
        return this.data.length;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public void addLast(int e){
//        if (size == data.length){
//            throw new IllegalArgumentException("add last failed. array is full");
//        }
//        data[size] = e;
//        size++;
        add(size,e);
    }

    public void addFirst(int e){
        add(0, e);
    }

    public void add(int index,int e){
        if (size == data.length){
            throw new IllegalArgumentException("add failed. array is full");
        }

        if (index < 0 || index > data.length){
            throw new IllegalArgumentException("add failed. array is index >0 and index < data.length");
        }
        //index后面的后移之后插入到对应位置
        for (int i = size-1; i >= index ; i--) {
            data[i+1] = data[i];
        }
        data[index] = e;
        size++;
    }
}
