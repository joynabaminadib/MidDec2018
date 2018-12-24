package databases;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;


public class test2 {
    public static void main(String[] args) {


        // Creating a Mongo client
        MongoClient mongo = new MongoClient("localhost", 27017);

        // Creating Credentials
        MongoCredential credential;
        credential = MongoCredential.createCredential("midterm", "MyData",
                "2018".toCharArray());
        System.out.println("Connected to the database successfully");
    }
}
