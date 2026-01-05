---
trigger: always_on
glob:
description: Documentation sync rules
---

# Source of Truth
- Project docs (docs/) = persistent master source
- Brain artifacts = conversation-specific

# Rules
- Update project docs after significant changes
- Use Conventional Commits - feat:, docs:, refactor:
- After design changes - Update docs, commit, push
- Don't put conversation-specific details into docs
