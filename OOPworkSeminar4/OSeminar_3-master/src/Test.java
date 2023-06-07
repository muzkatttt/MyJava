public interface Test {
    void voice();
    default void voiceTwice(){
        System.out.println("bark bark");
        voice();
        voice();
    }

}
