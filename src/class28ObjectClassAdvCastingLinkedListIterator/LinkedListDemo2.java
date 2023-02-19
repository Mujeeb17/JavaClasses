package class28ObjectClassAdvCastingLinkedListIterator;

import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {

        LinkedList<String> subjects = new LinkedList<>();

        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Jira");
        subjects.add("Git");
        subjects.add("Java");

        LinkedList<String> newSubjects = new LinkedList<>();

        newSubjects.add("Selenium");
        newSubjects.add("TestNG");
        newSubjects.add("Cucumber");
        newSubjects.add("SQL");
        newSubjects.add("APIs");
        newSubjects.add("Jenkins");

        //if we want to combine both the linked lists, we do the following
        LinkedList<String> allSubjects = new LinkedList<>();

        //there is a method available to add all the data
        allSubjects.addAll(subjects);
        allSubjects.addAll(newSubjects);
        System.out.println(allSubjects);

        LinkedList<String> subjectsILike = new LinkedList<>();

        subjectsILike.add("Java");
        subjectsILike.add("SDLC");
        subjectsILike.add("SQL");
        System.out.println(subjectsILike);

        //this method will remove all the subjects I like,
        //it will print all the subjects i don't like
        allSubjects.removeAll(subjectsILike);
        System.out.println(allSubjects);
    }
}
