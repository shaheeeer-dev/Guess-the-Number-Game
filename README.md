# 🎮 Guess The Number - Java Console Game (OOP Edition)

Welcome to **Guess The Number**, a simple yet fun Java console game where you try to guess the number randomly selected by the computer within 10 attempts.

---

## 🧠 Game Concept

- The computer randomly picks a number between **0 and 100**.
- Your job is to **guess the correct number** within **10 tries**.
- After each guess, you'll get a hint:
  - 🔼 *"Too high!"*
  - 🔽 *"Too low!"*
  - ✅ *"Correct!"*
- Your score is calculated based on how quickly you guess:
  - `Score = 100 - (Number of Guesses × 10)`
- After the game ends, you can choose to **play again**.

---

## 🛠️ How to Run

1. **Clone the repository** or copy the code:
   ```bash
   git clone https://github.com/shaheeeer-dev/Guess-the-Number-Game.git
   cd Guess-the-Number-Game

2. **Compile the program**:
   ```bash
   javac Main.java
   ```

3. **Run the game**:
   ```bash
   java Main
   ```

---

## 📁 Files
- `Main.java` — The main class with game loop logic.
- `Game` — A class that handles number generation, input, and scoring.

---

## 📷 Preview

```
===Guess the Number===
A random number is selected between 0 to 100 by the Computer.
Guess the number within 10 tries.

---New Game---
Enter a number: 50
Too low!
Enter a number: 75
Too high!
Enter a number: 62
Correct! You guessed it right.
You guessed in 3 tries.
Your score: 70
Do you want to play again (yes/no):
```

---

## 🧑‍💻 Author
- Muhammad Shaheer
- 📍 COMSATS University, BSE

---

## 💡 Features to Add (Optional Ideas)
- Difficulty levels (Easy/Medium/Hard)
- High score tracking
- GUI version using JavaFX or Swing
- Multiplayer mode (Player vs Player)

---

## 📃 License

This project is open-source and free to use under the MIT License.

---

Enjoy the game and feel free to contribute or suggest improvements!
