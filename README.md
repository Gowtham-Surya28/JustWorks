# JustWorks
## Name: Gowtham Surya Gunasekaran

-----------------------------------------------------------------------
-----------------------------------------------------------------------


Following are the commands and the instructions to run the project.

Open the terminal from src folder of this project and
run the following command..

## Instruction to compile:

####Command: javac -d JustWorksCompilation JustworkBanking/Driver/*.java JustworkBanking/Transactions/*.java JustworkBanking/util/*.java

Once this command is being run, it will compile and create a class folder inside the src folder with all .java files being converted to .class files.

Now, copy-paste the input file "bankJustWorks.csv" into the JustWorksCompilation folder.

-----------------------------------------------------------------------
Now navigate to JustWorksCompilation folder using cd command in terminal and run the following command

## Instruction to run:

####Command: java -cp . JustworkBanking.Driver.driver

Run the given command to get the output.

-----------------------------------------------------------------------
## Description:

In this assessment, I have implemented the Bank Balance calculation for the customers satisfying all the requirements, handling all exceptions and getting the desired output. This code will work for input format mentioned in the assessment.

I have implemented this project by following different Design Pattern concepts and principles like "Program to interface and not implementation".

Datastructure: I have used ArrayList datastructure to store the data that is being read from bankJustWorks.csv file. 

ArrayList has an advantage of not mentioning the size of ArrayList, which satisfies my need to store the input data read from the file until EOF.

I'm using add(Object) method of ArrayList to add an element at the end of the ArrayList, which has time complexity of O(1).

This ArrayList is then itereated through to store modified data into a hashmap.

Then I calculate the minimum, maximum and Total balance of each customer for the given month of transaction and display it in terminal and output file.

I have included the input file with sample input data.

-----------------------------------------------------------------------
