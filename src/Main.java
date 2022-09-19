import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> arrayList = new ArrayList<>();
        User<Integer> user = new User<>(12353465,"Bakai");
        User<Integer> user1 = new User<>(16335455,"Syimyk");
        User<Integer> user2 = new User<>(125423,"Argen");
        User<Integer> user3 = new User<>(722345,"Burulai");
        User<Integer> user4 = new User<>(75454,"Jazgul");
        arrayList.add(user);
        arrayList.add(user1);
        arrayList.add(user2);
        arrayList.add(user3);
        arrayList.add(user4);
        for (User u: arrayList) {
            u.createQuery();
            System.out.println();

        }






    }
}


