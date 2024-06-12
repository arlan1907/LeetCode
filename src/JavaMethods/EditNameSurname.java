package JavaMethods;

public class EditNameSurname {
    public static void main(String[] args) {
        String name = "ARSLAN";
        String surName = "NURLYYEV";
        
        String nameSurname = editName(name,surName);
        System.out.println(name + " " + surName);
        System.out.println(nameSurname);

    }

    public static String editName(String name, String surName) {
        String nameEdited = name.substring(0,1).toUpperCase()+ name.substring(1).toLowerCase();
        String surnameEdited = surName.substring(0,1).toUpperCase()+ surName.substring(1).toLowerCase();


        return nameEdited + " " + surnameEdited;
    }

}
