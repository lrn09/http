import java.io.IOException;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        GetResponse getResponse = new GetResponse();

        Stream<Parse> parseStream = getResponse.GetCatsFromUrl("https://raw.githubusercontent.com/netology-code/jd-homeworks/master/http/task1/cats").stream();
        parseStream.filter(upvotes -> upvotes.getUpvotes() != null
                        && Integer.parseInt(upvotes.getUpvotes()) > 0)
                .forEach(System.out::println);
    }

}
