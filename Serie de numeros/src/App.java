public class App {
    public static void main(String[] args) throws Exception 
    {
        int _intX = 1;
        int _intY = 2;
        int _intCantidad = 10;
        int _intSuma = 0;
        int _intI = 0;
        System.out.println(_intX+"\n"+_intY);
        while (_intI!=_intCantidad) 
        {
            _intI++;
            _intSuma=_intX+_intY;
            System.out.println(_intSuma);
            _intX=_intY;
            _intX=_intSuma;
        }
    }
}
