
public class CRacional
{
    private int numerador;
    private int denominador;
    
    public void asignacion(int numerador,int denominador)
    {
        this.numerador = numerador;
        if(denominador>0)this.denominador= denominador;
    }
    public void visualizar()
    {
        System.out.println(numerador+"/"+denominador);
    }
    public void suma(CRacional a,CRacional b)
    {
        int Nnumerador =  (a.numerador*b.denominador)+(b.numerador*a.denominador);
        int Ndenominador = a.denominador*b.denominador;
        
        System.out.println(Nnumerador+"/"+Ndenominador);
    }
}
