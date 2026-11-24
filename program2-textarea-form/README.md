# Program 2: React Form with a Text Area
**Bhavy Shukla – 1NT23CS042**

A **controlled** text area: its value is stored in state with `useState` and displayed live below the form as you type.

## Things to install (one time)
| Tool | Version | Download | Check |
|---|---|---|---|
| Git | any | https://git-scm.com/downloads | `git --version` |
| Node.js (includes npm) | 18+ (LTS) | https://nodejs.org | `node -v`, `npm -v` |

## Get the code
This program is one folder of the **FSD-Lab-Programs** repo (all 6 programs are in it).
```bash
git clone https://github.com/Bhavy2809/FSD-Lab-Programs.git
cd FSD-Lab-Programs/program2-textarea-form
```
Later, to get updates (run inside `FSD-Lab-Programs`): `git pull`

## Run
```bash
npm install      # first time only
npm start        # opens http://localhost:3000
```
Stop with `Ctrl + C`.

## Expected output
A text area titled **"React Form with Text Area"**. Whatever you type appears instantly under **"Updated value:"**.

## Files
```
package.json            React + react-scripts dependencies, "npm start" script
public/index.html       page with <div id="root">
src/index.js            renders <TextAreaForm /> into #root
src/TextAreaForm.js     the program (useState + onChange)
```

## Common problems
| Problem | Fix |
|---|---|
| `npm` is not recognized | Install Node.js, then reopen the terminal |
| Port 3000 already in use | Stop the other app, or press `Y` to use another port |
| Blank page | Check the terminal for errors; run `npm install` in this folder |
