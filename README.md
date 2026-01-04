# Java Survivors Prototype

A Vampire Survivors / Megabonk-inspired roguelike game built in Java to practice OOP concepts.

## 🎮 MVP Features

- Player movement & combat
- Melee weapon system (Sword)
- 5 waves with scaling difficulty
- Level-up system with RNG item rolls
- Stats system (damage, atk speed, cooldown, luck)

## 🛠️ Tech Stack

- **Java** — Core game logic
- **LibGDX** — Game loop, input, rendering
- **ShapeRenderer** — Colored rectangles (no sprites)

## 📁 Project Structure

```
src/
├── entities/   # Player, Enemy, LivingEntity + Builder pattern ✅
├── weapons/    # Weapon hierarchy (stub)
├── core/       # LibGDX game class
└── rendering/  # ShapeRenderer wrapper
```

## ✅ Current Progress

- **Phase 1: Foundation** — Complete!
  - Interfaces: `Movable`, `Damageable`
  - Classes: `Entity`, `LivingEntity`, `Player`, `Enemy`
  - Builder pattern with self-referential generics

## 📚 Learning Goals

- Abstract classes & inheritance
- Interfaces for shared behaviors
- Builder pattern with generics
- Polymorphism in weapon/enemy systems
- Composition (stats, items)

## 📖 Documentation

- [`docs/DESIGN.md`](docs/DESIGN.md) — Architecture & design decisions
- [`docs/TASK.md`](docs/TASK.md) — Development checklist
- [`docs/NOTES.md`](docs/NOTES.md) — Learning notes
