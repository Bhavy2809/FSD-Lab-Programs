# Program 1: React – Scholarship Analysis (Student Counter)
**Bhavy Shukla – 1NT23CS042**

Counts students with **Distinction (85% and above)** and **First Class (60% to below 85%)** from a list of 30 percentages, and shows each student's category in a table.

## Things to install (one time)
| Tool | Version | Download | Check |
|---|---|---|---|
| Git | any | https://git-scm.com/downloads | `git --version` |
| Node.js (includes npm) | 18+ (LTS) | https://nodejs.org | `node -v`, `npm -v` |

## Get the code
This program is one folder of the **FSD-Lab-Programs** repo (all 6 programs are in it).
```bash
git clone https://github.com/Bhavy2809/FSD-Lab-Programs.git
cd FSD-Lab-Programs/program1-scholarship-counter
```
Later, to get updates (run inside `FSD-Lab-Programs`): `git pull`

## Run
```bash
npm install      # first time only (downloads React into node_modules)
npm start        # opens http://localhost:3000
```
Stop with `Ctrl + C`.

## Expected output
- Total students: **30**
- Distinction (85% and above): **9**
- First Class (60% to 84%): **15**
- A table with Student No., Percentage and Category for all 30 students

## Files
```
package.json        React + react-scripts dependencies, "npm start" script
public/index.html   page with <div id="root">
src/index.js        renders <App /> into #root
src/App.js          the program (useState, filter, map)
```

## Common problems
| Problem | Fix |
|---|---|
| `npm` is not recognized | Install Node.js, then reopen the terminal |
| Port 3000 already in use | Stop the other app, or press `Y` to use another port |
| Blank page | Check the terminal for errors; run `npm install` in this folder |
