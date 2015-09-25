package twitter;

/**
 *
 * @author emmanuel
 */
import java.text.SimpleDateFormat;
import java.util.List;
import twitter4j.Paging;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.UserMentionEntity;
import twitter4j.auth.AccessToken;

public class GetUserStatus {

    public static void main(String[] args) {
        SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
        Twitter twitter = new TwitterFactory().getInstance();

        //	My Applications Consumer and Auth Access Token
        twitter.setOAuthConsumer("QaAOhwvgmejqPzueXG282gK0M", "RjCUqgOzECjGkd2iUDhy4sYtrjIyTIL4XQhsZHjLxpeMwC81ks");
        twitter.setOAuthAccessToken(new AccessToken("1202724049-lJNcB8M7MGnHgHvb3DjvbkfwVL5yIQUiQIDm2uE", "gKPBvco7UsIxcWMk1SUxaN9nKy4rsdTrZKDQaiXGrNjne"));

        try {

            User a = twitter.showUser("MBarbosaMX");

            System.out.println("\nid: " + a.getId());
            System.out.println("\nNombre: " + a.getName());
            System.out.println("\nUsuario: " + a.getScreenName());
            System.out.println("\nDescripcion: " + a.getDescription());
            System.out.println("\nUbicacion: " + a.getLocation());
            System.out.println("\nLink Facebook: " + a.getURL());
            System.out.println("\nSe unio el: " + formateador.format(a.getCreatedAt()));
            System.out.println("\nTweets: " + a.getStatusesCount());
            System.out.println("\nSiguiendo: " + a.getFriendsCount());
            System.out.println("\nSeguidores: " + a.getFollowersCount());
            System.out.println("\nFavoritos: " + a.getFavouritesCount());
            System.out.println("\nListas: " + a.getListedCount());
            System.out.println("\nFoto: " + a.getBiggerProfileImageURL());
            
            Paging paging = new Paging(1, 100);
            ResponseList<Status> timeLine = twitter.getHomeTimeline();
            
            List<Status> statuses = twitter.getUserTimeline("MBarbosaMX", paging);
            int contador = 0;
            long[] lista;
            UserMentionEntity[] userMentions;
            
            for (Status statuse : statuses) {
                lista = statuse.getContributors();
                System.out.println("Tweet: " + statuse.getText());
                System.out.println("geoLocation: " + statuse.getGeoLocation());
                System.out.println("retweetedCount: " + statuse.getRetweetCount());
                System.out.println("isFavourite: " + statuse.isFavorited());
                System.out.println("isRetweeted: " + statuse.isRetweeted());
                System.out.println("FavouriteCount: " + statuse.getFavoriteCount());
                System.out.print("ContributorsID: ");
                for (int i = 0; i < lista.length; i++) {
                    System.out.print(lista[i] + " ");
                }
                System.out.println();
                userMentions = statuse.getUserMentionEntities();
                System.out.print("userMentionEntities: ");
                for (UserMentionEntity userMention : userMentions) {
                    System.out.println("id: " + userMention.getId());
                    System.out.println("                     Nombre: " + userMention.getName());
                    System.out.println("                     usuario: " + userMention.getScreenName());
                    System.out.println("                     inicio: " + userMention.getStart());
                    System.out.println("                     final: " + userMention.getEnd());
                    System.out.println("                     texto: " + userMention.getText());
                }
                System.out.println();
                contador++;
            }

        } catch (Exception e) {

        }

    }

//    public static void dumpJSONElement(JsonElement elemento) {
//        if (elemento.isJsonObject()) {
//            System.out.println("Es objeto");
//            JsonObject obj = elemento.getAsJsonObject();
//            java.util.Set<java.util.Map.Entry<String, JsonElement>> entradas = obj.entrySet();
//            java.util.Iterator<java.util.Map.Entry<String, JsonElement>> iter = entradas.iterator();
//            while (iter.hasNext()) {
//                java.util.Map.Entry<String, JsonElement> entrada = iter.next();
//                System.out.println("Clave: " + entrada.getKey());
//                System.out.println("Valor:");
//                dumpJSONElement(entrada.getValue());
//            }
//
//        } else if (elemento.isJsonArray()) {
//            JsonArray array = elemento.getAsJsonArray();
//            System.out.println("Es array. Numero de elementos: " + array.size());
//            java.util.Iterator<JsonElement> iter = array.iterator();
//            while (iter.hasNext()) {
//                JsonElement entrada = iter.next();
//                dumpJSONElement(entrada);
//            }
//        } else if (elemento.isJsonPrimitive()) {
//            System.out.println("Es primitiva");
//            JsonPrimitive valor = elemento.getAsJsonPrimitive();
//            if (valor.isBoolean()) {
//                System.out.println("Es booleano: " + valor.getAsBoolean());
//            } else if (valor.isNumber()) {
//                System.out.println("Es numero: " + valor.getAsNumber());
//            } else if (valor.isString()) {
//                System.out.println("Es texto: " + valor.getAsString());
//            }
//        } else if (elemento.isJsonNull()) {
//            System.out.println("Es NULL");
//        } else {
//            System.out.println("Es otra cosa");
//        }
//    }

}
