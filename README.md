# GIT #

## What is version control ##

- What it is for
- How it is used
- Who uses it

## Git as a VCS ##

- Git benefits
- DCVS

## Git commands ##

### clone ###

- Create users for gitlab
- Generate rsa keys and add them in settings
- Clone a repository

```bash
git clone <remote_url>
```

### config ###

- Show config for remote repository
- Set user.name
- Set user.email

```bash
git config --global user.name "Justas Ragauskas"
git config --global user.email "justas.ragauskas@tieto.com"
```

- Set aliases
```bash
git config --global alias.st status
git config --global alias.co checkout
git config --global alias.br branch
git config --global alias.up rebase
git config --global alias.ci commit
```

### add ###

- What is working and staging area
- Add files/directories
```bash
git add <file/directory>
```
- Include all files in working version
```bash
git add .
```

### status ###

- Displays status of current working version and staging area
```bash
git status
```

### commit ###

- Committing
- Adding commit message right away
- Adding all files in working copy before committing

```bash
git commit [-a | -m <msg> ]
```

### log ###

- Shows list of previous commits
```bash
git log [--graph [--all] | --stat | --oneline]
```

### .gitignore ###

- Where is it
- How it works

### checkout ###

- Checkout a commit/branch
- Checkout a file at a specified commit
```bash
git checkout <commit> [<file>]
```

### revert ###

- Reverting a commit (in between commits are left as is)
```bash
git revert <commit>
```

### reset ###

- Think before you do

- Resetting a file
```bash
git reset <file>
```
- Resetting staging area
```bash
git reset
```
- Resetting staging area and working copy (be careful)
```bash
git reset --hard
```
- Resetting head to specified commit (extra careful). Never reset public history.
```bash
git reset --hard <commit>
```

### fetch ###

- Retrieve remote branch and commit information without merging
```bash
git fetch <remote>
```

### pull ###

- Pull in changes from remote repository
```bash
git pull <remote>
```

### push ###

- Push changes to remote repository
- If a branch is given, only the branch will be pushed
```bash
git push <remote> [<branch>]
```

### branch ###

- Create a new branch
```bash
git branch <branch_name>
```
- Delete a local branch
```bash
git branch -d <branch_name>
```

### merge ###

- Merge two branches
```bash
git merge <branch>
```
- Abort merging
```bash
git merge --abort
```