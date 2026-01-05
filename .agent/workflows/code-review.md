---
description: Review user-written code and provide feedback
---

# Code Review Workflow

When user asks to check/review their code:

## Steps

1. **View the file** to see current state
2. **Check for correctness** — Does it compile? Logic errors?
3. **Check for style** — Naming, formatting, duplication
4. **Check alignment** — Does it match DESIGN.md specs?

## Feedback Format

### ✅ Good
- List what's correct

### 🔍 Questions
- Ask clarifying questions about design choices
- Don't fix — hint at issues

### 💡 Suggestions (Optional)
- Only if obvious improvement exists
- Frame as questions: "Could this be simplified to...?"

## After Review

1. Update `docs/TASK.md` if item is complete
2. Update `docs/DESIGN.md` if architecture changed
3. Commit with Conventional Commits format
