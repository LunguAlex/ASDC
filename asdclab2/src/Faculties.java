public enum Faculties {
    MATHEMATICS,
    INFORMATICS,
    LAW,
    PHYSICS;
    private static Faculties[] faculties = {
            MATHEMATICS,
            INFORMATICS,
            LAW,
            PHYSICS,
    };

    public static Faculties getFaculty(int num) {
        return faculties[num - 1];
    }

    public int getIndex(Student student) {
        int buffer = 0;
        for (int i = 0; i < 5; i++) {
            if (student.getFaculty().equals(faculties[i])) buffer = i + 1;
        }
        return buffer;
    }


}