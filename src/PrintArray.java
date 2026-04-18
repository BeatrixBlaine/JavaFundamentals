public class PrintArray {
    public static void printArray(Object array) {
        if (array == null) return;

        // Check if it's NOT an array → base case (actual value)
        if (!array.getClass().isArray()) {
            System.out.print(array + " ");
            return;
        }

        // If it IS an array → go deeper
        int length = java.lang.reflect.Array.getLength(array);

        for (int i = 0; i < length; i++) {
            Object element = java.lang.reflect.Array.get(array, i);
            printArray(element);
        }

        System.out.println(); // spacing
    }

    public static void main(String[] args) {
            // print an array data any type
        String[][][][][] data = {
                {
                            {
                                    { {"A", "B"}, {"C", "D"} },
                                    { {"E", "F"}, {"G", "H"} }
                            }
                            },
                    {
                            {
                                    { {"I", "J"}, {"K", "L"} },
                                    { {"M", "N"}, {"O", "P"} }
                            }
                    }
            };

            printArray(data);



        int[][][][][] nums = {
                {
                        {
                                {
                                        {1,2,3},{2,7,8},{2,9,0}
                                },
                                {
                                        {7,8,1},{3,1,6},{6,7,9}
                                }
                        }
                }
        };

        int[][][][][] num2 = {
                {
                        {
                                {
                                        {1,4,5}, {7,4,1}
                                }
                        }
                },
                {
                        {
                                {
                                        {1,8,9}, {1,5,6}
                                }
                        }
                }
        };

        printArray(nums);
        printArray(num2);


    }

}

