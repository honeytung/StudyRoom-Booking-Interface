package model;

public class LectureBuilding extends Building {

    // MODIFIES: This
    // EFFECTS:  Constructor for initialize name and list of buildings
    public LectureBuilding(String name) {
        super(name);
    }

    @Override
    // EFFECTS:  Prints building name and buildings it connects to
    protected void print(int indent) {
        if (buildings.size() != 0) {
            System.out.println(getIndent(indent) + "Lecture Building " + name + " connects to");
            for (Building i : buildings) {
                i.print(indent + 3);
            }
        } else {
            System.out.println(getIndent(indent) + "Lecture Building " + name);
        }
    }
}
