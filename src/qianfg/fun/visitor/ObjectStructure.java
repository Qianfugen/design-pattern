package qianfg.fun.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 枚举它的元素，可以提供一个高层的接口，用来允许访问者访问元素
 */
public class ObjectStructure {

    List<Person> persons;

    public ObjectStructure() {
        this.persons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public void delPerson(Person person) {
        persons.remove(person);
    }

    public void display(Action action) {
        for (Person person : persons) {
            person.accept(action);
        }
    }
}
