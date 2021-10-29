public class ConcreteFactory implements ComplexAbstractFactory{
    public Complex createComplex()
    {
        return(new Complex());
    }
    public Complex CreateComplex(Integer real, Integer image)
    {
        return(new Complex(real,image));
    }
}
