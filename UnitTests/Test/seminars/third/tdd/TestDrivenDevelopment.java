package seminars.third.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestDrivenDevelopment {

    //3.5. Red-Green-Refactor

    private MoodAnalyser moodAnalyser;
    @BeforeEach
    void setUp(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
    }

    @Test
    void testMoodAnalyzeHappy() {
        String str = "хорошее настроение!!!";
        assertThat(moodAnalyser.analyze(str)).isEqualTo("happy");
    }

    @Test
    void testMoodAnalyzeSad() {
        String str = "плохое настроение!!!";
        assertThat(moodAnalyser.analyze(str)).isEqualTo("sad");
    }

    @Test
    void testMoodAnalyzeSoSo() {
        //MoodAnalyser moodAnalyser = new MoodAnalyser(); - если используем аннотацию  @BeforeEach и
        // включаем в него метод void setUp(), то в каждом тесте можно исключить создание нового объекта,
        // т.к. он будет создаваться автоматически в каждом тесте

        String str = "нейтральное настроение!!!";
        assertThat(moodAnalyser.analyze(str)).isEqualTo("so so");
    }
}