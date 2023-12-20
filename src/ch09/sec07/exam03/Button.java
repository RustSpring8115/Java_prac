package ch09.sec07.exam03;

public class Button {
    public void setClickListener(ClickListner clickListner) {
    }

    //정적 멤버 인터페이스
    public static interface ClickListner {
        //추상 메소드
        void onClick();
    }

    //필드
    private ClickListner clicListner;

    //메소드
    public void setClicListner(ClickListner clicListner) {
        this.clicListner = clicListner;
    }

    public void click() {
        this.clicListner.onClick();
    }
}
