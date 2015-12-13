package com.epam.javatraining.lastperson;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FindingLastPerson<T> {

    public T FindLastPerson(List<? extends T> persons) {
        if (persons == null) {
            return null;
        }
        if (persons.isEmpty()) {
            throw new IllegalArgumentException("List of person is empty!!");
        }
        boolean secondPerson = false;
        List<T> listPersons = new LinkedList<>(persons);
        Iterator<T> iteratorCircle = listPersons.iterator();
        while (listPersons.size() != 1) {
            while (iteratorCircle.hasNext()) {
                if (secondPerson) {
                    secondPerson = false;
                    iteratorCircle.next();
                    iteratorCircle.remove();
                } else {
                    iteratorCircle.next();
                    secondPerson = true;
                }
            }
            iteratorCircle = listPersons.iterator();
        }
        return listPersons.get(0);
    }

}
