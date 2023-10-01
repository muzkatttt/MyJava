package seminars.third.tdd;

public class MoodAnalyser {

    public String analyze(String str) {
        String result = "so so";
        if (str.contains("хорошее")) {
            result = "happy";
        } else if (str.contains("плохое")) {
            result = "sad";
        }
        return result;
    }
}