import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class UrlProcessing {

	public StringBuilder processUrl(String currencySymbol) {

		String inputFromUrl;
		StringBuilder strBuild = null;

		String url = "https://api.exchangeratesapi.io/latest?base=" + currencySymbol;
		URL urlObj;

		try {
			urlObj = new URL(url);

			HttpURLConnection con = (HttpURLConnection) urlObj.openConnection();

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));

			strBuild = new StringBuilder();
			while ((inputFromUrl = br.readLine()) != null) {
				strBuild.append(inputFromUrl);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return strBuild;
	}
}
