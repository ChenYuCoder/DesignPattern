package AdapterPattern;

/**
 * @author chenyu
 * @date 2021/3/26
 */
public class PhoneImpl implements Phone {


    @Override
    public String read(SdCard sdCard) {
        return sdCard.read();
    }

    @Override
    public int write(SdCard sdCard, String msg) {
        return sdCard.write(msg);
    }
}
