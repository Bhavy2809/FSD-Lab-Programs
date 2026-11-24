# Program 3: Input Validation using useEffect
**Bhavy Shukla – 1NT23CS042**

Validates a username every time it changes, using `useEffect`, and shows instant feedback in **green** (valid) or **red** (invalid).

Rules: at least 5 characters; only letters, digits and underscore.

## Things to install (one time)
| Tool | Version | Download | Check |
|---|---|---|---|
| Git | any | https://git-scm.com/downloads | `git --version` |
| Node.js (includes npm) | 18+ (LTS) | https://nodejs.org | `node -v`, `npm -v` |

## Get the code
This program is one folder of the **FSD-Lab-Programs** repo (all 6 programs are in it).
```bash
git clone https://github.com/Bhavy2809/FSD-Lab-Programs.git
cd FSD-Lab-Programs/program3-input-validation
```
Later, to get updates (run inside `FSD-Lab-Programs`): `git pull`

## Run
```bash
npm install      # first time only
npm start        # opens http://localhost:3000
```
Stop with `Ctrl + C`.

## Expected output
| Type this | Message | Colour |
|---|---|---|
| *(empty)* | Please enter a username | red |
| `abc` | Username must be at least 5 characters long | red |
| `ab cd!` | Only letters, digits and underscore are allowed | red |
| `bhavy_42` | Valid username | green |

## Files
```
package.json            React + react-scripts dependencies, "npm start" script
public/index.html       page with <div id="root">
src/index.js            renders <ValidatedInput /> into #root
src/ValidatedInput.js   the program (useState + useEffect with [username])
```

## Common problems
| Problem | Fix |
|---|---|
| `npm` is not recognized | Install Node.js, then reopen the terminal |
| Port 3000 already in use | Stop the other app, or press `Y` to use another port |
| Blank page | Check the terminal for errors; run `npm install` in this folder |
