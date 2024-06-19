public class Main {

    public static void main(String[] args) {
        System.out.println("melo es guatón");

        String url = "jdbc:postgresql://localhost:5432/prueba";
        String user = "miel";
        String password = "meloMELO666";

        Get get = new Get();

        get.verLibros(user,password,url);

    }
}
