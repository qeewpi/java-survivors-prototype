---
trigger: always_on
glob:
description: Version control best practices
---

# Atomic Commits
- One task per commit
- Separate commits for separate tasks
- Easy to track one particular change

# Conventional Commits
Format: <type>(<optional scope>): <description>

## Types
- feat: add/adjust/remove a feature
- fix: bug fix
- refactor: restructure code without changing behavior
- perf: performance improvement (special refactor)
- style: formatting, whitespace, no behavior change
- test: add/correct tests
- docs: documentation only
- build: build tools, dependencies, version
- ops: infrastructure, CI/CD, deployment
- chore: maintenance tasks (.gitignore, init)

## Breaking Changes
Use ! before colon: feat(api)!: remove endpoint

# Commit Prompting
After making file changes, ask user if they want to commit:
- Only prompt when changes form a complete, atomic unit of work
- Don't prompt for partial/incomplete changes mid-task
- Suggest appropriate commit type and message based on changes
- Wait for user confirmation before committing
