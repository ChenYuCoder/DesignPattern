package AdapterPattern;

/**
 * @author chenyu
 * @date 2021/3/26
 */
public class SdAdapter implements SdCard {

    private final TfCard tfCard;

    public SdAdapter(TfCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String read() {
        return tfCard.read();
    }

    @Override
    public int write(String msg) {
        return tfCard.write(msg);
    }
}
