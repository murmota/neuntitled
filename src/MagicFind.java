public class MagicFind {
    private int iiq;
    private int iiqNormal;
    private int iir;
    private int iirNormal;

    public int getIiq() {
        return iiq;
    }

    public void setIiq(int iiq) {
        this.iiq = iiq;
    }

    public int getIiqNormal() {
        return iiqNormal;
    }

    public void setIiqNormal(int iiqNormal) {
        this.iiqNormal = iiqNormal;
    }

    public int getIir() {
        return iir;
    }

    public void setIir(int iir) {
        this.iir = iir;
    }

    public int getIirNormal() {
        return iirNormal;
    }

    public void setIirNormal(int iirNormal) {
        this.iirNormal = iirNormal;
    }

    public MagicFind(int iiq, int iir) {
        this.iiq = iiqNormal;
        this.iir = iirNormal;
        System.out.println("MF готов");
    }
    void start() {
        System.out.println("Я начал мфить");
        System.out.println(iiq);
        System.out.println(iir);
    }
    void stop() {
        System.out.println("Я закончил мфить");
        System.out.println(iiqNormal);
        System.out.println(iirNormal);
    }
    public static void main(String[] args) {
        var myMagicFind = new MagicFind(105, 450);
        myMagicFind.start();
        myMagicFind.stop();
    }
    void setiiqNormal(int speed){
        this.iiqNormal = iiqNormal;
    }
    void setiirNormal(int speed){
        this.iirNormal = iiqNormal;
    }
}
