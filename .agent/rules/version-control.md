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
