public class Shirt {
    private String num;
    private String type;
    private String color;
    private String size;

    Shirt()
    {

    }

    Shirt(String num,String type,String color,String size)
    {
        this.color=color;
        this.num=num;
        this.type=type;
        this.size=size;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "num='" + num + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }
}
