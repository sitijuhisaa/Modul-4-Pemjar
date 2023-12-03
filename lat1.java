import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class lat1 {

    public static void main(String[] args) {
        String urlStr = "https://www.palingtekno.my.id"; // Ganti dengan URL yang ingin Anda gunakan

        try {
            // Membuat objek URL
            URL url = new URL(urlStr);

            // Membuka koneksi HTTP ke URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Mengatur metode permintaan menjadi GET (secara default)
            connection.setRequestMethod("GET");

            // Mendapatkan kode status respons HTTP
            int responseCode = connection.getResponseCode();

            // Membaca konten dari URL
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Menampilkan informasi
            System.out.println("URL: " + urlStr);
            System.out.println("Kode Status HTTP: " + responseCode);
            System.out.println("Konten:");
            System.out.println(response.toString());

            // Menutup koneksi
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
