/*
 * Program 3: Input Validation using useEffect
 * Aim: Validates a username on every change using useEffect and shows
 *      instant feedback in green or red.
 *
 * Author: Bhavy Shukla (1NT23CS042)
 *
 * ------------------------------------------------------------------
 * THINGS TO INSTALL (one time)
 *   1. Node.js 18 or newer (LTS)  -> https://nodejs.org
 *      Check:  node -v   and   npm -v
 *
 * STEPS TO EXECUTE
 *   1. Open a terminal in this folder:  cd program3-input-validation
 *   2. Install packages (first time only):
 *        npm install
 *   3. Start the app:
 *        npm start
 *   4. Browser opens at http://localhost:3000
 *      Try: "abc" (too short, red), "ab cd!" (invalid chars, red),
 *           "bhavy_42" (valid, green).
 *      (Stop the server with Ctrl + C)
 * ------------------------------------------------------------------
 */
import React, { useState, useEffect } from "react";

function ValidatedInput() {
  const [username, setUsername] = useState("");
  const [message, setMessage] = useState("Please enter a username");
  const [isValid, setIsValid] = useState(false);

  // Runs every time 'username' changes -> instant validation feedback
  useEffect(() => {
    if (username.length === 0) {
      setMessage("Please enter a username");
      setIsValid(false);
    } else if (username.length < 5) {
      setMessage("Username must be at least 5 characters long");
      setIsValid(false);
    } else if (!/^[A-Za-z0-9_]+$/.test(username)) {
      setMessage("Only letters, digits and underscore are allowed");
      setIsValid(false);
    } else {
      setMessage("Valid username");
      setIsValid(true);
    }
  }, [username]);

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      <h2>Input Validation using useEffect</h2>
      <input
        type="text"
        value={username}
        onChange={(e) => setUsername(e.target.value)}
        placeholder="Enter username"
        style={{ padding: "8px", width: "250px" }}
      />
      <p style={{ color: isValid ? "green" : "red" }}>{message}</p>
    </div>
  );
}

export default ValidatedInput;
