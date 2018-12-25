package json.parser;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class JsonReaderUtil2 {



        public static void main(String[] args)throws MalformedURLException, IOException {
            String sURL = "newsapi.org/v2/top-headlines?sources=cnn&apiKey=0d9e35dfa3c140aab8bf9cdd70df957f";
            NewsDataModel news = null;
            List<NewsDataModel> newsList = new ArrayList<>();
            URL url1 = new URL(sURL);
            URLConnection request = url1.openConnection();
            request.connect();
            JsonArray jsonArray = null;
            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            if (root instanceof JsonObject) {
                JsonObject rootObj = root.getAsJsonObject();
            } else if (root instanceof JsonArray) {
                jsonArray = root.getAsJsonArray();
            }
            for (int i = 0; i < jsonArray.size()-1; i++) {
                try {
                    JsonObject jsonobject = jsonArray.get(i).getAsJsonObject();
//you code start here
                    String author =jsonobject.get("author").toString();
                    System.out.print(author);
                    String title =jsonobject.get("title").toString();
                    System.out.print(title);
                    String url =jsonobject.get("url").toString();
                    System.out.print(url);
                    String urltoimage =jsonobject.get("urltoimage").toString();
                    System.out.println(urltoimage);
                    String publishedAt =jsonobject.get("title").toString();
                    System.out.print(title);
                    String content =jsonobject.get("url").toString();
                    System.out.print(url);




                }catch(Exception ex){

                }
            }
//Print to the console.
            for(NewsDataModel entry:newsList){
                System.out.println(entry.getAuthor()+" " +entry.getTitle()+" "+entry.getDescription()+" "+entry.getUrl()+" "+entry.getUrlToImage()+""+entry.getPublishedAt()+" "+entry.getContent());
            }
        }

    }


