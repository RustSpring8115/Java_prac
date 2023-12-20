package ch08.sec06;



public class Television implements RemoteControl {
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("Tv를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > ch08.sec04.RemoteControl.MAX_VOLUME) {
            this.volume = ch08.sec04.RemoteControl.MAX_VOLUME;
        } else if (volume< ch08.sec04.RemoteControl.MIN_VOLUME) {
            this.volume = ch08.sec04.RemoteControl.MIN_VOLUME;
        }else {
            this.volume = volume;
        }
        System.out.println("현재 Tv 볼륨:" + volume);
    }
}
