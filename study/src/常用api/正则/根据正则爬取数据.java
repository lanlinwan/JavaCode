package 常用api.正则;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 根据正则爬取数据 {
    public static void main(String[] args) {
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，”+ 因为这两个是长期支持版本，下-一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";
        //Pattern:表示正则表达式
        //Matcher:文本匹配器，作用按照正则表达式的规则去读取字符串，从头开始读取。在大串中去找符合匹配规则的子串。
        //1. 获取正则表达式的对象
        Pattern p = Pattern. compile( "Java\\d{0,2}");

        //2. 获取文本匹配器的对象
        //m: 文本匹配器的对象
        //str:大串
        //p:规则
        //m要在str中找符合p规则的小串
        Matcher m = p. matcher(str);

        //3. 循环获取
        //拿着文本匹配器从头开始读取，寻找是否有满足规则的子串
        //如果没有，方法返回false
        //如果有，返回true。在底层记录子串的起始索引和结束索引+1

        //方法底层会根据find方法记录的索引进行字符串的截取
        //subString(起始索引，结束索引);包头不包尾,会把截取的小串进行返回。
        while (m.find()){
            String s=m.group();
            System.out.println(s);
        }



    }
}
