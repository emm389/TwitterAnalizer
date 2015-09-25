package twitter;

//import com.twitterapime.rest.Credential;
//import com.twitterapime.rest.UserAccountManager;
//import com.twitterapime.search.LimitExceededException;
//import com.twitterapime.xauth.Token;
//import com.twitterapime.xauth.ui.OAuthDialogListener;
//import impl.javame.com.twitterapime.xauth.ui.MIDletOAuthDialogWrapper;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import twitter4j.Paging;
//import twitter4j.ResponseList;
//import twitter4j.Status;
//import twitter4j.Twitter;
//import twitter4j.TwitterException;
//import twitter4j.TwitterFactory;
//import twitter4j.User;
//import twitter4j.auth.AccessToken;
//import twitter4j.auth.RequestToken;

/**
 *
 * @author emmanuel
 */
public class Request {

//    public static void main(String[] args) {
//        MIDlet midlet = new MIDlet();
//
//        MIDletOAuthDialogWrapper page = new MIDletOAuthDialogWrapper(midlet);
//
////Snippet common for all platforms.
//        page.setConsumerKey("conKey");
//
//        page.setConsumerSecret("conSecret");page.setCallbackUrl("callback url"); //For Java ME callback url is not required.
//
//        page.setOAuthListener(new OAuthDialogListener() {
//
//            /**
//             * Callback when user authorizes the app to access the account.
//             */
//            @Override
//            public void onAuthorize(Token token) {
//
//                try {
//                    Credential c = new Credential("conKey", "conSecret", token);
//                    
//                    UserAccountManager m = UserAccountManager.getInstance(c);
//                    
//                    if (m.verifyCredential()) {
//                        //user authorized!
//                        
//                    }
//                } catch (IOException ex) {
//                    Logger.getLogger(Request.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (LimitExceededException ex) {
//                    Logger.getLogger(Request.class.getName()).log(Level.SEVERE, null, ex);
//                }
//
//            }
//
//            /**
//             * Callback when user denies the app to access the account.
//             */
//            @Override
//            public void onAccessDenied(String message) {
//            }
//
//            /**
//             * Callback when any error happens during authentication.
//             */
//            public void onFail(String message, String description) {
//            }
//        });
//
//        page.login();
//    }

//    public static void main(String args[]) throws Exception{
//    // The factory instance is re-useable and thread safe.
//    Twitter twitter = TwitterFactory.getSingleton();
//    twitter.setOAuthConsumer("QaAOhwvgmejqPzueXG282gK0M", "RjCUqgOzECjGkd2iUDhy4sYtrjIyTIL4XQhsZHjLxpeMwC81ks");
//    RequestToken requestToken = twitter.getOAuthRequestToken();
//    AccessToken accessToken = null;
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    while (null == accessToken) {
//      System.out.println("Open the following URL and grant access to your account:");
//      System.out.println(requestToken.getAuthorizationURL());
//      System.out.print("Enter the PIN(if aviailable) or just hit enter.[PIN]:");
//      String pin = br.readLine();
//      try{
//         if(pin.length() > 0){
//           accessToken = twitter.getOAuthAccessToken(requestToken, pin);
//         }else{
//           accessToken = twitter.getOAuthAccessToken();
//         }
//      } catch (TwitterException te) {
//        if(401 == te.getStatusCode()){
//          System.out.println("Unable to get the access token.");
//        }else{
//          te.printStackTrace();
//        }
//      }
//    }
//    //persist to the accessToken for future reference.
//    storeAccessToken((int) twitter.verifyCredentials().getId(), accessToken);
//    Status status = twitter.updateStatus(args[0]);
//    System.out.println("Successfully updated the status to [" + status.getText() + "].");
//    System.exit(0);
//  }
//  private static void storeAccessToken(int useId, AccessToken accessToken){
//    //store accessToken.getToken()
//    //store accessToken.getTokenSecret()
//  }
}
