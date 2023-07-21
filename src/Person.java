public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;
    private int startOfWorkingYear;

    public Person() {

    }

    public Person(String firstName, String lastName, int birthYear, int startOfWorkingYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.startOfWorkingYear = startOfWorkingYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getStartOfWorkingYear() {
        return startOfWorkingYear;
    }

    public void setStartOfWorkingYear(int startOfWorkingYear) {
        this.startOfWorkingYear = startOfWorkingYear;
    }

    @Override
    public String toString() {
        return "~~~  Person info  ~~~ " +
                "\nfirstName: " + firstName  +
                "\n lastName: " + lastName  +
                "\n birthYear: " + birthYear +
                "\n startOfWorkingYear: " + startOfWorkingYear ;
    }
}
