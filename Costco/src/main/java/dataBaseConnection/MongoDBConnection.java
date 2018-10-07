package dataBaseConnection;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class MongoDBConnection {
    public static MongoDatabase mongoDatabase = null;
    public static MongoDatabase connectToMongoDB(){
        MongoClient mongoClient = new MongoClient();
        mongoDatabase = mongoClient.getDatabase("PNT");
        System.out.println("Database Connected");
        return mongoDatabase;
    }
    public String insertIntoMongoDB(List<String> elements, String tableName, String columnName){
        MongoDatabase mongoDatabase = connectToMongoDB();
        MongoCollection myCollection = mongoDatabase.getCollection(tableName);
        boolean collectionExists = mongoDatabase.listCollectionNames()
                .into(new ArrayList<String>()).contains(tableName);
        if(collectionExists) {
            myCollection.drop();
        }
        for(int i=0; i<elements.size(); i++){
            MongoCollection<Document> collection = mongoDatabase.getCollection(tableName);

            Document document = new Document().append(columnName, elements.get(i));
            collection.insertOne(document);
        }
        return  "Language has been registered";
    }
    public List<String> readLanguageListFromMongoDB(String profileName,String columnName){
        List<String> list = new ArrayList<String>();
        MongoDatabase mongoDatabase = connectToMongoDB();
        MongoCollection<Document> collection = mongoDatabase.getCollection(profileName);
        BasicDBObject basicDBObject = new BasicDBObject();
        FindIterable<Document> iterable = collection.find(basicDBObject);
        for(Document doc:iterable) {
            int idInt = 0;
            String language = (String) doc.get(columnName);
            list.add(language);
        }
        return list;
    }
}


