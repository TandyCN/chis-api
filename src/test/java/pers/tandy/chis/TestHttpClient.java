package pers.tandy.chis;

import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @Author: Tandy
 * @Date: 2020/2/29 15:05
 * @Version 1.0
 *
 * 文章地址: https://blog.csdn.net/justry_deng/article/details/81042379
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestHttpClient {

    /**
     * 无参请求
     */
    @Test
    public void test1() {
        // 获取 Http 对象
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        // 创建 Get 请求
        HttpGet httpGet = new HttpGet("http://localhost:12345/doGetControllerOne");
        // 创建 Post 请求
        // HttpPost httpPost = new HttpPost(uri);
        // 响应模型
        CloseableHttpResponse response = null;

        try {
            // 发送 Get 请求, 并接收响应
            response = httpClient.execute(httpGet);
            // 从响应模型中获取响应实体
            HttpEntity responseEntity = response.getEntity();
            System.out.println("响应状态为:" + response.getStatusLine());
            if (responseEntity != null) {
                System.out.println("响应内容长度为:" + responseEntity.getContentLength());
                System.out.println("响应内容为:" + EntityUtils.toString(responseEntity));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (httpClient != null) {
                    httpClient.close();
                }
                if (response != null) {
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 有参请求
     *
     */
    @Test
    public void test2() {
        // 获取 Http 对象
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        // 参数
        URI uri = null;
        try {
            uri = new URIBuilder()
                    .setScheme("http")
                    .setHost("localhost")
                    .setPort(8080)
                    .setPath("/chis-api/login")
                    .setParameter("username", "super")
                    .setParameter("password", "123456")
                    .build();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
         /*
        // 设置发送的参数还可以用这种凡是
        List<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("name", "&"));
        params.add(new BasicNameValuePair("age", "18"));
        ..uri.setParameter(params)....
        */

        // 创建 Get 请求
        HttpGet httpGet = new HttpGet(uri);
        // 创建 Post 请求
        // HttpPost httpPost = new HttpPost(uri);

        // 响应模型
        CloseableHttpResponse response = null;
        try {
            // 配置信息
            RequestConfig requestConfig = RequestConfig.custom()
                    .setConnectTimeout(5000) // 设置连接超时时间(单位毫秒)
                    .setConnectionRequestTimeout(5000)  // 设置请求超时时间(单位毫秒)
                    .setSocketTimeout(5000) // socket读写超时时间(单位毫秒)
                    .setRedirectsEnabled(true) // 设置是否允许重定向(默认为true)
                    .build();

            // 将上面的配置信息 运用到这个Get请求里
            httpGet.setConfig(requestConfig);
            // 由客户端执行(发送)Get请求
            response = httpClient.execute(httpGet);
            // 从响应模型中获取响应实体
            HttpEntity responseEntity = response.getEntity();
            System.out.println("响应状态为:" + response.getStatusLine());
            if (responseEntity != null) {
                System.out.println("响应内容长度为:" + responseEntity.getContentLength());
                System.out.println("响应内容为:" + EntityUtils.toString(responseEntity));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (httpClient != null) {
                    httpClient.close();
                }
                if (response != null) {
                    response.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
