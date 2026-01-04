# Java Survivors Prototype

A Vampire Survivors / Megabonk-inspired roguelike game built in Java to practice OOP concepts.

## 🎮 MVP Features

- Player movement & combat
- Melee weapon system (Sword)
- 5 waves with scaling difficulty
- Level-up system with RNG item rolls
- Stats system (damage, atk speed, cooldown, luck)

## 📁 Project Structure

```
src/
├── game/       # Main game loop and state
├── entities/   # Player, Enemy, Entity base class
├── weapons/    # Weapon hierarchy
├── items/      # Stat boost items
└── systems/    # Wave manager, stats manager
```

## 🚀 Getting Started

```bash
# Compile
javac -d out src/**/*.java

# Run
java -cp out game.Game
```

## 📚 Learning Goals

- Abstract classes & inheritance
- Interfaces for shared behaviors
- Polymorphism in weapon/enemy systems
- Composition (stats, items)
