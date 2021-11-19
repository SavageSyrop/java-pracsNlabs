import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String state;
    private String street;
    private String house;
    private String corpus;
    private String flat;

    Address(String info)
    {
        info.replaceAll(" ","");
        //String[] words = info.split(",");
        //this.country=words[0];
        //this.region=words[1];
        //this.state=words[2];
        //this.street=words[3];
        //this.house=words[4];
        //this.corpus=words[5];
        //this.flat=words[6];
        StringTokenizer tokenizer = new StringTokenizer(info," ,.;-");
        this.country=tokenizer.nextToken();
        this.region=tokenizer.nextToken();
        this.state=tokenizer.nextToken();
        this.street=tokenizer.nextToken();
        this.house=tokenizer.nextToken();
        this.corpus=tokenizer.nextToken();
        this.flat=tokenizer.nextToken();
    }

    void printFullInfo()
    {
        System.out.println("Country: " + this.country);
        System.out.println("Region: " + this.region);
        System.out.println("State: " + this.state);
        System.out.println("Street: " + this.street);
        System.out.println("House: " + this.house);
        System.out.println("Corpus: " + this.corpus);
        System.out.println("Flat: " + this.flat);
    }
}
