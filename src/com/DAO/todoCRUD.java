package com.DAO;

public class todoCRUD {
    /*
      private static Connection connection;
    public static Connection singleton() {
        if (connection == null){
            ConnectionToDatabase db = new ConnectionToDatabase();
            connection = db.createConnection();
        }
        return connection;
    }


    // add a todo
    public void insertToDo(int id, String title, String description, Timestamp deadline, int priority, boolean done){
        Connection connection = singleton();

        try{
            String sql = "INSERT INTO todo VALUES (?, ?, ?, ?, ?, ?)";


            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            statement.setString(2,title);
            statement.setString(3,description);
            statement.setTimestamp(4,deadline);
            statement.setInt(5,priority);
            statement.setBoolean(6,done);

            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("To Do inserted with success!");
                System.out.println();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    // show a todo by its ID

    public todo findAnToDo(int id){

        Connection connection = singleton();
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM todo WHERE id = "+ id +"";
            ResultSet resultSet = statement.executeQuery(sql);

            if(resultSet.next()){
                return new todo(
                        resultSet.getInt("id"),
                        resultSet.getString("title"),
                        resultSet.getString("description"),
                        resultSet.getTimestamp("deadline"),
                        resultSet.getInt("priority"),
                        resultSet.getBoolean("done")
                );
            }

            }catch (SQLException e){
                e.printStackTrace();
            }
        return null;
    }

    // Show all todo

    public static List<todo> findAllToDo(){
        Connection connection = singleton();
        List<todo> ToDoList = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM todo";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("title");
                String description = resultSet.getString("description");
                Timestamp deadline = resultSet.getTimestamp("deadline");
                int priority = resultSet.getInt("priority");
                boolean done = resultSet.getBoolean("done");



                todo Todo = new todo(id, name,description,deadline,priority, done);
                ToDoList.add(Todo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ToDoList;

    }

    // update an todo by its id

    public todo updateToDo(int id, String newTitle, String newDescription, Timestamp newDeadline, int newPriority, boolean newDone){
        Connection  connection = singleton();

        try{
            String sql = "UPDATE todo SET title = ?, description = ?, deadline = ?, priority = ?, done = ? WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, newTitle);
            statement.setString(2, newDescription);
            statement.setTimestamp(3, newDeadline);
            statement.setInt(4, newPriority);
            statement.setBoolean(5,newDone);
            statement.setInt(6, id);

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("To do updated with success!");
                System.out.println();
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // delete an todo by its id
    public void deleteToDo(int id){
        Connection  connection = singleton();
        try {
            String sql = "DELETE FROM todo WHERE id = ?";


            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,id);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("To do removed with success!");
                System.out.println();
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    */
}
