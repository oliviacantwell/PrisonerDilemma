# Prisoner's Dilemma (With Money)
## Overview
This program is the first step of a mobile application to use for educational purposes.
It first asks the user if they want to steal money or split money with the opponent. 
The opponent's decision for now is randomly generated.
The decision of the opponent and the user will determine how much money (if any) both of them will get.
At the end of the rounds, whoever has the most money wins. To describe the formula behind the division of money,
see the picture below.

![image](https://user-images.githubusercontent.com/90710048/139566723-43096c81-64de-49ea-a5e9-ce3dca7699ce.png)


[Software Demo Video](https://youtu.be/T4yKguNrnpg)

## Development Environment
This was written in Kotlin in Intellij.
I used the "java.util" library to use the Scanner in order to get just a char 
from the user and convert it to a lowercase.

## Useful Websites
* [Kotlin CrashCourse with Traversy Media](https://www.youtube.com/watch?v=5flXf8nuq60&t=2381s)
* [W3 Schools](https://www.w3schools.com/kotlin/index.php)

## Future Work
* Make it two player. First I want the users to play on the same device, 
 but I will eventually use FireBase or FireStore to enable seperate devices.
* The next step in this project is to make it into a mobile app
* Finally, I want to polish it and adapt it so that I may present it to the 
philosophy and economics department for their use
