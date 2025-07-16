package Aulas.Interfaces.InterfaceFuncional;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("");
        List<User> users = List.of(new User("Maria", 21), new User("João", 32), new User("Eduardo", 40), new User("Ana", 19));
        printStringValue(Record::toString, users);
        }

        private static void printStringValue(Function<User, String> callback, List<User> users){
            users.forEach(u -> System.out.println(callback.apply(u)));
        }
}

