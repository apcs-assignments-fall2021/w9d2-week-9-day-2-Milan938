public class Person {
    private String firstname;
    private String lastname;


    public Person(String fname, String lname){
        firstname = fname;
        lastname = lname;
    }

    public void doSomething(){
        System.out.println("I am watching Netflix");
    }

    public String toString(){
        return firstname + " " + lastname;
    }

    public String getfirstname(){
        return this.firstname;
    }

    public String getlastname(){
        return this.lastname;
    }

    public void setFirstname(String a){
        this.firstname = a;
    }

    public void setLastname(String a){
        this.lastname = a;
    }
}
