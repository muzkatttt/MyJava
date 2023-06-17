package service;

import model.StudyGroup;
import model.student.Student;
import model.teacher.Teacher;
import java.util.List;

public class StudyGroupService implements Service{

    static Integer idNumber;

    static{
        idNumber = 1;
    }
    private StudyGroup studyGroup;


    public StudyGroupService(StudyGroup studyGroup) {
        this.studyGroup = studyGroup;
    }

    public StudyGroupService() { // чтобы не передавать аргументом null, создать пустой конструктор

    }

    public StudyGroup getStudyGroup() {
        return studyGroup;
    }

    public void setStudyGroup(StudyGroup studyGroup) {
        this.studyGroup = studyGroup;
    }

    @Override
    public StudyGroup createListGroup(List<Student> studentList, Teacher teacher) {
       setStudyGroup(new StudyGroup(idNumber++, studentList, teacher));
       return getStudyGroup();
    }

    @Override
    public List<Student> getStudents() {
        return studyGroup.getUsers();
    }

    @Override
    public Teacher getTeacher() {
        return studyGroup.getTeacher();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StudyGroupService{");
        sb.append("studyGroup=").append(studyGroup);
        sb.append('}');
        return sb.toString();
    }
}
