import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.HashMap;
import java.util.Map;

public class spider {
    public static void main(String[] args) {
        try {
            String url;
            String check;

            Map<String, String> cookies=new HashMap<String, String>();

            Document index_ptt = Jsoup.connect("https://www.ptt.cc/bbs").get();
            Elements boards_ptt = index_ptt.select("div.b-ent a");
            for (Element line : boards_ptt) {
                check = line.attr("abs:href");
                Connection.Response age_check = Jsoup.connect(check).followRedirects(true).execute();

                if (age_check.url().toString().contains("over18"))
                {
                    Connection.Response age = Jsoup.connect(age_check.url().toString()).data("yes", "yes")
                            .method(Connection.Method.POST).execute();
                    cookies = age.cookies();
                }
                Document  title = Jsoup.connect(check).cookies(cookies).get();
                Element first = title.select("div.r-ent div.title a").first();
                String discuss= first.text();
                String site= first.attr("href");
                url="https://www.ptt.cc/" + site;
                System.out.println("" +title.title() + " " + url);
                System.out.println(discuss);

                Document article = Jsoup.connect(url).cookies(cookies).get();

                String message="";
                try {
                    Element user = article.select("div.push span[class=f3 hl push-userid]").first();
                    message += user.text();
                    user = article.select("div.push span[class=f3 push-content]").first();
                    message = message + user.text();
                    System.err.println("["+message+"]");
                }catch (Exception e){
                    System.err.println("0");
                }
            }
        }catch (Exception e){
            System.out.println("error: " + e);
        }
    }
}