enum Status{
    Running,
    Failed,
    Pending,
    Success;
}

public class L1_Enum {
    public static void main(String[] args) {

        int i=5;
        Status s= Status.Success;
        System.out.println(s);
        System.out.println(s.ordinal());

        Status r=Status.Running;
        System.out.println(r);
        System.out.println(r.name());
        System.out.println(r.ordinal());

        Status[] ss=Status.values();
        System.out.println(ss[0]);

        for (Status x:ss){
            System.out.println(x+":"+x.ordinal());
        }

    }
}
