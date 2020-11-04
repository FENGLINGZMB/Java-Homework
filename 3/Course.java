public class Course implements Cloneable{
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
        students[numberOfStudents]= student;
        numberOfStudents++;
    }

    public String[] getStudents(){
        return students;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public String getCourseName(){
        return courseName;
    }

    public void dropStudent(String student){
        int i=0;
        boolean isAny=false;
        for (;i<numberOfStudents;i++){
            if (students[i]==student) {
                isAny=true;
                break;
            }
        }
        for(;i<numberOfStudents-1;i++)
            students[i]=students[i+1];
        if (isAny)
            numberOfStudents--;
    }

    @Override
    protected Object clone(){
        Course newCourse = (Course)this.clone();
        String[] newStudents= new String[students.length];
        for(int i=0;i<students.length;i++)
            newStudents[i]=students[i];
        newCourse.students = newStudents;
        return newCourse;
    }
}
