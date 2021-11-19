public class ConcreteFactory implements ComplexAbstractFactory{

    public Complex CreateComplex(Integer real, Integer image)
    {
        return(new Complex(real,image));
    }

    public Complex createComplex()
    {
        return(new Complex());
    }

}
