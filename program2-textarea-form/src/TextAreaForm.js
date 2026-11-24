/*
 * Program 2: React Form with a Text Area
 * Aim: A controlled text area whose current value is stored in state with
 *      useState and displayed live below the form.
 *
 * Author: Bhavy Shukla (1NT23CS042)
 *
 * ------------------------------------------------------------------
 * THINGS TO INSTALL (one time)
 *   1. Node.js 18 or newer (LTS)  -> https://nodejs.org
 *      Check:  node -v   and   npm -v
 *
 * STEPS TO EXECUTE
 *   1. Open a terminal in this folder:  cd program2-textarea-form
 *   2. Install packages (first time only):
 *        npm install
 *   3. Start the app:
 *        npm start
 *   4. Browser opens at http://localhost:3000
 *      Type in the text area - the text appears below as you type.
 *      (Stop the server with Ctrl + C)
 * ------------------------------------------------------------------
 */
import React, { useState } from "react";

function TextAreaForm() {
  // State that stores the text typed by the user
  const [text, setText] = useState("");

  // Called every time the text area changes
  const handleChange = (event) => {
    setText(event.target.value);
  };

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      <h2>React Form with Text Area</h2>

      <form>
        <label htmlFor="message">Enter your text:</label>
        <br />
        <textarea
          id="message"
          rows="6"
          cols="50"
          value={text}
          onChange={handleChange}
          placeholder="Type something here..."
        />
      </form>

      <h3>Updated value:</h3>
      <p>{text}</p>
    </div>
  );
}

export default TextAreaForm;
