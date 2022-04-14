package br.inatel.C207;


public class Main {
    public static void main(String[] args) {

        Database db = new Database();
        db.connect();

        boolean truncate = false;
        boolean insert = false;
        boolean query = true;
        boolean update = false;
        boolean delete = false;

        if (truncate){
            db.truncateTable("user");
        }

        if (insert) {
            User user = new User("Lucas", "111-111-111-22");
            db.insertUser(user);
            user = new User("Jose", "111-111-111-22");
            db.insertUser(user);
            user = new User("Joao", "111-111-111-22");
            db.insertUser(user);
        }

        if (query){
            db.searchUser();
        }

        if (update){
            db.updateUser(0,"Otávio");
            db.updateUser(1,"João");
        }

        if (delete){
            db.deleteUser(2);
        }


    }
}
