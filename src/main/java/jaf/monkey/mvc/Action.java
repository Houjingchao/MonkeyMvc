package jaf.monkey.mvc;

/**
 * Created by Hjc on 2017/1/7.
 */
public interface Action {
    /*需要路径&&方法*/
    int match(String path, HttpMethod httpMethod);
    /*执行的方法*/
    void execute(Context content);
}
