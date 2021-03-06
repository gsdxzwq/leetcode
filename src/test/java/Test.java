import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author zhaowq
 * @date 2018/11/6
 */
public class Test {

    @org.junit.Test
    public void test() throws UnsupportedEncodingException {
        String decode = URLDecoder.decode("%E5%BF%83%E6%A2%A6%EF%BD%9E%E6%97%A0%E7%97%95%F0%9F%95%B5", "UTF-8");
        System.out.println(decode);
        System.out.println(URLEncoder.encode(decode, "UTF-8"));
    }

    static void asynExecuteOne() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(new Runnable() {
            public void run() {
                System.out.println("--async execute one ---");
            }
        });
    }

    static void asynExecuteTwo() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(new Runnable() {
            public void run() {
                System.out.println("--async execute two ---");
            }
        });
    }
}
