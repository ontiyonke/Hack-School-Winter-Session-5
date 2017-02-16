# Welcome this is the official repo for project 5
##UCLA ACM HACK

If you've missed the fifth session, check out the blog post first: http://hackucla.com/blog/session-5-android-deep-dive/

##What do I turn in
For beginners you should solve all of the listed short exercises and receive points for completing those. These are unrelated to the project skeleton in this repo. For intermediate/advanced students you can work on the weekly project with your team, and receive points for completing that. You can only get credit for one or the other, but not for both so choose the one most appropriate for your skill level. Please only submit one .zip file per team. Include the contents of your entire android project, and also provide your team access code (Found on Hack School Dashboard) in a text file. Otherwise you will not receive credit! 

##Grading
Submissions will be due 1 week from the session, but we will accept late submissions taking some points for each day it is late. The lateness penalty for an assignment that is submitted between N and N+1 full days late (where N is nonnegative) is 2^N % of the assignment's value. That is, the penalty is 1% for being up to 1 day late, 2% for being from 1 to 2 days late, 4% for being from 2 to 3 days late, and so forth.

##Beginner Exercises

######Exercise 1:
For the first exercise your goal is build a basic ToDo List
* It should have a ListView with an adapter tied to an ArrayList
* It should have a EditText where you can type a new item in
* It should have a Button that when pressed add the current string in the EditText to the ListView 
* Try not to copy the solution provided in the slides, fully attempt it on your own first and then refer to it if stuck.

Extra Credit: 
* Add ability to delete items from the list


######Exercise 2:
For the second part your goal is build a basic timer
* Use the CountDownTimer() discussed in the slides
* Add an EditText that allows you to specify when the timer will go off
* Create a Button that when pressed, begins the timer
* Create a TextView for updating the time as it runs out

Extra Credit: 
* Add another Button the gives user's the ability to pause/play the timer.

######Exercise 3:
Build a basic Activity with a fragment
* Add a Button that when pressed loads the fragment into the activity
* Add another Button that when pressed removes the fragment from the activity

Note: Put all of your exercises into the same android project when submitting

##Intermediate/Advanced Project
The project is for intermediate/advanced students. If you are feeling confident you can attempt to 
complete the project without the skeleton, but it will be a lot easier to use it. We will be uploading the project solution later on, so if you haven't cracked it by then look at the solution to learn the correct implementation.

###Instructions
The goal is to build a pokedex with as little guidance as possible, so try to come up with unique solutions when you run into problems. You're being given lots of flexibility so come up with your own implementation: grading will be very generous. For this project you've been only provided with the image assets for this project, so the goal is to create the rest of the application your self. Here are instruction for each specific screen:

######Main Screen
* Build out a ListView that loads in the appropriate Pokemon based on the row number
* Figure out how to parse the CSV file to get the right Pokemon data. Hint refer to the following link if stuck: http://stackoverflow.com/questions/5360628/get-and-parse-csv-file-in-android
* Each cell should have an ImageView and Textview with the right data loaded 
* When pressed each cell should transition from the current MainActivity into the StatsActivity

######Stats Screen
* This page should recieve the selected Pokemon as a intent extra as well as the stats
* The current stats for weight, height, and exp should be displayed to the user. These are all available in the csv file provided
* There should be a button that allows you to return to the previous page 

###End Product Goal

Main Page
![](https://s3-us-west-1.amazonaws.com/acm-hack-ghost/2017/02/pokedex1--1-.png)

Stats Page
![](https://s3-us-west-1.amazonaws.com/acm-hack-ghost/2017/02/pokedex2--1-.png)
