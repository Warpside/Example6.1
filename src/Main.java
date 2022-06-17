import java.util.Locale;

public class Main {
    public static void main(String[] args) {
                String firstName = " Ivan ";
                String middleName = " Ivanovich ";
                String lastName = " Ivanov ";
                String fullName = "ФИО сотрудника";
                fullName = lastName + firstName + middleName;
                System.out.println("Фио сотрудника - " + fullName);

                String name = fullName.toUpperCase(Locale.ROOT);
                System.out.println("Данные ФИО сотрудника для заполнения отчета — " + name);

                fullName = "Иванов Семён Семёнович";
                fullName.replace("ё","е");
                System.out.println("Данные ФИО сотрудника — " + fullName.replace("ё","е"));

    }
}
