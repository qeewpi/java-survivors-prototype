---
description: Keep project docs and agent config in sync
---

# Documentation Sync Workflow

After significant work (checkpoint, phase, or session end):

## 1. Project Docs (Master Source)

### docs/TASK.md
- Mark completed [x] / in-progress [/]

### docs/DESIGN.md
- Update status markers
- Add new classes/interfaces
- Document architecture decisions

### docs/NOTES.md
- Add learning notes for concepts struggled with

## 2. Agent Config (if applicable)

### .agent/rules/
- Update if behavior rules change

### .agent/workflows/
- Update if processes change
- This workflow is recursive - if the workflow itself changes, update it

## 3. Brain Artifacts (Conversation-Specific)

Artifacts track THIS conversation's goal.
- Don't put conversation-specific details into docs

## When to Sync

- After completing a phase/checkpoint
- After any major change needing alignment
- Before ending a session

## Why This Matters

Project docs capture the project state at any point in time.
