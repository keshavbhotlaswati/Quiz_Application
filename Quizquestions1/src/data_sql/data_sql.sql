 create database questionquiz;
use questionquiz;
 
 CREATE TABLE USER 
(
ID INT NOT NULL AUTO_INCREMENT,
FIRST_NAME VARCHAR(20),
LAST_NAME VARCHAR(20),
EMAIL VARCHAR(20),
PASSWORD VARCHAR(256), 
PRIMARY KEY (ID),
UNIQUE KEY (EMAIL)
);

create table question(
id int not null auto_increment,
question varchar(500) not null,
primary key(id),
choice1 varchar(500),
 choice2 varchar(500),
 choice3 varchar(500),
 choice4 varchar(500),
 correct_answer int,
 chosen_answer int,
 comment varchar(500)

);

 create table result1 (
 id int not null auto_increment,
user_name varchar(20),
 result int ,
 PRIMARY KEY (id),
 total_wrong int,
 total_correct int,
 number_of_questions_attempted int
 
 );


/*insert statements*/
insert into question values(1,'The ""Eat the Frog" is one of simplest yet most effective productivity techniques
around. What is the "frog" in "Eat the Frog"? *','An or a set of easy tasks on your "to do" list'," Your hardest, most important task for the day","Your manager's latest burning ask from you","An actual frog",2,-1,"The “Frog” is also known as your Most Important Task (MIT). This task is often important but not urgent, the type of 
difficult task that creates a lot of mental resistance and ensuing procrastination if you don't intentionally make time for 
it. You probably already know the task I’m talking about.");
insert into question values(2,'When do you "eat the frog" i.e. do the most important task for the day? *','First thing in the morning',"During an empty slot in the calendar"," At night, when there are no distractions
",1,-1,"We all know intuitively that not all work hours are created equal. The first hour of the morning when your energy and 
willpower are high is a helluva lot more productive than the hour after lunch when all you want to do is curl up and take 
a nap. Eat the Frog ensures that you’re using your best hours to do your most mentally taxing work and leaves less 
important tasks for times when you’ve already exhausted your brain power for the day.");
insert into question values(3,".What should be size of the task that you choose as your frog?","A task you can complete in 30-60 mins"," A task you can complete in 1-4 hours
","A task you can complete in less that 30 min","A task you can complete in 4-8 hours
",2,-1,"Your frog should take half a day’s work, tops. A clearly defined, realistic task will make it easier to get started and not 
procrastinate on. Checking it off your list before lunch will give you a concrete win and accompanying endorphin boost 
to carry you into the rest of your day.");
insert into question values(4,'Why should you "eat the frog" first thing in the morning? ',"So that you can take the rest of the day off"," So that you can eat another frog in the afternoon","So that you have the whole day to complete the task
","So that your most important task gets prioritized first",4,-1,"Whatever your frog for the day happens to be, do it first thing when you sit down to work. If at all possible, don’t 
schedule meetings. Don’t catch up on Twitter. Don’t check your email. Don’t even think about thinking about all the 
other less important things you’ll have to do later in the day. Focus all of your mental energy on your frog and only your 
frog.");
insert into question values(5,'How frequently should you "eat the frog"? ',"Once every week"," Once every fortnight","Dail","Whenever you need",3,-1,"Any day that you eat your frog is a good day. Furthermore, following the method means you’ll be making progress on 
something meaningful on a daily basis. Studies have shown that that kind of progress is a key motivator and predictor of 
happiness and engagement at work, and can lead to a virtuous cycle of getting things done. We feel good when we 
follow through on the things we intended to do which in turn makes it easier to continue doing them. When you 
experience a win first thing in the morning, you’re more likely to build momentum and good vibes to carry you through 
the rest of your workday.");
insert into question values(6,"What important habit does eat the frog help you develop?","Time management"," Multi-tasking","Prioritization","Deep work",4,-1,"The most valuable work in today’s knowledge economy is almost invariably work that requires all your mental resources 
to be focused on one thing — think cognitively demanding tasks like coding, designing, writing, strategizing, and 
problem-solving. Yet the modern workplace isn’t set up to support that kind of distraction-free “deep work” (a phrase 
coined by computer science professor Cal Newport). We’re distracted by so many emails, meetings, chat messages and 
requests for input that we don’t have the time or space to focus on our highest impact tasks.
Eat The Frog requires us to push back against all of those distractions — both external (others interrupting us) and 
internal (us interrupting ourselves) — and prioritize the actions that will actually bring us closer to our goals");