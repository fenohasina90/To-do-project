import java.sql.Timestamp;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main toDoMenu = new Main();

        boolean quit = false;
        while (!quit){
            System.out.println("===== Menu: =====");
            System.out.println("1. Add new To do");
            System.out.println("2. Show a To do");
            System.out.println("3. Show all To do");
            System.out.println("4. Update a To do");
            System.out.println("5. Delete a To do");
            System.out.println("6. Quit");

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your choice : ");
            int userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    toDoMenu.AddTodo();
                    break;
                case 2:
                    toDoMenu.ShowAnTodo();
                    System.out.println();
                    break;
                case 3:
                    toDoMenu.ShowAllTodo();
                    System.out.println();
                    break;
                case 4:
                    toDoMenu.updateToDo();
                    break;
                case 5:
                    toDoMenu.deleteToDo();
                    break;
                case 6:
                    quit = true;
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }



    }
    public void AddTodo(){
        TodoCRUD todoCRUD = new TodoCRUD();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add to do");

        System.out.println("Id: ");
        int id = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Title: ");
        String title = scanner.nextLine();

        System.out.println("Description: ");
        String description = scanner.nextLine();

        System.out.println("Deadline yyyy-mm-dd hh:mm:ss : ");
        String deadlineStr = scanner.nextLine();
        Timestamp deadline = Timestamp.valueOf(deadlineStr);

        System.out.println("Priority (0 - 10): ");
        int priority = scanner.nextInt();

        System.out.println("Done: ");
        boolean done = scanner.nextBoolean();

        todoCRUD.insertToDo(id,title,description,deadline,priority,done);

    }
    public void ShowAnTodo(){
        TodoCRUD todoCRUD = new TodoCRUD();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Show a To do");

        System.out.println("Id: ");
        int id = scanner.nextInt();

        System.out.println(todoCRUD.findAnToDo(id));
    }
    public void updateToDo(){
        TodoCRUD todoCRUD = new TodoCRUD();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Update a To do");

        System.out.println("Id: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("New title: ");
        String title = scanner.nextLine();

        System.out.println("New description: ");
        String description = scanner.nextLine();

        System.out.println("New deadline yyyy-mm-dd hh:mm:ss : ");
        String deadlineStr = scanner.nextLine();
        Timestamp deadline = Timestamp.valueOf(deadlineStr);

        System.out.println("New priority (0 - 10): ");
        int priority = scanner.nextInt();

        System.out.println("New done: ");
        boolean done = scanner.nextBoolean();

        todoCRUD.updateToDo(id,title,description,deadline,priority,done);

    }
    public void deleteToDo(){
        TodoCRUD todoCRUD = new TodoCRUD();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Delete a To do");

        System.out.println("Id: ");
        int id = scanner.nextInt();

        todoCRUD.deleteToDo(id);
    }
    public void ShowAllTodo(){
        System.out.println("Show all To do");
        List<Todo> list = TodoCRUD.findAllToDo();
        for (Todo todolist : list){
            System.out.println(todolist);
        }
    }
}