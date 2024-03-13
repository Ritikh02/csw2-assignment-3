import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class ArrayListUser {
    private ArrayList<User> userList;

    public ArrayListUser() {
        this.userList = new ArrayList<>();
    }
    public void addUser(User user) {
        userList.add(user);
    }
    public void printUserDetails() {
        System.out.println("User Details:");
        for (User user : userList) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        }
    }
    public void sortUsersByAge() {
        Collections.sort(userList, Comparator.comparingInt(User::getAge));
    }
    public void printSortedUserList() {
        System.out.println("Sorted User List (by age):");
        for (User user : userList) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        }
    }
    public User recallUser(int index) {
        if (index >= 0 && index < userList.size()) {
            return userList.get(index);
        } else {
            System.out.println("Index out of bounds.");
            return null;
        }
    }
}

public class A3Q2 {
    public static void main(String[] args) {
        ArrayListUser userList = new ArrayListUser();
        userList.addUser(new User("Ritikh", 18));
        userList.addUser(new User("Prince", 99));
        userList.addUser(new User("Deepak", 89));
        userList.printUserDetails();
        userList.sortUsersByAge();
        System.out.println();
        userList.printSortedUserList();
        User recalledUser = userList.recallUser(1);
        if (recalledUser != null) {
            System.out.println();
            System.out.println("Recalled User: Name: " + recalledUser.getName() + ", Age: " + recalledUser.getAge());
        }
    }
}
