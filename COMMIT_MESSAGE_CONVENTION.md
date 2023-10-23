# Commit Message Convention

${issue} ${type}(${scope}): ${subject}

# Issue(Optional)
- If your commit is related to an issue, you can add the issue number in the commit message.
  - eg: `#1234` or `#1234,#1235` or `#1234,#1235,#1236`

# Type
- `build` : Changes related to building the code (e.g. adding npm dependencies or external libraries).
- `chore`: Changes that do not affect the external user (e.g. updating the .gitignore file or .prettierrc file).
- `feat`: A new feature.
- `fix`: A bug fix.
- `docs`: Documentation a related changes.
- `refactor`: A code that neither fix bug nor adds a feature. (eg: You can use this when there is semantic changes like renaming a variable/ function name).
- `release` : A code that is related to release.
- `perf`: A code that improves performance style: A code that is related to styling.
- `test`: Adding new test or making changes to existing test

# Scope(Optional)
- Scope is the name of the section(eg)  of the codebase that the changes are made.
  - eg: `member`, `profile`, `setup`, `release`, ...

# Subject
- The subject contains succinct description of the change.