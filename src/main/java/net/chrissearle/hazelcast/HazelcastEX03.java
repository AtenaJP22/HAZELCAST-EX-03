package net.chrissearle.hazelcast;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

public class HazelcastEX03 {
    public static void main(String[] args) {
        HazelcastInstance hz = Hazelcast.newHazelcastInstance();
        IMap<Integer, Person> map = hz.getMap("people");

        for (int i = 0; i < 10000; i++) {
            map.put(i, new Person("Person_" + i));
        }

        System.out.println("Inserted 10,000 Person objects.");

        for (int i = 0; i < 10000; i++) {
            System.out.println("Key " + i + ": " + map.get(i));
        }

        hz.shutdown();
    }
}
