package qianfg.fun.facade;

public class Home {

    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Projector projector;
    private Screen screen;
    private Stereo stereo;
    private TheaterLight theaterLight;

    public Home() {
        this.dvdPlayer = DVDPlayer.getInstanc();
        this.popcorn = Popcorn.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
        this.theaterLight = TheaterLight.getInstance();
    }

    /**
     * 操作步骤
     */

    /**
     * Step1.准备
     */
    public void ready() {
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.dim();
    }

    /**
     * Step2.播放
     */
    public void play() {
        dvdPlayer.play();
    }

    /**
     * Step3.暂停
     */
    public void pause() {
        dvdPlayer.pause();
    }

    /**
     * Step4.结束
     */
    public void end() {
        popcorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }
}
