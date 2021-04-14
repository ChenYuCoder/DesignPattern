package AdapterPattern;

/**
 * @author chenyu
 * @date 2021/3/26
 */
public interface SdCard {
    /**
     * 读取数据
     *
     * @return
     */
    String read();

    /**
     * 写入数据
     *
     * @param msg
     * @return
     */
    int write(String msg);
}
