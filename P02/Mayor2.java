public class Mayor2
{
    public int mayor(int n1, int n2)
    {
        if(n1>n2)
        {
            return n1;
        }
        else
        {
            return n2;
        }
    }
    public static void main(String [] mppm)
    {
        Mayor2 objeto = new Mayor2();
        System.out.println(objeto.mayor(5,8));
        System.out.println(objeto.mayor(8,5));
        System.out.println(objeto.mayor(-8,0));
        System.out.println(objeto.mayor(0,-8));
        System.out.println(objeto.mayor(8,8));
    }
}
