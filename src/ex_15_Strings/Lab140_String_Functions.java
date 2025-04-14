package ex_15_Strings;

public class Lab140_String_Functions {
    public static void main(String[] args) {
        String name="Sidhu";
        System.out.println(name.length());//1 2 3 4 5 ....
        System.out.println(name.charAt(4));// 0 1 2 3 4....
        //System.out.println(name.charAt(10));//StringIndexOutOfBoundException

        //2. Concat
        System.out.println(name.concat("Hara"));

        //3. Contains
        System.out.println(name.contains("ai"));

        //4. equals
        System.out.println(name.equals("Sidhu"));
        System.out.println(name.equals("Hara"));

        //5. equalsIgnoreCase
        System.out.println(name.equalsIgnoreCase("sidhu"));
        System.out.println(name.equalsIgnoreCase("hara"));

        //6. IndexOf
        System.out.println(name.indexOf('u'));//first occurrence of the specified sub string
        System.out.println(name.indexOf('H'));

        //7. length
        System.out.println(name.length());

        //8. replace( , )
        String r1=name.replace('S','s');
        System.out.println(r1);
        System.out.println(name);

        //9. split
        String email="aiswaryagopal@gmail.com";
        String[] split1 = email.split("@");
        System.out.println(split1[0]);
        System.out.println(split1[1]);

        //10. substring
        System.out.println(name.substring(1,3));

        //11. lower case
        System.out.println(name.toLowerCase());

        //12. upper case
        System.out.println(name.toUpperCase());

        //13. startswith
        System.out.println(name.startsWith("S"));

        //14. ends with
        System.out.println(name.endsWith("u"));

        //15. trim
        String school="  Hillfort   school   ";
        String school1="  Hillfort    ";
        System.out.println(school.trim());
        System.out.println(school1.trim());

        //16. compare to
        System.out.println(name.compareTo("Sidhu"));

        StringBuilder s1=new StringBuilder();

        String a1="Sidhu";
        String a2="Hara";
        String a3="Juwin";
        System.out.println(a1+a2+a3 );
    }
}
