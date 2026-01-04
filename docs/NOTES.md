# Learning Notes

## Builder Pattern

- **Why static?** — Create builder without instance of outer class
- **Why abstract?** — Only subclass builders have `build()`

## Self-Referential Generic: `<T extends Builder<T>>`

**Breaking it down:**
- `Builder<T>` — "T is what methods will return"
- `T extends Builder<T>` — "T must be a Builder type" (constraint)
- The recursion ensures T returns itself, enabling proper chaining

**Why the constraint?**
- Without it: `Builder<String>` would be valid (wrong!)
- With it: only `Builder<PlayerBuilder>` works (correct!)

**In practice:**
- `Player.Builder extends Builder<Player.Builder>` → "I am T, return me"

## `protected abstract T self()`

- Returns `this` with the correct subclass type
- Needed because `return this` would return `LivingEntity.Builder` not `Player.Builder`
- Each subclass overrides: `return this;`

## Wildcard `<?>` vs Type Parameter `<T>`

- `Builder<?>` — "any Builder, I don't care which type"
- `Builder<T>` — "specific Builder where I need to use T"
- Constructor uses `<?>` because it only reads values, doesn't return T

## Subclass Builder (Player.Builder)

- `extends LivingEntity.Builder<Builder>` — inherit parent methods, specify return type
- `self()` returns `this` — enables parent methods to return correct type
- `build()` calls `new Player(this)` — passes builder to Player constructor so it can extract values
