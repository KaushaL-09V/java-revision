class Computer{
    public void playmusic(){
        System.out.println("Music......");
    }
    public String GetPen(int value){
        if(value<10){
            return "Pen";
        }
        return "Pencil";
    }
}
public class L5_Method {
    public static void main(String[] args) {
        Computer cmp=new Computer();
        cmp.playmusic();
        System.out.println(cmp.GetPen(20));

    }
}
