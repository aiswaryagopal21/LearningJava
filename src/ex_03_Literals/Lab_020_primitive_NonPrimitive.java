package ex_03_Literals;

public class Lab_020_primitive_NonPrimitive {
    public static void main(String[] args) {
        //primitive data type - defined by java guys
        // max, min, size defined

        byte b = 10; // 1 byte  ->  8 bits
        int age = 45; // 4 byte  ->  32 bits
        /*
        Integer (int): Whole numbers (e.g., 1, 42).
        Floating-point (float/double): Decimal numbers (e.g., 3.14, 2.718).
        Character (char): A single character (e.g., 'A', '@').
        Boolean (bool): Represents true or false.
        String: Sometimes considered primitive in certain languages, it represents sequences of characters (e.g., "hello").
         */

        //no primitive data type = defined by users
        //no size , max, min
        String name = "My name is Aiswarya"; //String is a bunch of characters
        int[] arrays_of_items = new int[10]; // create an integer array with name and fixed size 10
        /*
        Arrays: A collection of elements of the same type (e.g., [1, 2, 3]).
        Classes/Objects: User-defined types with properties and methods.
        Structures: Similar to classes but often used for simpler objects.
        Lists/Queues/Stacks: Collections with specific data organization.
        Maps/Dictionaries: Key-value pairs.
         */

    }
}
