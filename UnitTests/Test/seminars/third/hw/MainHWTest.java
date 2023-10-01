package seminars.third.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MainHWTest {
    private MainHW mainHW;

    @BeforeEach
    void setUp(){
        mainHW = new MainHW();
    }
    @Test
    void evenNumber() {
        assertThat(mainHW.evenOddNumber(20)).isTrue();
    }

    @Test
    void oddNumber(){
        assertThat(mainHW.evenOddNumber(21)).isFalse();
    }

    @Test
    void numberIntervalEntered() {
        assertThat(mainHW.numberInterval(25)).isTrue();
    }

    @Test
    void numberIntervalNotEntered() {
        assertThat(mainHW.numberInterval(100)).isFalse();
    }

    @Test
    void numberIntervalException(){
        assertThatThrownBy(() ->
                mainHW.numberInterval(-10)).isInstanceOf(RuntimeException.class);
    }
}