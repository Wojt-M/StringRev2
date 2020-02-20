import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) {

		StringBuilder strBuild = null;
		String currency ="USD";
		String currencyList = "HRK ,CHF ,MXN ,ZAR ,INR ,THB ,CNY ,AUD ,ILS ,KRW ,JPY ,PLN ,GBP ,IDR ,HUF ,PHP ,TRY ,RUB ,HKD ,ISK ,DKK ,CAD ,USD ,MYR ,BGN ,NOK ,RON ,SGD ,CZK ,SEK ,NZD ,BRL";

		UrlProcessing urlProcessing = new UrlProcessing();
		strBuild = urlProcessing.processUrl(currency);

		// ca³y JSON pobrany ze strony
		JSONObject responseJsonObject = new JSONObject(strBuild.toString());

		// kawa³ek JSONa dotycz¹cy notowañ (rates)
		JSONObject jsonObjectsRates = new JSONObject(responseJsonObject.getJSONObject("rates").toString());

		JSONArray keys = jsonObjectsRates.names();

		for (int i = 0; i < keys.length(); i++) {

			String key = keys.getString(i);
			double value = jsonObjectsRates.getDouble(key);
			System.out.println("Waluta " + key + "--" + value);
		}
		
		
		System.out.println("Data waluty: " + responseJsonObject.get("date"));
		// System.out.println("Notowania: "+responseJsonObject.getJSONObject("rates"));
		// System.out.println(responseJsonObject);
		// System.out.println(keys);
		// System.out.println(jsonObjects.keys());
		// System.out.println(jsonObjects.get("HRK"));
	}

}
