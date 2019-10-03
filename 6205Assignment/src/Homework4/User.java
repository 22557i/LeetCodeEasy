package Homework4;

import java.util.*;

/**
 * Created by Hao Wu on 10/1/19.
 */
public class User implements Comparable<User> {
        private String name;
        private int id;
        private Date birth;
        public User (String name, int id, Date birth)
        {
            this.name = name;
            this.id = id;
            this.birth = birth; }

        @Override
        public boolean equals(Object other) {
            if (this == other) return true;
            if (other == null || (this.getClass() != other.getClass())) {
                return false;
            }
            User guest = (User) other;
            return (this.id == guest.id) && (this.name != null )&&( this.name.equals(guest.name)) && ((this.birth != null) && birth.equals(guest.birth));
        }
        @Override public int hashCode() {
            int result = 0;
            result = 31*result + id;
            result = 31*result + (name !=null ? name.hashCode() : 0);
            result = 31*result + (birth !=null ? birth.hashCode() : 0); return result;
        }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", birth=" + birth +
                '}';
    }

    @Override
        public int compareTo(User o) {
            return this.id - o.id;
        }

    public static void main(String[] args) {
        List<User> list = new ArrayList<>();

        list.add(new User("Potter",4,new Date(1901,02,03)));
        list.add(new User("Kalsey",2,new Date(1900,05,06)));
        list.add(new User("Harry",1,new Date(1900,01,01)));
        list.add(new User("Calvein",3,new Date(1904,02,07)));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}


