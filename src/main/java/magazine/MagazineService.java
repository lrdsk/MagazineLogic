package magazine;

import java.util.Scanner;
import java.util.Set;

public class MagazineService {
    public void showInfo(Magazine magazine) {
        System.out.println("Магазин: " + magazine.getNameOfShop());
        System.out.println("Адрес магазина: " + magazine.getAddress());
        System.out.println("Контакты директора: " + magazine.getNameOfDirector());
        System.out.println("Специализация магазина: " + magazine.getSpecializationOfShop());
        System.out.println();
    }
    public void showAllEmployees(Magazine magazine){
        if(magazine.getEmployeesList().size() > 0){
            int i = 1;
            Set<String> keys= magazine.getEmployeesList().keySet();
            for(String key: keys){
                System.out.print("Имя работника " + i + ": " + key + ".\t");
                System.out.println("Зарплата: " + magazine.getEmployeesList().get(key));
                System.out.println();
            }

            magazine.getEmployeesList().forEach((s, integer) -> {

            });
        }else{
            String nameEmployee;
            int salaryEmployee;
            boolean addEmployeeDone = false;
            Scanner input = new Scanner(System.in);


            System.out.println("В магазине отстутствуют работники! Вы можете вписать данные о сотруднике.");
            System.out.print("Введите имя сотрудника: ");
            nameEmployee = input.nextLine();
            while(!addEmployeeDone) {
                System.out.print("Введите размер его зарплаты: ");
                try {
                    salaryEmployee = Integer.parseInt(input.nextLine().toString());
                    magazine.getEmployeesList().put(nameEmployee, salaryEmployee);
                    addEmployeeDone = true;
                } catch (NumberFormatException e) {
                    System.out.println("Неправильный формат ввода зарплаты, попробуйте еще раз.");
                }
            }
        }
    }
    public void showInfoAboutEmployee(Magazine magazine, String name){
        if(magazine.getEmployeesList().containsKey(name)){
            System.out.println("Имя работника: " + name + "\nЗарплата: " + magazine.getEmployeesList().get(name));
        } else{
            System.out.println("Такого работника не существует.");
        }
    }

}
