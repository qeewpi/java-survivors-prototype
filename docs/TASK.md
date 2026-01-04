# Java Survivors Prototype - Task Checklist

## Phase 1: Foundation (MVP) ✅
- [x] Project setup & package structure
- [x] Core interfaces (`Movable`, `Damageable`)
- [x] `Entity` abstract class
- [x] `LivingEntity` abstract class (implements Damageable)
- [x] `Player` class with `PlayerStats`
- [x] `Enemy` class with `EnemyTier` enum
- [x] **Builder pattern** for `LivingEntity`, `Player`, `Enemy`

## Phase 2: Combat System
- [/] Weapon hierarchy (`Weapon` → `MeleeWeapon` → `Sword`) *(stub created)*
- [ ] Attack/damage mechanics
- [ ] Collision detection

## Phase 3: Progression
- [ ] Level-up system
- [ ] RNG item/upgrade rolls
- [ ] Item pickup system
- [ ] Stats as multipliers

## Phase 4: Wave System
- [ ] Wave manager (5 waves for MVP)
- [ ] Difficulty scaling (density, enemy types)
- [ ] Wave completion/transition

## Phase 5: Game Loop
- [ ] Main game loop
- [ ] Rendering (basic/console or simple graphics)
- [ ] Input handling
- [ ] Game state management
