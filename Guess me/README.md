```markdown
# Guessing Game

This project is a Java-based console application featuring three types of guessing games: guessing a number, guessing a character, and guessing a word. It provides a simple menu-driven interface to choose between these games or exit the application.

## Table of Contents

- [Features](#features)
- [Requirements](#requirements)
- [Installation](#installation)
- [Usage](#usage)
- [Game Classes](#game-classes)
- [License](#license)

## Features

1. **Guess the Number**: Guess a randomly generated number between 1 and 100. Receive hints about how close your guess is to the target number.
2. **Guess the Character**: Guess a randomly chosen character from 'a' to 'z'. Hints are provided based on the proximity to the target character.
3. **Guess the Word**: Guess a randomly selected word from a predefined list. Start by guessing the first letter, then guess the whole word. Hints about the word are provided.

## Requirements

- Java 8 or higher

## Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/gvsrgh/guessing-game.git
   ```

2. Navigate to the project directory:

   ```bash
   cd guessing-game
   ```

3. Compile the Java files:

   ```bash
   javac Guessing_Game/*.java
   ```

## Usage

1. Run the `App` class to start the menu-driven interface:

   ```bash
   java Guessing_Game.App
   ```

2. Choose from the following options:

   - **1**: Guess the Number
   - **2**: Guess the Character
   - **3**: Guess the Word
   - **99**: Exit

3. Follow the on-screen prompts to play the games.

## Game Classes

### `App`

- **Purpose**: Main class that presents the menu and directs to different guessing games.
- **Methods**:
  - `main(String[] args)`: Displays the menu and handles user input to start the appropriate game.

### `Game`

- **Purpose**: Base class for all guessing games.
- **Methods**:
  - `start()`: Prints a generic message indicating the game has started.

### `GuessNumber`

- **Purpose**: Handles the "Guess the Number" game.
- **Methods**:
  - `start()`: Prints a message specific to the number guessing game.
  - `guess()`: Contains the logic for the number guessing game and provides hints.

### `GuessCharacter`

- **Purpose**: Handles the "Guess the Character" game.
- **Methods**:
  - `start()`: Prints a message specific to the character guessing game.
  - `guess()`: Contains the logic for the character guessing game and provides hints.

### `GuessWord`

- **Purpose**: Handles the "Guess the Word" game.
- **Methods**:
  - `start()`: Prints a message specific to the word guessing game.
  - `guess()`: Contains the logic for the word guessing game and provides hints.

---

Feel free to modify or extend the project as needed. Enjoy the games!
```
