public class L13_String {
    public static void main(String[] args) {
        String name=new String("Kaushal");
        System.out.println("Name: "+name);
        System.out.println(name.charAt(2));


        String name1="kaushal";
        System.out.println("Name: "+name);
        System.out.println(name.charAt(2));



        //--Mutable vs immutable


        //----immutable String
        String str11="kaushal";
        String str12="kaushal";                         //value store in string connstant pool(Same reference)
        String str21=new String("kaushal");         //value store in heap(Different Reference)
        String str22=new String("kaushal");
        System.out.println(str22==str11);       //(str22 in heap and str 11 in scp) -->false
        System.out.println(str11==str12);       //(str11 scp and str 12  scp)-->true
        System.out.println(str21==str22);       //(str21 heap also str22)-->false(Differnet reference)
    }
}
