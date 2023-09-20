public class PTbacnhat{
    private int a,b;
   
    public PTbacnhat() {
        this.a = 0;
        this.b = 0;
    }
   
    public PTbacnhat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
   
    public double GiaiPT(){
        if(this.a==0){
            if(this.b==0){
                return Double.POSITIVE_INFINITY;
            }
            else{
                return Double.NEGATIVE_INFINITY;
            }
        }
        else{
            return -this.b/this.a;
        }
    }
   
}
class Demo6 {
    public static void main(String[] args) {
        PTbacnhat pt1 = new PTbacnhat(0,0);
        if(pt1.GiaiPT()==Double.POSITIVE_INFINITY){
            System.out.println("Phuong trinh vo so nghiem");
        }
        else if(pt1.GiaiPT()==Double.NEGATIVE_INFINITY){
            System.out.println("Phuong trinh vo nghiem");
        }
        else{
            System.out.println("Phuong trinh co nghiem la:"+pt1.GiaiPT());
        }
       
    }
}