package jaf.monkey.mvc;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by Hjc on 2017/1/7.
 * 发送时需要的两个参数：
 * 1：发送的类型
 * 2：发送的内容
 */
public interface Render {
    String contentType();

    void write(OutputStream outputStream) throws IOException;
}
