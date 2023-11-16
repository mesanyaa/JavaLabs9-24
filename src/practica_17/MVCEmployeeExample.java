package practica_17;

public class MVCEmployeeExample {
    public static void main(String[] args) {
        // Создаем модель, представление и контроллер
        Employee employee = new Employee("John Doe", 50000);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(employee, view);

        // Выводим информацию о сотруднике
        controller.updateView();

        // Изменяем заработную плату и обновляем представление
        controller.setEmployeeSalary(60000);
        controller.updateView();
    }
}
