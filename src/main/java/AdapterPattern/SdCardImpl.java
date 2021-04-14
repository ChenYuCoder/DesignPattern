package AdapterPattern;

/**
 * @author chenyu
 * @date 2021/3/26
 */
public class SdCardImpl implements SdCard {

    @Override
    public String read() {
        return "sdcard read a msg :hello word SD";
    }

    @Override
    public int write(String msg) {
        System.out.println("sd card write msg : " + msg);
        return 1;
    }
}
