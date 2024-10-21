package faculty.entity;


public class Course {

    public String nameOfCourse;
    private StudentsList studentsList;


    public Course(String nameOfCourse, StudentsList studentsList) {
        this.nameOfCourse = nameOfCourse;
        this.studentsList = studentsList;
    }

    public Course(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }

    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public StudentsList getStudentsList() {
        return studentsList;
    }


    /**
     * Метод, записывающий студентов на курс
     * @param isOpen - флаг, определяющий, открыт ли набор на курс
     * @param student - студент курса
     */
    public void registrationToTheCourse(boolean isOpen, Student student){
        if (isOpen){
            studentsList.studentAddToList(student);
            System.out.printf("Добавлен студент %s на курс по %s", student.getName(), getNameOfCourse());
        } else{
            // TODO здесь вызвать метод выставления оценок преподавателем
            System.out.println("Набор на курс закрыт!");
        }
    }



}
