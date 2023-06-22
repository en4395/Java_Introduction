/*Here's an example of a generic class. ArrayOfSomething has three variables: myData (an array of data
of a type given by the type parameter), arraySize (holds the size of the array), and a static variable*/
public class ArrayOfSomething <T>{

    //Data members
    private T[] myData;
    private int arraySize;
    static final float version = 1.20f;
    //"version" is static–it belongs to the entire class and is not fixed to an object.
    //"version" is also final, so may not be reassigned

    //Class constructor
    public ArrayOfSomething (T[] data){
        myData = data;
        arraySize = data.length;
    }

    //Print method
    public void printArray(){
        for(int i = 0; i < arraySize; i++){
            System.out.print(myData[i]+" ");
        }
    }
}
