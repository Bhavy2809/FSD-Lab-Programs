/*
 * Program 1: React - Scholarship Analysis - Student Counter
 * Aim: Counts students with Distinction (85% and above) and First Class
 *      (60% to below 85%) from a list of 30 percentages and shows each
 *      student's category in a table.
 *
 * Author: Bhavy Shukla (1NT23CS042)
 *
 * ------------------------------------------------------------------
 * THINGS TO INSTALL (one time)
 *   1. Node.js 18 or newer (LTS)  -> https://nodejs.org
 *      Check:  node -v   and   npm -v
 *
 * STEPS TO EXECUTE
 *   1. Open a terminal in this folder:  cd program1-scholarship-counter
 *   2. Install packages (creates node_modules, first time only):
 *        npm install
 *   3. Start the app:
 *        npm start
 *   4. Browser opens at http://localhost:3000
 *      Expected: Total students 30, Distinction 9, First Class 15
 *      (Stop the server with Ctrl + C)
 * ------------------------------------------------------------------
 */
import React, { useState } from "react";

// Percentages of the 30 students in the class
const percentages = [
  92, 88, 85, 79, 67, 54, 91, 73, 60, 45,
  86, 62, 58, 95, 70, 84.5, 49, 77, 81, 65,
  38, 89, 72, 60.5, 85, 56, 68, 74, 90, 63,
];

function App() {
  const [students] = useState(percentages);

  // Distinction: 85% and above
  const distinction = students.filter((p) => p >= 85).length;

  // First class: 60% to 84% (below 85)
  const firstClass = students.filter((p) => p >= 60 && p < 85).length;

  const getClass = (p) => {
    if (p >= 85) return "Distinction";
    if (p >= 60) return "First Class";
    return "-";
  };

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      <h2>Scholarship Analysis - Student Counter</h2>
      <p>Total students: {students.length}</p>
      <h3>Distinction (85% and above): {distinction}</h3>
      <h3>First Class (60% to 84%): {firstClass}</h3>

      <table border="1" cellPadding="6">
        <thead>
          <tr>
            <th>Student No.</th>
            <th>Percentage</th>
            <th>Category</th>
          </tr>
        </thead>
        <tbody>
          {students.map((p, i) => (
            <tr key={i}>
              <td>{i + 1}</td>
              <td>{p}</td>
              <td>{getClass(p)}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default App;
