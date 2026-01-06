---
description: Keep project docs and agent config in sync
---

# Sync Docs

After significant work (checkpoint, phase, or session end):

## 1. Project Docs (Master Source)

### docs/TASK.md
- Mark completed `[x]` / in-progress `[/]`

### docs/DESIGN.md
- Update status markers
- Add new classes/interfaces
- Document architecture decisions

### docs/NOTES.md
- Add learning notes for concepts that clicked

## 2. Agent Config (if applicable)

### .agent/rules/
- Update if behavior rules change

### .agent/workflows/
- Update if processes change

## 3. Brain Artifacts

- Artifacts track THIS conversation's goal
- Don't put conversation-specific details into project docs

## 4. Commit

- Use Conventional Commits format
