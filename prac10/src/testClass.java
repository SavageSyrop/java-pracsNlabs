public class testClass {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();
        Complex num = factory.CreateComplex(3,2);
        num.printInfo();
        Complex num2 = factory.createComplex();
        num2.printInfo();
        num2.setImage(0);
        num2.printInfo();
        num2.setReal(0);
        num2.printInfo();
    }
}
