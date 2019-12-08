# Lab13
ProjectName: CSCI-2467 Lab 13 – Java Collections - Maps...
SourceNote for the lab13...
The Surname class will be unchanged.
The loadCensusData() method in the Census class will change as follows:
1)	It will return a Map<String,Surname> collection.
2)	Instead of creating an array to store an array of Surname elements, create a HashMap<String,Surname> object.
3)	Instead of reading in the first one hundred surnames, you will read them all.
4)	As before, you will create and initialize Surname objects.
5)	For each line in the file (except the header line), you’ll add a key / value pair to the HashMap. The key is the surname string, and the value is the Surname object.
6)	The method will return the populated HashMap.
The Main class will change as follows:
1)	As before, make sure the returned list (this time a Map) is not null.
2)	In a loop prompt the user to type a surname
3)	Input the name string
4)	If the user types the sentinel value “quit” (any case), break out of the loop and end the program
5)	Check to see if the name that the user input is in the Map (convert it to upper case first)
a.	If it is not, tell the user that the name was not found
b.	If you find it, output a report with the name, rank,  count, and proportion

