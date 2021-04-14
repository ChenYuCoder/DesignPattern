package AdapterPattern;

/**
 * @author chenyu
 * @date 2021/3/26
 */
public class TfCardImpl implements TfCard {

    @Override
    public String read() {
        return "tfCard read a msg :hello word TF";
    }

    @Override
    public int write(String msg) {
        System.out.println("tfCard write msg : " + msg);
        return 1;
    }
}
