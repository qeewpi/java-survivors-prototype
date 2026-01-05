---
description: Keep project documentation in sync as work progresses
---

# Documentation Sync Workflow

After completing any significant work (completing a task, finishing a phase, or ending a session), update the following:

## Required Updates

### 1. Project Docs (`docs/`)

#### `docs/TASK.md`
- Mark completed items with `[x]`
- Mark in-progress items with `[/]`
- Add new sub-tasks if scope expanded

#### `docs/DESIGN.md`
- Update status markers (📋 Planned → ✅ Done)
- Add new classes/interfaces to package structure
- Document any architecture decisions made

#### `docs/NOTES.md`
- Add learning notes for new patterns/concepts used
- Document any "gotchas" or tricky implementations

### 2. Brain Artifacts

Keep these in sync with project docs:

- `task.md` — Mirror of `docs/TASK.md`
- `implementation_plan.md` — Mirror of `docs/DESIGN.md`

## When to Sync

- ✅ After completing a phase
- ✅ After implementing a new class/feature
- ✅ Before ending a session
- ✅ When asked to "resume" work (read docs first!)

## Why This Matters

New conversations don't have access to previous session artifacts. Project docs are the **only** persistent context across sessions.
