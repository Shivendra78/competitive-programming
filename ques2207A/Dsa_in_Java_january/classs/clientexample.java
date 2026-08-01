package classs;


import java.io.*;
import java.net.*;

public class clientexample {
    public static void main(String[] args) {
        try {
            // Create socket to connect with server
            Socket socket = new Socket("172.25.228.133", 5000);

            System.out.println("Connected to Server");

            // Create input and output streams
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            // Send message to server
            output.println("Hello Server");

            // Receive response from server
            String response = input.readLine();
            System.out.println("Server says: " + response);

            // Close connection
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}