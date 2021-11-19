public class testMain {
    public static void main(String[] args) {
        Person chelik = new Person();
        chelik.setName("Valery");
        chelik.setSurname("Ghmishenko");
        chelik.setPatronymic("Albertovich");
        System.out.println(chelik.getFullName());

        Person polychel = new Person();
        polychel.setSurname("Zhal");
        System.out.println(polychel.getFullName());

        Person nedochel = new Person();
        System.out.println(nedochel.getFullName());

        Address nwa = new Address("USA-LA,Compton.Groove;4-1 1");
        nwa.printFullInfo();

        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White TShirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        Shirt[] shirtClassArr = new Shirt[11];
        for (int i=0;i<11;i++)
        {

            String[] splitted = shirts[i].split(",");
            shirtClassArr[i]= new Shirt(splitted[0],splitted[1],splitted[2],splitted[3]);
            System.out.println(shirtClassArr[i].toString());
        }

        TelephoneNumber alo = new TelephoneNumber();
        System.out.println(alo.convertNumber("89138526595"));   // кодом страны является всё что идет перед 10 цифрами номера, считая с конца
        System.out.println(alo.convertNumber("+79175655655"));


    }
}
