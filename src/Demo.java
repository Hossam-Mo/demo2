public class Demo {
    private int x,y;

    public Demo(int x, int y){
        this.x=x;
        this.y=y;

    }


    public int biggerNum(){
        if(x>y){
            return x;
        }else{
            return y;
        }
    }

}
