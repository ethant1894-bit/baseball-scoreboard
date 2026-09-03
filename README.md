# Baseball Basic Scoreboard and Controller

This is a scoreboard for baseball that works by creating two windows, one that has the scoreboard (which cannot be adjusted directly)
and the other window which contains all the controls to said scoreboard.

## What has been implemented so far?

Currently, I have only implemented the scoreboard, bases visuals, the ball/strike indicator, the out count, as well as the inning count AND indicator (i.e. whether it is
the top or bottom of said inning). There is also the option to change the Team Abbreviations beign used on the scoreboard.

## What is still in progress?

The bottom section in a slightly darker gray with player stats that handle at-bats and as well as player selection is not implemented yet so all
elements there are non-functional and purely visual for now.

NOTE: I will be trying to make the installation and setup process more straightforward once all features have been implemented.

## Getting Started

### 1. Requirements
I recommend using the IntelliJ IDE (which this was created using).
Ensure that you also have JDK 26 or higher.

### 2. Setting Up

1. Clone the repo.
```git clone https://github.com/ethant1894-bit/baseball-scoreboard.git```

2. Open the project in IntelliJ IDEA.

3. Find the root directory (where pom.xml is).

4. Allow IntelliJ to build files and start indexing; wait as it loads all dependencies.

### 3. Running The App
You will find HelloApplication.java in the project. It is under src/main/java/com.example.baseballscoreboard.
Run HelloApplication.main().

### 4. Run The Bases
As of now, that's it! You should see two windows pop up. You can have them both on the same monitor, have them split between two monitors,
or even use one of the windows and capture it using OBS for a stream.

## Limitations
As of writing this, the window sizes are strictly limited to the ones provided.

Keep in mind that while reset buttons are included, we did not include automatically out detection (for 3 strikes) or automatic inning changes.
The goal is to keep everything manual and as controllable by the operator as possible.
Especially in cases where calls are overturned: e.g. If a strike is overturned, we don't want the operator to have to reset the count if it was automatically cleared
while also having to subtract a count.

#### Author & Contact
Ethan Tino, Computer Science Undergrad (as of 2026)
* Email: ethant1894@gmail.com
* [LinkedIn](https://www.linkedin.com/in/ethan-tino-08849628b/)