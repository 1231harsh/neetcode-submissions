class DynamicArray {
    int arr[];
    int pointer;
    public DynamicArray(int capacity) {
        arr=new int[capacity];
        pointer=-1;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i]=n;
    }

    public void pushback(int n) {
        if(pointer==arr.length-1){
            resize();
        }
        arr[++pointer]=n;
    }

    public int popback() {
        int res=arr[pointer];
        pointer--;
        return res;
    }

    private void resize() {
        int newArr[]=new int[2*arr.length];
        for(int i=0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
        arr=newArr;
    }

    public int getSize() {
        return pointer+1;
    }

    public int getCapacity() {
        return arr.length;
    }
}
