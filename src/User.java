public class User<T extends Number> {
    private T passsword;
    private String login;

    public User(T passsword, String login) {
        this.passsword = passsword;
        this.login = login;
    }
    public void createQuery(){
        Query query = new Query();
        query.priintTolog();

    }

    class Query{
        public void priintTolog(){
            System.out.println("Login " + login);
            System.out.println("Password " + passsword);
        }
    }
}
