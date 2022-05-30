package ss19_regex_String.Exercise;
import java.util.regex.Pattern;

public class CrawlNews {
    public static void main(String[] args) {
        String regexCrawNews = "^(https?)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
        String test = "http://dantri.com.vn/the-gioi.htm";
        boolean checkRegex = Pattern.matches(regexCrawNews, test);
        System.out.println(checkRegex);
    }
}
