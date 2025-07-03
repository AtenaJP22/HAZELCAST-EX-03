# HAZELCAST-EX-03
İ2İ Systems Internship Exercise Hazelcast-Ex-03

I implemented a standalone Java application using Maven to demonstrate interaction with a local Hazelcast instance. Below is a summary of the steps I followed:
	1.	Created a Java project structured with a Person class and a main class HazelcastEX03.
	2.	Configured Hazelcast 5.3.6 as a dependency via Maven in the pom.xml file.
	3.	Initialized a single-node embedded Hazelcast cluster using Hazelcast.newHazelcastInstance().
	4.	Populated the Hazelcast map (IMap<Integer, Person>) with 10,000 Person objects in a for loop.
	5.	Retrieved and printed sample entries to verify correctness.
	6.	Hazelcast logs showed the successful startup and shutdown of the instance.
