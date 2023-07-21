import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person("Aizada","Aizadova",2003,2020);
        int a = new Scanner(System.in).nextInt();

        System.out.println("Hello world!");
        System.out.println(" Welcome ");
        Scanner scan = new Scanner( System.in);
//        while(true){



        try{
            System.out.print("\nWrite your name: ");
            String name = scan.nextLine();

            if(!name.matches("[a-zA-Zа-яА-Я- ]*")){
            throw new MyException("Name can't be written with number");
        }
            System.out.print("\nWrite your last name: ");
            String lastName = scan.nextLine();
            if(!lastName.matches("[a-zA-Zа-яА-Я- ]*")){
            throw new MyException("Last name can't be written with numbers");
        }
            System.out.print("\nWrite your birth year: ");
        int birthYear= scan.nextInt();
        if(LocalDate.now().getYear()<birthYear){
            throw new MyException("Date of birth can't be in future!");
        }
        System.out.print("\nWrite your start of working year: ");

        int startOfWorkingYear = scan.nextInt();
        if(LocalDate.now().getYear()<startOfWorkingYear){
            throw new MyException("Date of start working can't be in future!");
        }if((startOfWorkingYear-birthYear)<18){
            throw new MyException("You can't work at this age!");
            }

        int start = (LocalDate.now().getYear()-startOfWorkingYear);

        Person person = new Person(name,lastName,birthYear,startOfWorkingYear);
            System.out.println(person);

        }catch (MyException e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException r){
            System.out.println("Birth year can't be written with letters!");
        }

        }
    }
//}