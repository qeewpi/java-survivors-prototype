# Java Survivors Prototype

A Vampire Survivors / Megabonk-inspired roguelike game built in Java to practice OOP concepts.

## MVP Features

- Player movement & combat
- Melee weapon system (Sword)
- 5 waves with scaling difficulty
- Level-up system with RNG item rolls
- Stats system (damage, atk speed, cooldown, luck)

## Tech Stack

- **Java** — Core game logic
- **LibGDX** — Game loop, input, rendering
- **ShapeRenderer** — Colored rectangles (no sprites)

## Project Structure

```
src/
├── entities/   # Player, Enemy, LivingEntity + Builder pattern
├── weapons/    # Weapon hierarchy (stub)
├── core/       # LibGDX game class
└── rendering/  # ShapeRenderer wrapper
```

## Current Progress

- **Phase 1: Foundation** — Complete!
  - Interfaces: `Movable`, `Damageable`
  - Classes: `Entity`, `LivingEntity`, `Player`, `Enemy`
  - Builder pattern with self-referential generics

## Project-Specific Coding Rules

Custom rules and workflows in `.agent/` define behaviors for agentic coding tools working on this project.

### Rules (`.agent/rules/`)
| Rule | Purpose |
|------|---------|
| `code-quality.md` | Code standards |
| `documentation.md` | Documentation sync |
| `version-control.md` | Commit conventions |
| `follow-phases.md` | Phase and task adherence |
| `feedback-guidelines.md` | Interaction and teaching style |

### Workflows (`.agent/workflows/`)
| Workflow | Purpose |
|----------|---------|
| `/sync-docs` | Sync documentation |
| `/code-review` | Code review process |
| `/capture-notes` | Capture learning notes |

## Documentation

- [`docs/DESIGN.md`](docs/DESIGN.md) — Architecture & design decisions
- [`docs/TASK.md`](docs/TASK.md) — Development checklist
- [`docs/NOTES.md`](docs/NOTES.md) — Learning notes
