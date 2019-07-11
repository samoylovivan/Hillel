package ivan.samoylov;

import java.util.Arrays;

public class IntArrayList implements IntList {

    private int[] arr = new int[10];
    private int size = 0;

    @Override
    public void add(int element) {
        if (size >= arr.length) {
            int newSize = arr.length * 3 / 2 + 1;
            int[] newArr = new int[newSize];
            for (int i = 0; i < size; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[size] = element;
        size++;
    }

    @Override
    public boolean add(int index, int element) {
        IntList tempList = new IntArrayList();
        if(index >=0 && index < size && size != 0){
            if(index + 1 != size) {
                tempList = this.subList(index, size -1);
            }
            else{
                tempList.add(arr[size - 1]);
            }
            arr[index] = element;
            size++;

            for (int i = index + 1, j = 0; i < size; i++, j++)
            {
                arr[i] = tempList.get(j);
            }
            return true;
        }

        return false;
    }



    @Override
    public void clear() {
       for(int i = 0; i < arr.length; i++){
           arr[i] = 0;
       }
       size = 0;
    }

    @Override
    public int get(int index) {
            return arr[index];
    }

    @Override
    public boolean isEmpty() {
        if (size == 0){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean remove(int index) {
        if(index >= 0 && index < size) {
            IntList tempList = new IntArrayList();
            if(index + 1 != size) {
                tempList = this.subList(index + 1, size - 1);
                for (int i = index, j = 0; i < size; i++, j++) {
                    arr[i] = tempList.get(j);
                }
                size--;
            }
            else{
                size--;
            }
            return true;
        }
        return false;
    }


    @Override
    public boolean removeByValue(int value) {
            int index = 0;
            boolean findValue = false;
            for (; index < arr.length; index++) {
                if (arr[index] == value) {
                    findValue = true;
                    break;
                }
            }
           if(findValue) {
               this.remove(index);
           }
           return findValue;
    }

    @Override
    public boolean set(int index, int element) {
        if(index >= 0 && index <= size){
            arr[index] = element;
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public IntList subList(int fromIndex, int toIndex) {
        IntList returnList = new IntArrayList();

        if (fromIndex >= 0 && fromIndex < size && fromIndex <= toIndex && toIndex < size){
            for (int i = fromIndex; i <= toIndex; i++){
                returnList.add(arr[i]);
            }
            return returnList;
        }

      return null;
    }

    @Override
    public int[] toArray() {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }

}