package AdapterPattern;

/**
 * @author chenyu
 * @date 2021/3/26
 */
public interface Phone {

    /**
     * 读取数据
     *
     * @return
     */
    String read(SdCard sdCard);

    /**
     * 写入数据
     *
     * @param msg
     * @return
     */
    int write(SdCard sdCard, String msg);
}
