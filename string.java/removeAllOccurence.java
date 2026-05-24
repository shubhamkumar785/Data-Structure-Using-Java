
public class removeAllOccurence {
    public static String removeOccurence(String str, String part) {

        while (str.contains(part)) {
            int index = str.indexOf(part);
            str = str.substring(0, index) + str.substring(index + part.length());

        }
        return str;
    }

    public static void main(String[] args) {
        String str = "daabcbaabcbc";
        String part = "abc";
        System.out.println(removeOccurence(str, part));
    }
}
