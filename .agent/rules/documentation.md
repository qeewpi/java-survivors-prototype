---
trigger: always_on
glob:
description: Documentation rules - sync project docs proactively
---

# Source of Truth
- Project docs (docs/) = persistent master source
- Brain artifacts = conversation-specific, populated FROM docs

# Rules
- Update project docs after significant changes
- Use Conventional Commits - feat:, docs:, refactor:
- After design changes - Update docs, commit, push
- Don't overwrite docs with conversation-specific artifact content
