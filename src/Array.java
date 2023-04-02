public class Array<T> {
    private T[] array;
    private int length;
    private int index;

    /**
     *
     * @param length - the number of values in the array
     */
    public Array(int length){
        this.length = length;
        this.array = (T[])new Object[length];
    }

    /**
     *
     * @param value - value to insert into array
     */
    public void insert(T value){
        // check if I am trying to index in an array that's full
        if(index == length - 1){
            // then create an array with a new size
            T[] newArray = (T[]) new Object[length * 2]; // use doubling approach
            // transfer values from old array to new array
            for(int i = 0; i < length; i++){
                newArray[i] = array[i];
            }
            // now update the size of the old array
            array = newArray;
            length = length * 2;
        }
        // now insert the value
        array[index] = value;
        index++;
    }

    /**
     *
     * @param index - index of the element you want to remove
     */
    public void removeAt(int index) throws IllegalAccessException {
        if(index < 0 || index >= this.length - 1){
            throw new IllegalAccessException();
        }
        // remove value by setting it to null
        for(int i = index; i < this.index; i++){
            array[i] = array[i + 1];
        }
        this.index--;
    }


    /**
     *
     * @param element - element to find the index of
     * @return pos - the position of the element (index)
     */
    public int indexOf(T element){
        int pos = 0;
        for(int i = 0; i < this.index; i++){
            if(array[i] == element){
                pos = i;
            } else {
                pos = -1;
            }
        }
        return pos;
    }

    /**
     *
     * @return builder - string representation of array
     */
    public void print(){
        for(int i = 0; i < this.length; i++){
            if(array[i] != null){
                System.out.println(array[i]);
            }
        }
    }
}
