import netscape.javascript.JSObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Scanner;

public class CurrencyConverter {

    private static String fromCode, toCode;;
    private static double amount;

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        HashMap <Integer, String> currencyCodes = new HashMap<Integer, String>();
        currencyCodes.put(1, "USD");
        currencyCodes.put(2, "CAD");
        currencyCodes.put(3, "EUR");
        currencyCodes.put(4, "HKD");
        currencyCodes.put(5, "INR");

        System.out.println("Welcome to the currency converter!");
        System.out.println("Currency converting FROM?");
        System.out.println("1.USD \t 2.CAD \t 3.EUR \t 4.HKD \t 5.INR");
        fromCode = currencyCodes.get(scanner.nextInt());

        System.out.println("Currency converting TO?");
        System.out.println("1.USD \t 2.CAD \t 3.EUR \t 4.HKD \t 5.INR");
        toCode = currencyCodes.get(scanner.nextInt());

        System.out.println("Amount to convert?");
        amount = scanner.nextDouble();

        sendHttpGETRequest(fromCode, toCode, amount);

        System.out.println("Thank you for using the currency converter!");

    }

    private static void sendHttpGETRequest (String fromCode, String toCode, double amount) throws IOException {

        String GET_URL = "https://api.exchangeratesapi.io/latest?base=" + toCode + "&symbols=" + fromCode;
        URL url = new URL(GET_URL);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("GET");
        int responseCode = httpURLConnection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) { //success
            BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null){
                response.append(inputLine);
            }
            in.close();

            /*
            JSONObject obj = new JSONObject(response.toString());
            Double exchangeRate = obj.getJSONObject("rates").getDouble(fromCode);
            System.out.println(obj.getJSONObject("rates"));
            System.out.println(exchangeRate);
            System.out.println();
            System.out.println(amount + fromCode + "=" + amount/exchangeRate + toCode); */
        }
        else {
            System.out.println("GET request failed");
        }
    }

}
