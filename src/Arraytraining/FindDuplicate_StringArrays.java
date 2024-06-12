package Arraytraining;

public class FindDuplicate_StringArrays {
    public static void main(String[] args) {
        String[] my_array = {"jimi", "arslan","bayram","jimi","bayram","guga"};

        for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if ((my_array[i].equals(my_array[j])) && (i != j))
                {
                    System.out.println("Duplicate Element : "+my_array[j]);
                }
            }
        }
    }
}
