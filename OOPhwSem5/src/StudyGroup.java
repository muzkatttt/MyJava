import model.abstractClass.Group;
import model.student.Student;

import java.util.List;

class StudyGroup extends Group {
    public StudyGroup(Teacher teacher, List<StudyGroup> listStudyGroup) {
        this.teacher = teacher;
        this.listStudyGroup = listStudyGroup;
    }

    private Teacher teacher;

    private List<StudyGroup> listStudyGroup;

    @Override
    protected void addToGroupTeacher(Teacher teacher, List<StudyGroup> listStudyGroup) {

    }

    @Override
    protected List<StudyGroup> addToGroup(Teacher teacher, Student student) {
        listStudyGroup.add(teacher);
        listStudyGroup.add(student);
        return listStudyGroup;

    }
}
