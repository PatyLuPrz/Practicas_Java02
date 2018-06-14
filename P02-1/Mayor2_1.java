public class Mayor2_1
{
    public String mayor(int n1, int n2)
    {
        if(n1>n2){
            return (""+n1);
        }
        else if(n2>n1){
            return (""+n2);
        }
        else{
            return ("Son iguales");
        }        
    }
    public static void main(String [] mppm)
    {
        Mayor2_1 objeto = new Mayor2_1();
        System.out.println(objeto.mayor(5,8));
        System.out.println(objeto.mayor(8,5));
        System.out.println(objeto.mayor(0,-8));
        System.out.println(objeto.mayor(-8,0));
        System.out.println(objeto.mayor(8,8));
    }
}
