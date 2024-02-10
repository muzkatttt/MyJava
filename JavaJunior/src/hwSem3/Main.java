package hwSem3;


public class Main {
    public static void main(String[] args) {
        Student student = Student.create("James Gosling", 38, 99.99);

        WorkWithSer wws = new WorkWithSer();
        wws.serToTxtFile(student);
        wws.deSerFromTxtFile(student);

        WorkWithJson wwj = new WorkWithJson();
        wwj.serToJsonFile(student);
        wwj.deSerFromJsonFile(WorkWithJson.FILE_JSON);

        WorkWithXml wwx = new WorkWithXml();
        wwx.serToXmlFile(student);
        wwx.deSerFromXmlFile(WorkWithXml.FILE_XML);

        // все методы в одном классе
//        WorkWithFiles wwf = new WorkWithFiles(student);
//        wwf.serToTxtFile(student);
//        wwf.deSerFromTxtFile(student);
//        wwf.serToJsonFile(student);
//        wwf.serToXmlFile(student);
//        wwf.deSerFromJsonFile(WorkWithFiles.FILE_JSON);
//        wwf.deSerFromXmlFile(WorkWithFiles.FILE_XML);

    }

}
