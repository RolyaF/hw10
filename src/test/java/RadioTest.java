import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testStationMiddle() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        int actual = radio.getCurrentStation();
        int expected = 6;
        Assertions.assertEquals(actual, expected);

    }
    @Test
    public void testStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);

    }
    @Test
    public void testStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);

    }
    @Test
    public void testLimitValue1() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setCurrentStation(0);
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);

    }
    @Test
    public void testLimitValue2() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(actual, expected);

    }
    @Test
    public void testLimitValue3() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int actual = radio.getCurrentStation();
        int expected = 8;
        Assertions.assertEquals(actual, expected);

    }
    @Test
    public void testLimitValue4() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void testNext() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 6;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void testNext2() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void testNext3() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void testNext4() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void testPrev() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 8;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void testPrev1() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 7;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void testPrev2() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void testPrev3() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void testVolumeMiddle() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        int actual = radio.getCurrentVolume();
        int expected = 50;
        Assertions.assertEquals(actual, expected);

    }
    @Test
    public void testVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);

    }
    @Test
    public void testVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);

    }
    @Test
    public void testLimitVolumeValue1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.setCurrentVolume(0);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);

    }
    @Test
    public void testLimitVolumeValue2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int actual = radio.getCurrentVolume();
        int expected = 1;
        Assertions.assertEquals(actual, expected);

    }
    @Test
    public void testLimitVolumeValue3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        int actual = radio.getCurrentVolume();
        int expected = 99;
        Assertions.assertEquals(actual, expected);

    }
    @Test
    public void testLimitVolumeValue4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void testIncrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void testIncrease2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 2;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void testIncrease3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void testIncrease4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void testReduce() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        int expected = 99;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void testReduce2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        int expected = 98;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void testReduce3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }
    @Test
    public void testReduce4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }
}
