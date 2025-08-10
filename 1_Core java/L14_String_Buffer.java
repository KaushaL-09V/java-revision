public class L14_String_Buffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Kaushal");
        System.out.println(sb);
        sb.append(" Vadher");
        System.out.println(sb);

        System.out.println(sb.charAt(4));
        System.out.println(sb.delete(0,2));
        System.out.println(sb);
        System.out.println(sb.reverse());

    }
}
