public class Person {
    private String name="";
    private String surname="";
    private String patronymic="";

    Person()
    {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = " " + patronymic;
    }

    public void setSurname(String surname) {
        this.surname = surname + " ";
    }

    public String getFullName() {
        if (surname.isEmpty())
            return ("Surname Not Stated");
        else
            return(surname+name+patronymic);
    }
}
