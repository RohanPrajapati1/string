public class StrMethod{
    public static void main(String[] args){
      String str=new String("Rohan");
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.equals("rohan"));
        System.out.println(str.equalsIgnoreCase("rohan"));
        System.out.println(str.contains("Han"));
        System.out.println(str.contentEquals("Han"));
        String str2="  rohhan  ";
        System.out.println(str2.trim());
        //return int 0 if same with case
        System.out.println(str.compareTo("Rohan"));

        System.out.println(str.substring(3));
        System.out.println(str.substring(2,5));
        System.out.println(str.replace('R','M'));
        System.out.println(str.replace("han","man"));
        System.out.println(str.replace("n","man"));
        System.out.println(str.replace("han","m"));
        System.out.println(str.startsWith("ro"));
        System.out.println(str.endsWith("An"));
        System.out.println(str.indexOf("ha"));
        System.out.println(str.indexOf("o",2));

        //search from last
        System.out.println(str.lastIndexOf("han"));
        String str3="rohananan";
        System.out.println(str3.lastIndexOf("an"));
        System.out.println(str3.lastIndexOf("an",6));
       //return boolean
        String str4="";
        System.out.println(str.isEmpty());
        System.out.println(str4.isEmpty());
        System.out.println(str4.isBlank());

        String str5="rohann";
        System.out.println(str5.repeat(2));



    }
    }