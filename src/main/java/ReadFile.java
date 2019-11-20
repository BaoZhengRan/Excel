import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public  class ReadFile{
    public static List read() throws IOException {
        String fileName = "C:\\Users\\Administrator\\Desktop\\663\\Windows\\x64\\3模板打印输出\\1手指成功.log";
        List<String> list = new ArrayList<String>();
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(fileName),"gbk"));
        String line = null;
        while ((line = br.readLine()) != null) {

            Pattern p = Pattern.compile("^验证总时间 (\\d+) ms$");
            Matcher m = p.matcher(line);
            if(m.find()){
               // System.out.println("Found value: " + m.group(1) );
                list.add(m.group(1));
            }

        }
        br.close();
        System.out.println(list.toString());
        return list;
    }
}