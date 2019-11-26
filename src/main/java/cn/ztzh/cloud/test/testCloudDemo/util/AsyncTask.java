package cn.ztzh.cloud.test.testCloudDemo.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncTask {

	@Async("taskExecutor")
	public void tesTask(int i) {
		System.out.println("第" + i + "个" + Thread.currentThread().getName() + "-----");
		String keyWord = "我的人生";
		try {
			searchEverything(keyWord);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Async("taskExecutor")
	public void stringTask(String str) {

		System.out.println(Thread.currentThread().getName() + str);
	}

	public static void searchEverything(String keyWord) throws IOException {
		URL url = new URL("https://www.baidu.com/s?wd=" + keyWord);// 搜索功能在二级域名中
		HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
		httpURLConnection.setDoOutput(true);
		httpURLConnection.setDoInput(true);
		httpURLConnection.setRequestMethod("GET"); //
		httpURLConnection.setRequestProperty(keyWord, keyWord);
		InputStream inputStream = httpURLConnection.getInputStream();
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		byte[] b = new byte[1024];
		int len = 0;
		while (true) {
			len = inputStream.read(b);
			if (len == -1) {
				break;
			}
			byteArrayOutputStream.write(b, 0, len);
		}
		System.out.println("searchEverything:" + byteArrayOutputStream.toString());
	}

}
