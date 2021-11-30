import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class spider {
    public static void main(String[] args) {
        try{
            Document doc = Jsoup.connect("https://www.ptt.cc/bbs/hotboards.html").get();
            System.out.println(doc.title());

            Elements newsHeadlines = doc.select("#main-container > div.b-list-container.action-bar-margin.bbs-screen > div:nth-child(1) > a" );
            for (Element headline : newsHeadlines) {
                System.out.println( headline.attr("title"));
                System.out.println(headline.absUrl("href"));

            }

        }catch (Exception e){
            System.out.println(e);
        }
    }


}



