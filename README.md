# How To Read Random Line From File using Java

•	I used Random class from Util library.

•	On the file "question.txt", there are basically 10 questions but I repeated the quetions so that there are total 20 lines.

•	At first I decided the limit from the minimum to maximum value I want to generate the random number from.

•	Then I saved that number in the randomNumber integer, that can generate a random number including the minimum and maximum.

•	Then I am setting up the BufferedReader to read line by line from the text file.

•	I am taking a String s to save the lines then print those.

•	Then I am checking if the randomNumber is already same as the minimum number or not.

•	-If not: I will run a loop till the randomNumber just to skip those lines.

•	-If yes: No need to skip those lines we have only one line to ready already as randomNumber == minimum number.

•	Then we will take a variable to fix the last limit. Here I want to show ten lines from randomNumber line to randomNumber+9 line from that file.

•	Then I will run the loop to print those lines.

#Tips:

•	Use single loop from minimum number to last number using if-else condition inside; check RandomLineNumberBetter.java.

•	You can read until the last line of the file using s!=null inside for loop too; check RandomLineNumberLastLine.java
