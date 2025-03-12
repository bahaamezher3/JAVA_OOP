# 2048 Game in C++

## 🕹️ About the Project
This is a simple **console-based** version of the **2048 game** written in C++. It allows players to move tiles using **W/A/S/D** keys and combines matching numbers until they reach **2048**. The game keeps track of your **score** and determines if you have **won or lost**.

---

## 🔧 Features
✅ **Classic 2048 Gameplay** – Slide and merge tiles to reach 2048!  
✅ **Random Tile Generation** – New tiles (2 or 4) appear after each move.  
✅ **Score Tracking** – Keep track of your progress.  
✅ **Win & Lose Conditions** – Game recognizes when you **win (2048)** or **lose (no more moves).**  
✅ **Simple Console UI** – Clean and readable output.  

---

## 🎮 How to Play
1. Run the program.
2. Use the following keys to move tiles:
   - **W** → Move **Up**
   - **A** → Move **Left**
   - **S** → Move **Down**
   - **D** → Move **Right**
   - **Q** → Quit the game
3. Try to reach **2048** before running out of moves!

---

## 🚀 Getting Started
### Prerequisites
Make sure you have **C++** installed on your system. If using **Visual Studio**, ensure you have the **Desktop development with C++** workload installed.

### Cloning the Repository
```sh
git clone https://gitlab.com/your-repo-link.git
cd 2048-cpp
```

### Compiling the Code
If using **g++**:
```sh
g++ -o 2048 main.cpp board.cpp game.cpp
./2048
```
If using **Visual Studio**:
1. Open **Visual Studio**.
2. Create a **New C++ Console Project**.
3. Add `board.cpp`, `board.hpp`, `game.cpp`, `game.hpp`, and `main.cpp` to the project.
4. Click **Build & Run**.

---

## 📁 Project Structure
```
/2048-cpp
│── main.cpp      # Game entry point
│── board.hpp     # Board class header
│── board.cpp     # Board logic (grid, movement, merging)
│── game.hpp      # Game class header
│── game.cpp      # Game loop and user input
│── README.md     # Documentation (this file)
```

---

## 🛠️ Code Breakdown
### **Board Class (`board.cpp, board.hpp`)**
- **Handles the game grid** (4x4 matrix).
- Implements **tile movement (up, down, left, right)**.
- Checks for **valid moves, win/loss conditions**.
- Adds **random tiles (2 or 4) after each move**.

### **Game Class (`game.cpp, game.hpp`)**
- Runs the **game loop**.
- Accepts **user input (W/A/S/D/Q)**.
- Displays the **current board state**.
- Determines **game over & win conditions**.

### **Main (`main.cpp`)**
- Starts the game.
- Welcomes the player & takes input.
- Calls **`game.run()`** to begin the loop.

---

## 🏆 Winning the Game
To win, you need to **merge tiles until you reach 2048**. You can continue playing for a higher score after winning.

---

## 📝 Future Improvements
- ✅ Better UI (maybe a **colorful terminal version with ncurses**).
- ✅ Save & load game progress.
- ✅ Add an **AI solver** to suggest best moves.

---

## 👨‍💻 Author
📌 Developed by **[Your Name]**
📌 GitLab Repository: [GitLab Link](https://gitlab.com/your-repo-link)

Happy gaming! 🎮🔥

