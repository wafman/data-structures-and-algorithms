package code401Challenges.hashtable;


public class Hashtable {

    private Node[] map;


    //constructor
    public Hashtable(int size){
        map = new Node[size];
    }

    //methods
    public int hash(String key){
        int hashValue = 0;
        char[] words = key.toCharArray();
        for(int i = 0; i < words.length; i++){
            hashValue += words[i];
        }
        hashValue = (hashValue * 1069) % map.length;
        return hashValue;
    }

    public void add(String key, String value){
        Node node = new Node(key,value);
        int hashKey = hash(key);
        if(this.map[hashKey] == null){
            map[hashKey] = node;
        }
        else {
            Node temp = map[hashKey];
            map[hashKey] = node;
            map[hashKey].setNext(temp);
        }
    }

    public String get(String key){
        int searchHashKey = hash(key);
        while(this.map[searchHashKey] != null){
            if(this.map[searchHashKey].getKey() == key){
                return this.map[searchHashKey].getValue();
            }
            this.map[searchHashKey] = this.map[searchHashKey].getNext();
        }
        return null;
    }

    public boolean contains(String key){
        int containsHashKey = hash(key);
        boolean contains = false;
        while(this.map[containsHashKey] != null){
            if(this.map[containsHashKey].getKey() == key){
                contains = true;
            }
            this.map[containsHashKey] = this.map[containsHashKey].getNext();
        }
        return contains;
    }
}
